import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o limite diário de saques
        double limiteDiario = scanner.nextDouble();
        double totalSaques = 0.0;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) { // Loop infinito; será controlado por break
            double valorSaque = scanner.nextDouble();
        

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (totalSaques + valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante " + limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
