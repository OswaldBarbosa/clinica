package br.senai.sp.jandira.model;

public class Medico {

    private String nomeMedico;
    private Especialidade[] especialidades;
    private String telefoneMedico;
    private String email;
    private String crm;

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setTelefoneMedico(String telefoneMedico) {
        this.telefoneMedico = telefoneMedico;
    }

    public String getTelefoneMedico() {
        return telefoneMedico;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

}
