/**
 * Conceito por Nota: Com base na nota de um aluno (0 a 100), atribua um conceito:
90-100: A
80-89: B
70-79: C
60-69: D
Abaixo de 60: F
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio19 {

    public static String retornarConceitoComBaseNaNota(int notaVerifica) {
        String conceitoNota = "";
        int parteInteiraNota = notaVerifica / 10;
        switch (parteInteiraNota) {
            case 9, 10:
                conceitoNota = "A";
                break;
            case 8:
                conceitoNota = "B";
                break;
            case 7:
                conceitoNota = "C";
                break;
            case 6:
                conceitoNota = "D";
                break;
            case 5, 4, 3, 2, 1, 0:
                conceitoNota = "F";
                break;
            default:
                conceitoNota = "";
                break;
        }
        return conceitoNota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 100: ");
        int nota = scanner.nextInt();
        String notaConceito = retornarConceitoComBaseNaNota(nota);
        System.out.println("A nota conceito é: " + notaConceito);
        scanner.close();
    }
}
