package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    private static int contador = 0;
    private Integer codigo;
    private String crm;
    private String nome;
    private String telefoneMedico;
    private String email;
    private LocalDate dataDeNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private ArrayList<Especialidade> especialidades;

    //Contrutores de classe
    public Medico() { //DEFAULT
        gerarCodigo();
    }

    public Medico(String crm, String nome, String telefoneMedico, Integer codigo) {

        this.crm = crm;
        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        this.codigo = codigo;
    }

    public Medico(String nome, String telefoneMedico, String email, String crm, ArrayList<Especialidade> especialidades, LocalDate dataDeNascimento) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        this.email = email;
        this.crm = crm;
        this.especialidades = especialidades;
        gerarCodigo();
    }

    public Medico(String nome, String telefoneMedico, String email, String crm, String dataDeNascimento, Integer codigo, ArrayList<Especialidade> especialidades) {

        this.nome = nome;
        this.telefoneMedico = telefoneMedico;
        this.email = email;
        this.crm = crm;
        this.dataFormatada = dataDeNascimento;
        this.especialidades = especialidades;
        this.codigo = codigo;
        this.contador = codigo;
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

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
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

    public String arrayToString(ArrayList<Especialidade> array) {
        ArrayList<String> codigos = new ArrayList<>();
        for (Especialidade e : array) {
            codigos.add(e.getCodigo().toString());
        }
        return String.join(";", codigos);
    }

}
