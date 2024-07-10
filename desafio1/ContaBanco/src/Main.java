import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Digite seu nome completo: ");
        conta.nomeCompleto = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        conta.numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número da agência: ");
        conta.agencia = scanner.nextLine();

        System.out.print("Digite o valor do saldo: ");
        conta.saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        System.out.println("Olá, " + conta.nomeCompleto + ". Obrigada por criar uma conta em nosso banco. O número da sua conta é " + conta.numeroConta + ", na agência " + conta.agencia + " e você possui um saldo de " + conta.saldo + " disponível para saque.");
    
    }

}
