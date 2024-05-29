public class Operadores {
    public static void main(String[] args) {
       // String nomeCompleto = "LINGUAGEM" + "JAVA";
      //  System.out.println(nomeCompleto);

      /*

        String concatenacao = "?";


        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao); // "31"

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao); // "1111"

        concatenacao = 1+"1"+1+"1"; 

        System.out.println(concatenacao); // "1111"

        concatenacao = "1"+1+1+1; 

        System.out.println(concatenacao);  // "1111"

        concatenacao = "1"+(1+1+1); 

        System.out.println(concatenacao);  // 13

        // Cada etapa dessa foi para mostrar como funciona a concatenação de int com string, vice e versa.

    

    int numero = 5;
    numero = - numero;
    //System.out.println(- numero);
    System.out.println(numero);

    numero = numero * -1;
    // numero = + numero não funciona, pois o + é de uma função aritmética. Se quisermos converter, precisamos multiplicar por -1
    System.out.println(numero);

    */
   // int numero = 5;
    // x repeticao 
    //numero = numero + 2;
   // numero++;
    // numero ++ é o mesmo que numero +1
   // System.out.println(++numero);
    // No caso acima, ele primeiro mostrou o número e depois incrementou, então só vai mostrar o valor incrementado se fizer outro System.out.println(numero);
    // Se você quer primeiro incrementar e depois imprimir, faça Systems.out.println(++numero);
    // A mesma regra funciona para decremenetar
    //System.out.println(numero);

    //boolean variavel = true;
    //System.out.println(!variavel);
   // variavel = !variavel;
  //  System.out.println(variavel);
    // Esses são modos de converter um booleano de true para false e vice e versa.

    /*

    int a, b;
    a = 6;
    b = 6;
    //String resultado = "";
    // Forma abreviada de if else (operador ternário)
    String resultado = a==b ? "verdadeiro" : "falso";
    // Nessa primeira operação, sempre é uma expressão booleana, sempre verificar isso. Dependendo da expressão booleana são duas alternativas de resultado.
    // Se a variável resultado é uma String, ele espera que os valores à retornar também sejam String, se fosse um inteiro, seria outro tipo de valor (ex: 1 ou 0)
    // O operador ternário não se limita à String

    /* 
    Forma normal de if e else em java
    if(a==b)
        resultado = "verdadeiro";
    else 
        resultado = "falso";
    

    System.out.println(resultado);
       

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
        System.out.println("A nossa condição é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);

     */

     String nomeUm = "PEDRO";
    // String nomeDois = "PEDRO";
    String nomeDois = new String("PEDRO");
    // Se aqui fosse uma pegadinha, um novo objeto, aqui temos dois objetos na memória, esse new string e o main string args
    // Quando falamos de números, a linguagem Java tem uma compreensão, que os números vão para um espaço da memória
    // Quando esses valores são objetos, são aplicados de uma outra estrutura.
    // Quando estamos falando de objetos ou textos, costumamos usar un método chamado .equals (compara conteúdos, se os dois conteúdos dos objetos são iguais)
    // Para números podemos utilizar operadores relacionais, mas quando formos usar objetos, é interessante que a gente use o equals

     //System.out.println(nomeUm == nomeDois);
     System.out.println(nomeUm.equals(nomeDois));
    }
}
