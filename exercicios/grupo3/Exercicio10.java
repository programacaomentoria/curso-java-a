/**
 Imprima os múltiplos de 3 entre 1 e 30. 
 Atenção, utilize um loop WHILE.
 @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio10 {
    public static void main(String[] args) {
        int limiteContador = 30;
        int contador = 3;
        while(contador <= limiteContador) {
            System.out.printf("%d ", contador);
            contador += 3;
        }
    }
}
