import java.util.Scanner;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limite;
    private Scanner input; // para entrada de dados

    public Conta(int numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.limite = limite;
        this.input = new Scanner(System.in); // start do scanner
    }

    public void sacar() {
        double valor;

        while (true) {
            System.out.print("Informe o valor que deseja sacar: R$ ");
            if (input.hasNextDouble()) {
                valor = input.nextDouble();
                input.nextLine();
                if (valor > 0 && valor <= (saldo + limite)) {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso.");
                    break;
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido. Tente novamente.");
                }
            } else {
                System.out.println("Valor inválido. Tente novamente.");
                input.nextLine();
            }
        }
    }

    public void depositar() {
        double valor;

        while (true) {
            System.out.print("Informe o valor que deseja depositar: R$ ");
            if (input.hasNextDouble()) {
                valor = input.nextDouble();
                input.nextLine();
                if (valor > 0) {
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                } else {
                    System.out.println("Valor de depósito inválido. Tente novamente.");
                }
            } else {
                System.out.println("Valor inválido. Tente novamente.");
                input.nextLine();
            }
        }
    }

    public void verSaldo() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Dados da Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (input.hasNextInt()) {
                opcao = input.nextInt();
                input.nextLine(); // Mova esta linha para aqui

                switch (opcao) {
                    case 1:
                        verSaldo();
                        break;
                    case 2:
                        sacar();
                        break;
                    case 3:
                        depositar();
                        break;
                    case 4:
                        info();
                        break;
                    case 0:
                        System.out.println("Saindo do programa, volte sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                input.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);
    }

    public void info() {
        System.out.println("------------------------------------------ ");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("------------------------------------------ ");
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta(77777, "Mai Wolf", 3000.0);

        minhaConta.exibirMenu();
        minhaConta.depositar();
        minhaConta.sacar();
        minhaConta.info();
    }
}
