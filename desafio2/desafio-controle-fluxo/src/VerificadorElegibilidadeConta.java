import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
          int idade = scanner.nextInt();
          if (idade >= 18) {
            System.out.print("Voce esta elegivel para criar uma conta bancaria.");
          } else {
            System.out.print("Voce nao esta elegivel para criar uma conta bancaria.");
          }

        scanner.close();
    }
}