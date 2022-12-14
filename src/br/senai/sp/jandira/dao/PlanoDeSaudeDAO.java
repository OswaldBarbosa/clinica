package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Users\\22282212\\Desktop\\FPOO\\Eclipse\\eclipse-workspace\\clinica\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282212\\Desktop\\FPOO\\Eclipse\\eclipse-workspace\\clinica\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    /*
   
    Essa classe será responsável pela persistecia de dados
    das especialidades, por exemplo,adicionar uma nova especialidade
    excluir uma espeilaidade, etc.
    
     */
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) {
        planoDeSaude.add(p);

        //*** GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {  // UPDATE
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(planoDeSaudeAtualizado.getCodigo())) {
                planoDeSaude.set(planoDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }

        atualizaArquivo();
    }

    public static void excluir(Integer codigo) {  //DELETE

        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                planoDeSaude.remove(p);
                break;
            }
        }

        atualizaArquivo();

    }

    private static void atualizaArquivo() {

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

            //Iterar na lista para adicionar os planos de saúde
            //no arquivo temporário, exceto o registro não queremos mais
            for (PlanoDeSaude p : planoDeSaude) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

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
    public static void criarListaDePlanoDeSaude() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                String[] data = vetor[4].split("/");

                PlanoDeSaude p = new PlanoDeSaude(vetor[2],
                        vetor[3],
                        LocalDate.of(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0])),
                        vetor[1],
                        Integer.valueOf(vetor[0]));

                //Guardar a especialidade na lista
                planoDeSaude.add(p);

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

    public static DefaultTableModel getTabelaPlanoDeSaude() {

        String[] titulo = {"CODIGO", "NÚMERO", "OPERADORA", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planoDeSaude.size()][5];

        int i = 0;

        for (PlanoDeSaude p : planoDeSaude) {
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            dados[i][4] = p.getDataFormatada();
            i++;
        }

        return new DefaultTableModel(dados, titulo);

    }

}
