package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	private String nome;
	private String descricao;
	
	//métodos de aesso aos atributos
	public void setNome(String nome) {
		
		if(nome.length() >= 3) {
			this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null, nome + " Não é um nome valido, ela deve conter pelo menos 3 letras ou mais");
		}		
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao){
		if(descricao.length() >= 10) {
			this.descricao = descricao;
		}else{
			JOptionPane.showMessageDialog(null,descricao + " não é uma descrição valida, ela deve conter pelo menos 10 letras ou mais");
			
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
}
