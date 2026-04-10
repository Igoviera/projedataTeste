package model;

import ultil.Formatador;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNacimento, BigDecimal salario, String funcao) {
        super(nome, dataNacimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return getNome() +
                " | " + getDataNascimento().format(Formatador.DATA) +
                " | R$ " + Formatador.VALOR.format(salario) +
                " | " + funcao;
    }
}
