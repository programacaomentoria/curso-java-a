package exercicios.grupo4_1;

public class Matrizes {
    public static void main(String[] args) {

        System.out.println("Loop usando while");
        int numeroSequencia = 1;
        while (numeroSequencia < 100) {
            System.out.println(numeroSequencia);
            numeroSequencia++;
        }
        
        System.out.println("Loop usando for");
        for (numeroSequencia = 1; numeroSequencia < 100; numeroSequencia++) {
            System.out.printf("%d,",numeroSequencia);
        }
        

        System.out.println("Loop usando do while");
        do {
            System.out.print(numeroSequencia);
            numeroSequencia++;
        } while (numeroSequencia < 100);

        int numeroDaTabuada = 3;

        //multiplicando
        int multiplicador = numeroDaTabuada;
        int multiplicando = 0;

        //multiplicando refere-se aos elementos da tabuada
        for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
            //primeiro calculo o produto --> multiplicador x multplicando
            //imprimo o resultado

            int produto = multiplicador * multiplicando;
            System.out.printf("%d x %d = %d\n", multiplicador, multiplicando, produto);

            // multiplicando = multiplicando + 1;
        }



        //
        //VETOR, MATRIZ, LISTA
        //CONJUNTO
        //



        //VETOR
        //vetor inicia na posicao 0
        // int[] sequenciaTabuada = new int[10]; //{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        // for (int contador = 0; contador < sequenciaTabuada.length; contador++)
        //     sequenciaTabuada[contador] = (contador + 1) * numeroDaTabuada;          //1 x 3, 2 x 3, 3 x 3, 4 x 3

        // for (int contador = 0; contador < 10; contador++) {
        //     System.out.printf("%d ", sequenciaTabuada[contador]);
        // }

        // //MATRIZ COM TODAS AS TABUADAS
        // int[][] todasTabuadasAte10 = new int[10][10];

        // for (int contadorX = 0; contadorX < 10; contadorX++) {
        //     for (int contadorY = 0; contadorY < 10; contadorY++) {
        //         todasTabuadasAte10[contadorX][contadorY] = (contadorX + 1) * (contadorY + 1);
        //     }
        // }

        // for (int contadorX = 0; contadorX < 10; contadorX++) {
        //     System.out.printf("\nTabuada do %02d: ", (contadorX + 1));
        //     for (int contadorY = 0; contadorY < 10; contadorY++) {
        //         System.out.printf("%03d ", todasTabuadasAte10[contadorX][contadorY]);
        //     }
        // }

        // String[] vetorPresentesEmSala = { "Rodrigo", "Jose", "Eudimar", "Katia",
        // "Maxlei", "Rafael", "Person", "Gabriel" };
        String[] vetorPresentesEmSala = new String[8];

        String[] temp = new String[20];
        

        // vetorPresentesEmSala[0] = "Rodrigo";
        // vetorPresentesEmSala[1] = "Jose";
            
        // String[][] matrizPresentesPorDia = {
        //                                         { "Jose", "Eudimar", "Katia", "Maxlei", "Rafael", "Person", "Gabriel" },    //0
        //                                         { "Rafael", "Eudimar", "Katia", "Jose", "Person" },                         //1
        //                                         { "Gabriel", "Eudimar", "Katia", "Person", "Jose" }                         //2
        // };
        // // matrizPresentesPorDia[0][0] = "Jose"; -- Dia 1 aluno 1
        // // matrizPresentesPorDia[0][1] = "Eudimar"; -- Dia 1 aluno 1
        // // matrizPresentesPorDia[1][0] = "Rafael"; -- Dia 2 aluno 1
        // // matrizPresentesPorDia[1][1] = "Eudimar"; -- Dia 2 aluno 2
        // // matrizPresentesPorDia[1][2] = "Katia"; -- Dia 2 aluno 3



        // System.out.println(vetorPresentesEmSala);

        // System.out.println(matrizPresentesPorDia);
        

    }
}
