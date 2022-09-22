package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {

		// Criar um objeto Plano de Saúde
		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
		planoDeSaude1.setOperadora("Unimed");
		planoDeSaude1.setCategoria("Ouro");
		planoDeSaude1.setNumero("6599-7888-566-45");
		planoDeSaude1.setValidade(LocalDate.of(2023, 11, 30)); // 30/11/2023

		// Criar um objeto Endereço
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Avenida João Ventura dos Santos");
		endereco1.setNumero("1308");
		endereco1.setBairro("Baronesa");
		endereco1.setCidade("Osasco");
		endereco1.setCep("06260-170");
		
		endereco1.setComplemento("Ao lado da academia Scorpion");

		// Criar um objeto Paciente
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Vinícius Monteiro Araújo");
		paciente1.setDataDeNascimento(LocalDate.of(2005, 9, 24));// 24/09/2005
		paciente1.setTelefone("(11)98982-9145");
		paciente1.setRg("582.658.415-8");
		paciente1.setCpf("543807228-05");
		paciente1.setEndereco(endereco1);
		paciente1.setPlanoDeSaude(planoDeSaude1);

		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		planoDeSaude2.setOperadora("Amil");
		planoDeSaude2.setCategoria("Platina");
		planoDeSaude2.setNumero("7854-6578-125-66");
		planoDeSaude2.setValidade(LocalDate.of(2023, 12, 17)); // 17/12/2023

		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua da conceição");
		endereco2.setNumero("1980");
		endereco2.setBairro("Rochdale");
		endereco2.setCidade("Osasco");
		endereco2.setCep("98746-980");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Casa");

		Paciente paciente2 = new Paciente();
		paciente2.setNome("Renata Fontes Barbosa");
		paciente2.setDataDeNascimento(LocalDate.of(1985, 5, 17));// 24/09/2005
		paciente2.setTelefone("(11)98876-4545");
		paciente2.setRg("789.654.321.5");
		paciente2.setCpf("123.456.789.65");
		paciente2.setEndereco(endereco1);
		paciente2.setPlanoDeSaude(planoDeSaude1);

		// Exibir os dados do paciente
		System.out.println("Nome do paciente: " + paciente1.getNome());
		System.out.println("Telefone do Paciente: " + paciente1.getTelefone());
		System.out.println("Operadora do plano do paciente: " + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("Categorio do Plano de Saúde: " + planoDeSaude1.getCategoria());
		System.out.println("Cidade do paciente: " + paciente1.getEndereco().getCidade());
		System.out.println("Estado do paciente: " + paciente1.getEndereco().getEstado());

		// Criar especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Cuida da garganta, ouvido e etc...");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico Geral");
		especialidade3.setDescricao("Sabe de tudo um pouco:)");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Pediatra");
		especialidade4.setDescricao("Cuida das crianças");

		// Criar um objeto médico
		Medico medico1 = new Medico();
		medico1.setNomeMedico("Fernando Piaba");
		medico1.setEmail("piabão@gmail.com");
		medico1.setTelefoneMedico("(11)4002-8922");
		medico1.setCrm("684-55");
		Especialidade[] especialidades1 = { especialidade1, especialidade4 };
		medico1.setEspecialidades(especialidades1);

		Medico medico2 = new Medico();
		medico2.setNomeMedico("Artur Gigante");
		medico2.setEmail("arturzao@gmail.com");
		medico2.setTelefoneMedico("(11)7873-8922");
		medico2.setCrm("094-72");
		Especialidade[] especialidades2 = { especialidade1, especialidade2, especialidade3, especialidade4 };
		medico2.setEspecialidades(especialidades2);

		// Mostrar os nomes dos medicos e suas informações
		System.out.println("------------MÉDICOS DISPONIVEIS------------");
		System.out.println();
		System.out.println("Nome: " + medico1.getNomeMedico());

		int contador = 0;
		while (contador < medico1.getEspecialidades().length) {
			System.out.println(
					"Especialidade " + (contador + 1) + ": " + medico1.getEspecialidades()[contador].getNome());
			contador++;
		}

		System.out.println("Email: " + medico1.getEmail());
		System.out.println("CRM: " + medico1.getCrm());
		System.out.println();

		System.out.println("-----------PROXIMO MÉDICO-----------");
		System.out.println("Nome: " + medico2.getNomeMedico());

		int contador2 = 0;
		while (contador2 < medico2.getEspecialidades().length) {
			System.out.println(
					"Especialidade " + (contador2 + 1) + ": " + medico2.getEspecialidades()[contador2].getNome());
			contador2++;
		}
		System.out.println("Email: " + medico2.getEmail());
		System.out.println("CRM: " + medico2.getCrm());

		// Fazer o agendamento do paciente Vinícius
		// com um cardiologista para o dia 27/09/2022
		// As 14h15m
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade1);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHorarioDaColsulta(LocalTime.of(14, 15));

		System.out.println();
		System.out.println();
		System.out.println("-----------NOVO AGENDAMENTO-----------");
		System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Nome do médico: " + agenda1.getMedico().getNomeMedico());
		System.out.println("Data da consulta: " + agenda1.getDataDaConsulta());
		System.out.println("Horario da consulta: " + agenda1.getHorarioDaColsulta());

		// Fazer o agendamento da paciente Renata
		// com um Pediatra para o dia 12/10/2022
		// As 09h30m
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade4);
		agenda2.setMedico(medico2);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHorarioDaColsulta(LocalTime.of(9, 30));

		System.out.println();
		System.out.println();
		System.out.println("-----------NOVO AGENDAMENTO-----------");
		System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Nome do médico: " + agenda2.getMedico().getNomeMedico());
		System.out.println("Data da consulta: " + agenda2.getDataDaConsulta());
		System.out.println("Horario da consulta: " + agenda2.getHorarioDaColsulta());
		
		
		
	}
	

}
