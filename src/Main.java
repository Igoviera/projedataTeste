
import model.Funcionario;
import service.FuncionarioService;
import ultil.Formatador;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = criarFuncionarios();

        FuncionarioService.removerJoao(funcionarios);

        System.out.println("\n=== FUNCIONÁRIOS ===");
        FuncionarioService.imprimirLista(funcionarios);

        FuncionarioService.aplicarAumento(funcionarios);

        System.out.println("\n=== APÓS AUMENTO ===");
        FuncionarioService.imprimirLista(funcionarios);

        System.out.println("\n=== AGRUPADOS POR FUNÇÃO ===");
        Map<String, List<Funcionario>> agrupados =
                FuncionarioService.agruparPorFuncao(funcionarios);

        agrupados.forEach((funcao, lista) -> {
            System.out.println("\n" + funcao);
            lista.forEach(f -> System.out.println(" - " + f.getNome()));
        });

        System.out.println("\n=== ANIVERSARIANTES (10 e 12) ===");
        FuncionarioService.buscarAniversariantes(funcionarios).forEach(f -> System.out.println(f.getNome()));

        Funcionario maisVelho = FuncionarioService.buscarMaisVelho(funcionarios);

        System.out.println("\nMais velho: " +
                maisVelho.getNome() + " - " +
                FuncionarioService.calcularIdade(maisVelho) + " anos");


        FuncionarioService.ordenarPorNome(funcionarios);

        System.out.println("\n=== ORDENADOS ===");
        FuncionarioService.imprimirLista(funcionarios);

        System.out.println("\nTotal salários: R$ " +
                Formatador.VALOR.format(
                        FuncionarioService.calcularTotalSalarios(funcionarios)
                ));

        System.out.println("\n=== SALÁRIOS MÍNIMOS ===");
        funcionarios.forEach(f ->
                System.out.println(f.getNome() + ": " +
                        FuncionarioService.calcularSalariosMinimos(f))
        );
    }

    private static List<Funcionario> criarFuncionarios() {
        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        lista.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        lista.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        lista.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        lista.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        lista.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        lista.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        lista.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        lista.add(new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        lista.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        return lista;
    }

}