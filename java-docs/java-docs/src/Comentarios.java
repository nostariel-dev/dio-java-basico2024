public class Comentarios {

    public static void main(String[] args) {

    }
   /*
    * Este metodo foi elaborado as pressas
    * por isso eu abreviei o nome das variáveis
    * mas ele tem a finalidade de somar ou mutiplicar
    * dois números.
    */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

}