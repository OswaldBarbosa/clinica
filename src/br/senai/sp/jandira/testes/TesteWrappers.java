package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 5;
		
		Integer b = 5;

		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		//e1.setNome("Cardiologia");
		e1.setDescricao("Não deixa ter ataque no coração");
		
		Especialidade e2 = new Especialidade("Pediatria");
		//e2.setNome("Pediatria");
		e2.setDescricao("Cuida de criança");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		//e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ficar com dr nas costas");
		
		
		Especialidade e4 = new Especialidade("Clinico Geral");
		//e4.setNome("Clinico Geral");
		e4.setDescricao("Sabe de tudo e um pouco e um pouco de tudo");
		
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade("Otorrino");
		e5.setNome("Otorrino");
		e5.setDescricao("Cuida do nariz");
		
		especialidades.add(e3);
		especialidades.add(e4);
		especialidades.add(e5);
		
		//especialidades[4] = e5;
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(60);
		notas.add(70);
		notas.add(80);
		
		System.out.println(notas.size());
		
		notas.add(90);
		notas.add(100);
		
		System.out.println(notas.size());
		
		//Queremos ve o nome da especialdade que está na posição do ArrayLIst especialdades
		System.out.println(especialidades.get(3).getNome());
		
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		
		
		
	}

}
