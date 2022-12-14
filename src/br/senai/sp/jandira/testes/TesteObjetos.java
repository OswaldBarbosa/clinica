package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int [] a = {4, 5, 3, 6};
        int [] b = new int[8];
        b[0] = 8;
        b[1] = 10;
        b[2] = 3;
        
        int c [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(c[2][1]);
        
        String[][] quitanda = {
            {"banana", "maça", "uva", "morango"},
            {"alface", "repolho", "couve", "salsinha", "pimentão", "brócolis"},
            {"abacate", "tomate", "jiló", "abobrinha"}
        };
        
        System.out.println(quitanda[2][1]);
        
        int[][][] teste = {{
            {1,2,3}
        }, {
            {4,5,6}
        }, {
            {7,8,9}
        }, {
            {10,11,12}
        }};
        
        System.out.println(teste[0][1][1]);
        
        System.out.println("-------------------------------------------------------------------");
        
        Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter ataque no coração");

        EspecialidadeDAO.gravar(e1);

        Especialidade e2 = new Especialidade();
        e2.setNome("Pediatria");
        e2.setDescricao("Cuida de criança");

        EspecialidadeDAO.gravar(e2);

        System.out.println("------------------DAO------------------------");

        Especialidade e3 = new Especialidade("Otorrino", "Cuida do nariz");
        EspecialidadeDAO.gravar(e3);

        Especialidade e4 = new Especialidade("Médico", "Cuidar");
        EspecialidadeDAO.gravar(e4);

        Especialidade e5 = new Especialidade("Seu pai", "sua mãe");
        EspecialidadeDAO.gravar(e5);  //Create

        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println(ee.getNome());
        }
        
        EspecialidadeDAO.excluir(101);
        System.out.println("-----------------------------------------");
        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println("especialidade gravada " + ee.getNome());
        }
        
        System.out.println("----------------PROCURA-----------------");
        Especialidade procurada = EspecialidadeDAO.getEspecialidade(102);
        System.out.println(procurada.getNome());
    
        System.out.println("-----------------UPDATE-----------------");
        Especialidade especialidadeAtualizada = new Especialidade();
        especialidadeAtualizada.setCodigo(103);
        especialidadeAtualizada.setNome("Otorrinolaringologia");
        especialidadeAtualizada.setDescricao("Cuida do nariz");
        EspecialidadeDAO.atualizar(especialidadeAtualizada);
        
        System.out.println("--------------RESULTADO------------------");
        Especialidade procurada2 = EspecialidadeDAO.getEspecialidade(103);
        System.out.println(procurada2.getNome());
        System.out.println(procurada2.getDescricao());
        
        System.out.println("");
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

        PlanoDeSaude dnl = new PlanoDeSaude();

        System.out.println("Quantos planos de saúde temos: " + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("Quantos planos de saúde temos: " + PlanoDeSaude.getQuantidade());

    }

}
