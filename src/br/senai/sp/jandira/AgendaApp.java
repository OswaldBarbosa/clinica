package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
			
		
		especialidade.setDescricao("Sua consulta será com o doutor Piaba, o melhor cardiologista do Brasil");
		System.out.println(especialidade.getDescricao());
		
		especialidade2.setDescricao("Otorrinolaringologia cuida do nariz seu doente mental");
		System.out.println(especialidade2.getDescricao());
	}

}
