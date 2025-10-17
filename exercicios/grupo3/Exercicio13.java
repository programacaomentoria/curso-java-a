/**
Imprima os primeiros 10 números da sequência de Fibonacci. 
A Sequência de Fibonacci é uma série de números onde 
cada número subsequente é a soma dos dois anteriores, 
começando geralmente com 0 e 1.  A sequência inicia assim: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, e assim por diante. Atenção, utilize um loop FOR.

0   0, 1
1   1, 1
2   1, 2
3   2, 3

@author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

public class Exercicio13 {
    public static void main(String[] args) {
        int numeroAtual = 0;
        int numeroProximo = 1;
        int contador = 0;
        int qtdeSequencia = 10;
        while (contador < qtdeSequencia) {
            System.out.printf("%d ", numeroAtual);      //contador temporario   atual     proximo
            int temporario = numeroAtual;                       //0         *0           1           1
            numeroAtual = numeroProximo;                        //1         *1           1           2
            numeroProximo = numeroProximo + temporario;         //2         *1           2           3
                                                                //3         *2           3           5
                                                                //4         *3           5           8
                                                                //5         *5           
            contador++;
        }
    }
}
