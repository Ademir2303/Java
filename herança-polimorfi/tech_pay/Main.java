package tech_pay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FOLHA DE PAGAMENTO - TECHPAY =====");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Calcular Salário de um Funcionário");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> calcularSalarioIndividual();
                case 0 -> System.out.println("Encerrando... Obrigado!");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarFuncionario() {
        System.out.println("\n--- Cadastro de Funcionário ---");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Salário Base: R$ ");
        double salarioBase = Double.parseDouble(sc.nextLine());

        System.out.println("\nTipo de Funcionário:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Devesenvolvedor");
        System.out.println("3 - Estagiário");
        System.out.print("Escolha: ");
        int tipo = Integer.parseInt(sc.nextLine());

        Funcionario f = null;

        switch (tipo) {
            case 1 -> {
                System.out.print("Bônus: R$ ");
                double bonus = Double.parseDouble(sc.nextLine());
                f = new Gerente(nome, matricula, salarioBase, bonus);
            }

            case 2 -> {
                System.out.print("Nível (Júnior / Pleno / Sênior): ");
                String nivel = sc.nextLine();
                f = new Dev(nome, matricula, salarioBase, nivel);
            }

            case 3 -> {
                System.out.print("Carga Horária Semanal (ex: 30): ");
                int carga = Integer.parseInt(sc.nextLine());
                f = new Estagiario(nome, matricula, salarioBase, carga);
            }

            default -> {
                System.out.println("Tipo inválido! Cadastro cancelado.");
                return;
            }
        }

        funcionarios.add(f);
        System.out.println("Funcionário cadastrado com sucesso! ✔️");
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }

        System.out.println("\n--- Lista de Funcionários ---");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("\nFuncionário [" + i + "]");
            funcionarios.get(i).exibirDados();
        }
    }

    private static void calcularSalarioIndividual() {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados!");
            return;
        }

        listarFuncionarios();
        System.out.print("\nEscolha o índice do funcionário: ");
        int indice = Integer.parseInt(sc.nextLine());

        if (indice < 0 || indice >= funcionarios.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        Funcionario f = funcionarios.get(indice);

        System.out.println("\n--- Cálculo de Salário ---");
        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Salário Líquido: R$ " + f.salarioLiquido());
    }
}
