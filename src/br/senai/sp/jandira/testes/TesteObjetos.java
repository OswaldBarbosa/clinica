package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter ataque no coração");

        Especialidade e2 = new Especialidade();
        e2.setNome("Pediatria");
        e2.setDescricao("Cuida de criança");

        Especialidade e3 = new Especialidade("Otorrino", "Cuida do nariz");
        
        Especialidade e4 = new Especialidade("Médico", "Cuidar");
        
        Especialidade e5 = new Especialidade("Seu pai", "sua mãe");

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        especialidades.add(e5);
        System.out.println(especialidades.size());
        
        System.out.println("************************" + e1.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());
        System.out.println(e5.getCodigo() + " - " + e5.getNome());

        // Imprimir no console o nome das especialidades
        // que estão armazenadas no arraylis
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // Utilização do FOR para iteração(repetir) no arraylist
        System.out.println("----------FOR----------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        // FOR EACH -> para cada
        System.out.println("----------FOR EACH----------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        System.out.println("-----------Planos de Saúde-----------");

        // Criar três planos de saúde, armazenar em um arraylist 
        // e exibir o nome de cada um deles usando foe each
        PlanoDeSaude p1 = new PlanoDeSaude("Amil");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed");
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);

        for (PlanoDeSaude p : planosDeSaude) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        PlanoDeSaude dnl = new PlanoDeSaude();

        System.out.println("Quantos planos de saúde temos: " + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("Quantos planos de saúde temos: " + PlanoDeSaude.getQuantidade());
        

    }

}
