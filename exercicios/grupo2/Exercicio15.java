/**
 * Maior de Dois Números: Dados dois números inteiros, determine qual deles é o maior ou se são
iguais.
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio15 {
    
    /**
     * Se retornar -1, o parâmetro 1 é o menor número, se retornar 
     * 1 o parâmetro 1 é o maior número, senão os dois números são iguais
     * @param numero1
     * @param numero2
     * @return
     */
    public static int retornaMaiorMenorIgual(int numero1, int numero2) {
        //RETORNA 0 QUANDO OS DOIS NUMEROS SAO IGUAIS
        int tokenMaiorMenorIgual = 0;
        if (numero1 - numero2 < 0) {
            tokenMaiorMenorIgual = -1;
        } else if (numero1 - numero2 > 0) {
            tokenMaiorMenorIgual = 1;
        }
        return tokenMaiorMenorIgual;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int num1 = scanner.nextInt();

        // ArrayList<Integer> lst = new ArrayList<Integer>();
        // lst.add(1);
        // lst.add(2);
        // lst.add(3);
        // lst.add(9);
        // lst.add(6);
        // lst.sort(null);


        System.out.println("Digite o número 2: ");
        int num2 = scanner.nextInt();
        int resultado = retornaMaiorMenorIgual(num1, num2);

        String mensagemResultado = "";
        if (resultado == -1) {
            mensagemResultado = "O número 1 é o menor número.";
        }
        else if(resultado == 1){
            mensagemResultado = "O número 1 é o maior número.";
        }
        else {
            mensagemResultado = "O número 1 e o número 2 são iguais.";
        }
        mensagemResultado += "\nNumero 1: " + num1 + " e Numero 2: " + num2;

        System.out.println(mensagemResultado);
        scanner.close();
    }
}
