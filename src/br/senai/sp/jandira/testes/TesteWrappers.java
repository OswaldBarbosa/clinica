package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

    public static void main(String[] args) {

        Integer a = 5;

        Double x = 2.9;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        Especialidade e1 = new Especialidade("Cardiologia");
        //e1.setNome("Cardiologia");
        e1.setDescricao("Cuida do coração");

        Especialidade e2 = new Especialidade("Gastroentrelogia");
        //e2.setNome("Gastroentrelogia");
        e2.setDescricao("Cuida do estamago");

        especialidades.add(e1);
        especialidades.add(e2);

        Especialidade e3 = new Especialidade("Fisioterapeuta");
        //e3.setNome("Fisioterapeuta");
        e3.setDescricao("Cuida das costas");

        especialidades.add(e3);

        Especialidade e4 = new Especialidade("Clinico geral");
        //e4.setNome("Clinico geral");
        e4.setDescricao("Cuida de tudo");

        especialidades.add(e4);

        //Especialidade[] especialiades = { e1, e2, e3, e4 };
        Especialidade e5 = new Especialidade("Pediatra");
        //e5.setNome("Pediatria");
        e5.setDescricao("Cuida de criança");

        especialidades.add(e5);

        System.out.println(especialidades.size());

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(50);
        notas.add(339);
        notas.add(12);
        notas.add(84);
        notas.add(35);
        //mexendo com o integer
        System.out.println(notas.size());
        notas.add(45);
        System.out.println(notas.size());

        System.out.println(especialidades.get(3).getNome());
        especialidades.get(1).setNome("Neurologista");
        System.out.println(especialidades.get(1).getNome());

        Especialidade nova = especialidades.get(2);
        System.out.println(nova.getNome());

    }
}
