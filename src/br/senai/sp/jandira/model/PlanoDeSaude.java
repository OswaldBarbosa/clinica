package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlanoDeSaude {
    
    public static int contador = 13;
    private String operadora;
    private String categoria;
    private LocalDate validade;
    private String numero;
    private static int quantidade;
    private Integer codigo;
    private DateTimeFormatter formatador;
    private String dataFormatada;
  
        public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
    }
        
        public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero, Integer codigo) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        this.codigo = codigo;
        this.contador = codigo;
    }
        

    public PlanoDeSaude() {
        gerarCodigo();
        
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }
    
    
    public void gerarCodigo(){
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
    
    public String getPlanoDeSaudeSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.numero + ";" + this.operadora + ";" + this.categoria + ";" + this.dataFormatada;
    }

}
