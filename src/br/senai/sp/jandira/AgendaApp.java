package br.senai.sp.jandira;

import java.time.LocalDate;import java.time.LocalTime;

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
		
		//criar um objeto Plano de Saúde
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperadora("Notre Dame");
		planoDeSaude.setCategoria("gold");
		planoDeSaude.setNumero("6516-5168-6168-644");
		planoDeSaude.setValidade(LocalDate.of(2024, 8, 19));
		
		//criar um objeto Endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Nova Aurora");
		endereco.setNumero("69");
		endereco.setBairro("Jardim Mutinga");
		endereco.setCidade("Barueri");
		endereco.setCep("06463-190");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setComplemento("Casa do Oswaldão");
		
		//Criar um objeto Paciente
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Carlos Pereira");
		paciente1.setCpf("555.777.222-69");
		paciente1.setRg("25.658.154-63");
		paciente1.setTelefone("(11)935463546");
		paciente1.setDataDeNascimento(LocalDate.of(1975, 4, 24)); //24/04/1975
		paciente1.setEndereco(endereco);
		paciente1.setPlanoDeSaude(planoDeSaude);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Patricia R");
		paciente2.setCpf("555.777.222-69");
		paciente2.setRg("25.658.154-63");
		paciente2.setTelefone("(11)935463546");
		paciente2.setDataDeNascimento(LocalDate.of(1975, 4, 24)); //24/04/1975
		paciente2.setEndereco(endereco);
		paciente2.setPlanoDeSaude(planoDeSaude);
		
		//***Exibir dados do Paciente***
		
		//Exibir nome
		System.out.println("Nome do paciente:" + paciente1.getNome());
		
		//Exibir telefone
		System.out.println("Telefone:" + paciente1.getTelefone());
		
		//Exibir Plano de Saúde 
		System.out.println("Plano de Saúde:" + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria:" + paciente1.getPlanoDeSaude().getCategoria());
		System.out.println("Validade:" + paciente1.getPlanoDeSaude().getValidade());
		System.out.println("Número:" + paciente1.getPlanoDeSaude().getNumero());
		System.out.println("");
		
		//Exibir endereço
		System.out.println("Endereço:" + paciente1.getEndereco().getLogradouro());
		System.out.println("Endereço:" + paciente1.getEndereco().getNumero());
		System.out.println("Endereço:" + paciente1.getEndereco().getBairro());
		System.out.println("Endereço:" + paciente1.getEndereco().getCidade());
		System.out.println("Endereço:" + paciente1.getEndereco().getEstado());
		System.out.println("Endereço:" + paciente1.getEndereco().getComplemento());
		System.out.println("");
		
		//Criar especialiodades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Pediatra");
		especialidade2.setDescricao("Cuida de criança");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico Geral");
		especialidade3.setDescricao("Cuida de tudo um pouco");
		
		Medico medico1 = new Medico();
		medico1.setNome("Ana Maria Braga");
		medico1.setEmail("anamariabraga@gmail.com");
		medico1.setTelefoneMedico("(11)954435191");
		medico1.setCrm("123456");
		Especialidade[] especialidades1 = {especialidade1, especialidade3};
		medico1.setEspecialidades(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Piaba da Silva Feio");
		medico2.setEmail("piabasilvafeio@gmail.com");
		medico2.setTelefoneMedico("(11)947171915");
		medico2.setCrm("654321");
		Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3};
		medico2.setEspecialidades(especialidades2);
		
		//Exibir especialidade de cada médico
		System.out.println("Nome:" + medico1.getNome());
		System.out.println("Email:" + medico1.getEmail());
		System.out.println("Telefone:" + medico1.getTelefoneMedico());
		System.out.println("CRM:" + medico1.getCrm());
		int contador = 0;
		while (contador < medico1.getEspecialidades().length) {
			System.out.println("Especialidade " + (contador + 1) + " - " +  medico1.getEspecialidades()[contador].getNome());
			contador++;
			
		}
		System.out.println("");
		System.out.println("Nome:" + medico2.getNome());
		System.out.println("Email:" + medico2.getEmail());
		System.out.println("Telefone:" + medico2.getTelefoneMedico());
		System.out.println("CRM:" + medico2.getCrm());
		int contador2 = 0;
		while (contador2 < medico2.getEspecialidades().length) {
			System.out.println("Especialidade " + (contador2 + 1) + " - " +  medico2.getEspecialidades()[contador2].getNome());
			contador2++;
	}
		
		//Fazer o agendamento do paciente Carlos Pereira
		//com um cardiologista para o dia 27/09/2022
		//as 14h15m
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade1);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHorarioDaConsulta(LocalTime.of(14, 15));
		
		//Fazer o agendamento do paciente Patricia
		//com um cardiologista para o dia 12/10/2022
		//as 09h30m
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);;
		agenda2.setEspecialidade(especialidade3);
		agenda2.setMedico(medico2);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHorarioDaConsulta(LocalTime.of(9, 30));
		
		//Exibir os dados
		System.out.println("");
		System.out.println("--------NOVO AGENDAMENTO--------");
		System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome() );
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Data da Consulta: " + agenda1.getDataDaConsulta());
		System.out.println("Horário da Consulta: " + agenda1.getHorarioDaConsulta());
		
		System.out.println("");
		System.out.println("--------NOVO AGENDAMENTO--------");
		System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome() );
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Data da Consulta: " + agenda2.getDataDaConsulta());
		System.out.println("Horário da Consulta: " + agenda2.getHorarioDaConsulta());
		

}
	
}

