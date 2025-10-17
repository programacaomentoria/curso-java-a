/**
 * Faça um programa que some de 0 a 100 os números pares, 
e exiba o resultado.
 * @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio4 {
    public static void main(String[] args) {
        int quantidadeItensSoma = 10;
        int somaNumerosPares = 0;
        for (int contador = 0; contador <= quantidadeItensSoma; contador++) {
            //eh numero par
            if (contador % 2 == 0)
                somaNumerosPares += contador;
        }

        System.out.printf("A somatoria de numeros pares de 0 a %d é: %d", quantidadeItensSoma, somaNumerosPares);
    }
}
