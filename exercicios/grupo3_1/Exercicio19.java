/**
 * Desenho de Quadrado: Peça um número ao usuário e desenhe um quadrado de asteriscos (*) com esse 
 * número de linhas e colunas. Exemplo (lado 4):

****
****
****
****

 * @author: Rodrigo Fischer (programacao.mentoria)
 */

package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho/medida sobre o lado do quadrado: ");
        int medidaLadoQuadrado = scanner.nextInt();
        for (int numeroLinha = 1; numeroLinha <= medidaLadoQuadrado; numeroLinha++) {
            String representacaoLinha = "";
            //UMA NOVA LINHA É TRABALHADA
            for (int numeroColuna = 1; numeroColuna <= medidaLadoQuadrado; numeroColuna++) {
                representacaoLinha += "*";
            }
            System.out.println(representacaoLinha);
            //UMA NOVA LINHA PRECISA SER CRIADA, POIS FECHOU A LOGICA DE DESENHO DA LINHA
        }
        scanner.close();
    }    
}
