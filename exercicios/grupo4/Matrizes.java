package exercicios.grupo4;

public class Matrizes {
    public static void main(String[] args) {
        int numeroDaTabuada = 3;

        //
        //VETOR, MATRIZ, LISTA
        //CONJUNTO
        //



        //VETOR
        //vetor inicia na posicao 0
        int[] sequenciaTabuada = new int[10]; //{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        for (int contador = 0; contador < sequenciaTabuada.length; contador++)
            sequenciaTabuada[contador] = (contador + 1) * numeroDaTabuada;          //1 x 3, 2 x 3, 3 x 3, 4 x 3

        for (int contador = 0; contador < 10; contador++) {
            System.out.printf("%d ", sequenciaTabuada[contador]);
        }

        //MATRIZ COM TODAS AS TABUADAS
        int[][] todasTabuadasAte10 = new int[10][10];

        for (int contadorX = 0; contadorX < 10; contadorX++) {
            for (int contadorY = 0; contadorY < 10; contadorY++) {
                todasTabuadasAte10[contadorX][contadorY] = (contadorX + 1) * (contadorY + 1);
            }
        }

        for (int contadorX = 0; contadorX < 10; contadorX++) {
            System.out.printf("\nTabuada do %02d: ", (contadorX + 1));
            for (int contadorY = 0; contadorY < 10; contadorY++) {
                System.out.printf("%03d ", todasTabuadasAte10[contadorX][contadorY]);
            }
        }

    }
}
