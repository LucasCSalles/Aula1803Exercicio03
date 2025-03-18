package exercicio04;

import java.util.Scanner;

public class Main {
       static Scanner entradas = new Scanner(System.in);
       static Funcionario[] funcionario = new Funcionario[3];
      static int i=0;
    public static void main(String[] args) {
        String nome, cargo;
        double salario;
        int selecao;

        do {
            System.out.println("1-CADASTRAR FUNCIONARIO: ");
            System.out.println("2-PESQUISAR FUNCIONARIO: ");
            System.out.println("3-LISTAR FUNCIONARIOS: ");
            System.out.println("4-FINALIZAR PROGRAMA. ");
            selecao = entradas.nextInt();
            if (selecao < 1 || selecao > 4) {
                System.out.println("Opcao invalida");
            } else {
                switch (selecao) {
                    case 1:
                       cadastrar();
                        break;
                    case 2:
                       pesquisar();
                        break;
                    case 3:
                        listar();
                        break;
                }
            }
        } while (selecao != 4);
    }

    public static void cadastrar() {
        String nome, cargo;
        double salario;

        if (i < 3) {
            System.out.print("DIGITE O NOME DO FUNCIONARIO: ");
            nome = entradas.next();
            System.out.print("DIGITE O CARGO DO FUNCIONARIO: ");
            cargo = entradas.next();
            System.out.print("DIGITE O SALARIO DO FUNCIONARIO: ");
            salario = entradas.nextDouble();
            funcionario[i] = new Funcionario(nome, cargo, salario);
            i++;
        } else {
            System.out.println("Limite de funcionarios excedido.");
        }
    }

    public static void pesquisar() {
        String nome;
        System.out.println("DIGITE O NOME DO FUNCIONARIO: ");
        nome = entradas.next();
        for (int j = 0; j < i; j++) {
            if (nome.equalsIgnoreCase(funcionario[j].nome)) {
                System.out.println("Nome: " +funcionario[j].nome);
                System.out.println("Cargo: " +funcionario[j].cargo);
                System.out.println("Salario: " +funcionario[j].salario);
                return;
            }
        }
            System.out.println("Nome nao encontrado. ");

    }

    public static void listar() {
        for (int j = 0; j < i; j++) {
            System.out.println(funcionario[j].nome +" / "+funcionario[j].cargo +" / " +funcionario[j].salario);
        }
    }

}







