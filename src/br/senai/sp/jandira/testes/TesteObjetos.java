package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("Cardiologia");
        // e1.setNome("Cardiologia");
        e1.setDescricao("Cuida do coração");

        Especialidade e2 = new Especialidade("Gastroentrelogia");
        // e2.setNome("Gastroentrelogia");
        e2.setDescricao("Cuida do estamago");

        // JOptionPane.showMessageDialog(null, e1);
        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa");
        
        Especialidade e4 = new Especialidade();
        e4.setNome("Ginecologista");
        
         Especialidade e5 = new Especialidade();
        e4.setNome("Medicologia");
        
        
        
        // JOptionPane.showMessageDialog(null, e1.getNome());
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        especialidades.add(e5);
        System.out.println(especialidades.size());
        
        //Exibir o numero de especialidades até agora
        System.out.println("numero do contador " + e1.getContador());
        System.out.println(e1.getCodigo() + "-" + e1.getNome());
        System.out.println(e2.getCodigo() + "-" + e2.getNome());
        System.out.println(e3.getCodigo() + "-" + e3.getNome());    
        System.out.println(e4.getCodigo() + "-" + e4.getNome());
        System.out.println(e5.getCodigo() + "-" + e5.getNome());

        System.out.println("");
        System.out.println("");
        // imprimir nome das epsecialidades
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // utilização do for para iteração
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        System.out.println();

        System.out.println();
        //Usando for each
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        System.out.println();
        System.out.println();
        System.out.println("--------OPERADORAS--------");
        //Criar três planos de saude, aramazenar
        //em arraylist e exibir o nome de cada um deles

        PlanoDeSaude p1 = new PlanoDeSaude("Unimed");
        PlanoDeSaude p2 = new PlanoDeSaude("Notredame");
        PlanoDeSaude p3 = new PlanoDeSaude("Amil");

        ArrayList<PlanoDeSaude> planoDeSaudes = new ArrayList<>();
        planoDeSaudes.add(p1);
        planoDeSaudes.add(p2);
        planoDeSaudes.add(p3);

        for (PlanoDeSaude p : planoDeSaudes) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        System.out.println(PlanoDeSaude.getQuantidade());

        System.out.println();
        System.out.println();
        System.out.println();

        AgendaApp.main(args);

        System.out.println();

        System.out.println("Numeros de planos de saúdes " + PlanoDeSaude.getQuantidade());
        
        
    }

}
