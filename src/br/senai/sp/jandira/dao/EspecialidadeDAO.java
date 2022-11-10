package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282212\\Desktop\\FPOO\\Eclipse\\eclipse-workspace\\clinica\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    /*
   
    Essa classe será responsável pela persistecia de dados
    das especialidades, por exemplo,adicionar uma nova especialidade
    excluir uma espeilaidade, etc.
    
     */
    
    private static ArrayList<Especialidade> especialidade = new ArrayList<>();

    public static void gravar(Especialidade e) {   // CREATE
        especialidade.add(e);
        
        //*** GRAVAR EM ARQUVO ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecialidadeSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
    }

    public static ArrayList<Especialidade> getEspecialidades() {  //READ
        return especialidade;
    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade e : especialidade) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {  // UPDATE
        for (Especialidade e : especialidade) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidade.set(especialidade.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) {  //DELETE

        for (Especialidade e : especialidade) {
            if (e.getCodigo() == codigo) {
                especialidade.remove(e);
                break;
            }
        }
    }
    
    //Criar uma lista inicial de especialidade
    public static void criarListaDeEspecialidade(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while (linha != null) {
                
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));
                
                //Guardar a especialidade na lista
                especialidade.add(e);
                
                // Ler a proxima linha
                linha = leitor.readLine();
            }
            
            // Fechar o arquivo
            leitor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }
        
    }
    
    public static DefaultTableModel getTabelaEspecialidades() {
        
        String[] titulo = {"CODIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidade.size()][3];
        
        
        for (Especialidade e : especialidade){
            int i = especialidade.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();  
        }
        
        return new DefaultTableModel(dados, titulo);
           
    }
    
}
