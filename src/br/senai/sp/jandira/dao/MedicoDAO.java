package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282212\\Desktop\\FPOO\\Eclipse\\eclipse-workspace\\clinica\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282212\\Desktop\\FPOO\\Eclipse\\eclipse-workspace\\clinica\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    /*
   
    Essa classe será responsável pela persistecia de dados
    das especialidades, por exemplo,adicionar uma nova especialidade
    excluir uma espeilaidade, etc.
    
     */
    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico m) {
        medico.add(m);

        //GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<Medico> getMedico() {
        return medico;
    }

    public static Medico getMedico(Integer codigo) {

        for (Medico m : medico) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }

        return null;
    }

    public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico m : medico) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medico.set(medico.indexOf(m), medicoAtualizado);
                break;
            }
        }
        
        atualizarArquivo();

    }
    
        public static void excluir(Integer codigo) {  //DELETE

        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                medico.remove(m);
                break;
            }
        }

        atualizarArquivo();

    }

    private static void atualizarArquivo() {

        // PASSO 01 - Criar uma representação dos arquivos que  serão manipulado
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo temporário
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar os médicos
            //no arquivo temporário, exceto o registro não queremos mais
            for (Medico m : medico) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            //Fechar arquivo
            bwTemp.close();

            //Excluir arquivo atual
            arquivoAtual.delete();

            //Renomear arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    //Criar uma lista inicial de planos de saúde
    public static void criarListaDeMedico() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");

                Medico m = new Medico(Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3]);

                //Guardar a especialidade na lista
                medico.add(m);

                // Ler a proxima linha
                linha = leitor.readLine();

            }

            // Fechar o arquivo
            leitor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
    }

    public static DefaultTableModel getTabelaMedico() {

        String[] titulo = {"CODIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medico.size()][4];

        int i = 0;

        for (Medico m : medico) {
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefoneMedico();
            i++;
        }

        return new DefaultTableModel(dados, titulo);
    }
    
}
