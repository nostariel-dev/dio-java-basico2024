import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    float deposito = scanner.nextFloat();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    float valorSaque = scanner.nextFloat();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
        
    }
}
