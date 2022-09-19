package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private LocalDate dataDaConsulta;
	private LocalTime horarioDaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;

	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	public LocalTime getHorarioDaConsulta() {
		return horarioDaConsulta;
	}

	public void setHorarioDaConsulta(LocalTime horarioDaConsulta) {
		this.horarioDaConsulta = horarioDaConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
