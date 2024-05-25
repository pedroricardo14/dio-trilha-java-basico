public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        // tipos primitivos 
    // estude a classe String que representa texto na aplicação

        String meuNome = "PEDRO RICARDO";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // Casting: pega um tipo mais abrangente e converte para um tipo mais específico pois é o tipo correspondente.
        // Não é legal fazer essa adaptação o tempo todo, mas se você quer definir um valor de precisão maior para precisão menor, você garante que se acontecer algo inesperado, você está ciente do ocorrido.

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
