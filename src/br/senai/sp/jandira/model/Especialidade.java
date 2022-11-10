package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    //Contrutores de classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade() {
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }
    
        public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }
    
    //Métodos de acesso aos atributos
        public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
        private void gerarCodigo () {
        this.contador++;
        this.codigo = contador;
        this.contador = codigo;
    }
    
    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " Não é um nome valido, ela deve conter pelo menos 3 letras ou mais");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + " não é uma descrição valida, ela deve conter pelo menos 10 letras ou mais");

        }
    }

    public String getDescricao() {
        return descricao;

    }
    
    public String getEspecialidadeSeparaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }
}
