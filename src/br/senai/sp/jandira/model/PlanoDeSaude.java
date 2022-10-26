package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PlanoDeSaude {
    
    public static int contador = 13;
    private String operadora;
    private String categoria;
    private LocalDate validade;
    private String numero;
    private static int quantidade;
    private Integer codigo;
  
    public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        quantidade++;
    }

    public PlanoDeSaude() {
    }
    
    public void gerarCodifo(){
        this.contador++;
        this.codigo = contador;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
