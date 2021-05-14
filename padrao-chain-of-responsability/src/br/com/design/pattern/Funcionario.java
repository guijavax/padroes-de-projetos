package br.com.design.pattern;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salario;
    private int anosDeEmpresa;

    public Funcionario(String nome, BigDecimal salario, int anosDeEmpresa) {
        this.nome = nome;
        this.salario = salario;
        this.anosDeEmpresa = anosDeEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public int getAnosDeEmpresa() {
        return anosDeEmpresa;
    }
}
