package service;

import model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class FuncionarioService {

    public static void removerJoao(List<Funcionario> funcionarios) {
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));
    }

    public static void aplicarAumento(List<Funcionario> funcionarios) {
        funcionarios.forEach(f ->
                f.setSalario(f.getSalario().multiply(new BigDecimal("1.10")))
        );
    }

    public static Map<String, List<Funcionario>> agruparPorFuncao(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public static List<Funcionario> buscarAniversariantes(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .filter(f -> {
                    int mes = f.getDataNascimento().getMonthValue();
                    return mes == 10 || mes == 12;
                })
                .toList();
    }

    public static Funcionario buscarMaisVelho(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .min(Comparator.comparing(Funcionario::getDataNascimento))
                .orElseThrow(() -> new RuntimeException("Lista de funcionários vazia"));
    }

    public static int calcularIdade(Funcionario funcionario) {
        return Period.between(funcionario.getDataNascimento(), LocalDate.now()).getYears();
    }

    public static void ordenarPorNome(List<Funcionario> funcionarios) {
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
    }

    public static BigDecimal calcularTotalSalarios(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal calcularSalariosMinimos(Funcionario funcionario) {
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        return funcionario.getSalario()
                .divide(salarioMinimo, 2, RoundingMode.HALF_UP);
    }

    public static void imprimirLista(List<Funcionario> funcionarios) {
        funcionarios.forEach(System.out::println);
    }
}
