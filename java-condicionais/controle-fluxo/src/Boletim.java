public class Boletim {
    
    public static void main(String[] args) {
        
        int nota = 6;
        
        if(nota >= 7) 
            System.out.println("Aluno aprovado!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Aluno em recuperação.");

        else
            System.out.println("Aluno reprovado!");



    }

}
