package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    /*
   
    Essa classe será responsável pela persistecia de dados
    das especialidades, por exemplo,adicionar uma nova especialidade
    excluir uma espeilaidade, etc.
    
     */
    
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar (PlanoDeSaude p) {
    planoDeSaude.add(p);
    }
    
    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude (Integer codigo) {
        
        for (PlanoDeSaude p : planoDeSaude) {
            if(p.getCodigo() == codigo) {
                return p;
            }
         
        }
        return null;
    }
    
    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {  // UPDATE
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo() == planoDeSaudeAtualizado.getCodigo()) {
                planoDeSaude.set(planoDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
    }
    
    public static void excluir(Integer codigo) {  //DELETE

        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo() != codigo) {
                planoDeSaude.remove(p);
                break;
            }
        }
    }
    
    
    //Criar uma lista inicial de planos de saúde
    public static void criarListaDePlanoDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude(
                "Amil", 
                "Ouro", 
                LocalDate.of(2022, Month.AUGUST, 19),
                "2024");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed",
                "Prata", LocalDate.of(2024, Month.MARCH, 25),
                "4654 ");
        PlanoDeSaude p3 = new PlanoDeSaude("NotreDame",
                "Bronze",
                LocalDate.of(2025, Month.SEPTEMBER, 15),
                "1456");
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco",
                "Ouro",
                LocalDate.of(2026, Month.JANUARY, 12),
                "7832");
    }
    
        public static DefaultTableModel getTabelaPlanoDeSaude() {
        
        String[] titulo = {"CODIGO", "NÚMERO", "OPERADORA", "CATEGORIA"};
        String[][] dados = new String[planoDeSaude.size()][3];
        
        
        for (PlanoDeSaude p : planoDeSaude){
            int i = 0;
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getCategoria();
            dados[i][2] = p.getNumero();
            dados[i][3] = p.getOperadora();
        }
        
        return new DefaultTableModel(dados, titulo);
           
    }

}

