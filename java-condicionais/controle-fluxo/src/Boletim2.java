//Condição Ternária

public class Boletim2 {

    public static void main(String[] args) {
        
        int nota = 6;
        String resultado = nota >= 7 ? "Aluno aprovado!" : nota >=5 && nota < 7 ? "Aluno em recuperação." : "Aluno reprovado!";

        System.out.println(resultado);
    }
    
}
