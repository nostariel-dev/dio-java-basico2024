import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exceções {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Minha idade é " + idade + " anos.");
        System.out.println("Tenho " + altura + "cm de altura.");
        scanner.close();
        }
        catch(InputMismatchException e) {
            System.out.println("O campo IDADE e ALTURA precisam ser numericos.");
        }
    }
}