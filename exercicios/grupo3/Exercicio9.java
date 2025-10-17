/**
 Faça um programa que exiba de 0 a 100, 
somente os números pares, e exiba o resultado.
 @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio9 {
    public static void main(String[] args) {
        int quantidadeItens = 10;
        int somaSomentePares = 0;
        for (int contador = 0; contador <= quantidadeItens; contador++) {
            //eh numero par
            if (contador % 2 == 0) {
                System.out.printf("\n O numero %d é par", contador);
                somaSomentePares += contador;
            }
        }
        System.out.println("Soma dos pares: " + somaSomentePares);
    }
}
