//Switch Case

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "B"; //Planos disponíveis: B, M e T.

        switch (plano) {
            case "T": {
                System.out.println("500mg e Youtube liberado");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram liberados");
            }
            case "B": {
                System.out.println("100min de ligação");
            }
        }
    }
}
