package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private static int contador = 0;
    private Integer codigo;
    private String crm;
    private String nome;
    private String telefoneMedico;
    private String email;
    private Especialidade[] especialidades;
    private LocalDate dataDeNascimento;

    //Contrutores de classe
    public Medico() { //Default
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefoneMedico, String email, Especialidade[] especialidade, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        this.email = email;
        this.crm = crm;
        this.codigo = codigo;
        this.especialidades = especialidade;
        this.dataDeNascimento = dataDeNascimento;
        gerarCodigo();
    }

    //Método gerar código
    private void gerarCodigo() {
        contador++;
        this.codigo = contador;
    }

    //Métodos gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefoneMedico() {
        return telefoneMedico;
    }

    public void setTelefoneMedico(String telefoneMedico) {
        this.telefoneMedico = telefoneMedico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
