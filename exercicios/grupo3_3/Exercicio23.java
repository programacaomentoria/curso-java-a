/**
 * 
 */
package exercicios.grupo3_3;

import java.util.Collections;

public class Exercicio23 {
    /**
     * 
     * exercicio de condicional
     *  - Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um
          adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais)
     * 
     * 
     * exercicio de loop
     *  - Tabuada de um Número: Peça ao usuário para digitar um número inteiro e, em seguida, imprima a tabuada desse número (de 1 a 10).
     * 
     * exercicio de loop com condicional
     *  - Desenho de Quadrado: Peça um número ao usuário e desenhe um quadrado de asteriscos (*) com esse 
     * número de linhas e colunas. Exemplo (lado 4):
     * 
     * 
     */

    public static void main(String[] args) {

        String[] alunosDoDia = { "Eudimar", "José", "Katia", "Person", "Maxlei", "Wesley" };
        String[] alunoReorder = new String[alunosDoDia.length];
        int[] alunoEscolhido = new int[alunosDoDia.length];
        for (int indice = 0; indice < alunosDoDia.length;) {
            int alunoAleatorio = numeroAleatorio(0, alunosDoDia.length - 1);

            boolean alunoExiste = false;
            for (int indAlunoEscolhido = 0; indAlunoEscolhido < alunoEscolhido.length; indAlunoEscolhido++) {
                if (alunoEscolhido[indAlunoEscolhido] == alunoAleatorio) {
                    alunoExiste = true;
                    break;
                }
            }
            alunoEscolhido[indice] = alunoAleatorio;
            alunoReorder[indice] = alunosDoDia[alunoEscolhido[indice]];
            if (alunoExiste)
                continue;
            indice++;
        }
        for (int indAluno = 0; indAluno < alunoReorder.length; indAluno++){
            System.out.println("Aluno: " + alunoReorder[indAluno]);
        }
    }
    
    public static int numeroAleatorio(int a, int b) {
        final int min = Math.min(a, b);
        final int max = Math.max(a, b);

        return min + (int)(Math.random() * ((max - min) + 1));
    }
}