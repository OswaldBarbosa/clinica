package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medico {

    private static int contador = 0;
    private Integer codigo;
    private String crm;
    private String nome;
    private String telefoneMedico;
    private String email;
    private LocalDate dataDeNascimento;
    private Especialidade[] especialidades;
    private DateTimeFormatter formatador;
    private String dataFormatada;

    //Contrutores de classe
    public Medico() { //DEFAULT
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefoneMedico) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

        this.crm = crm;
        this.codigo = codigo;
        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefoneMedico, String email, Especialidade[] especialidade, LocalDate dataDeNascimento) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

        this.crm = crm;
        this.codigo = codigo;
        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        this.email = email;
        this.especialidades = especialidade;
        gerarCodigo();
    }

    //Método gerar código
    private void gerarCodigo() {
        contador++;
        this.codigo = contador;
    }

    //Métodos gets e sets
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefoneMedico + ";" + this.email + ";" + this.dataFormatada + ";" + this.especialidades;
    }

}
