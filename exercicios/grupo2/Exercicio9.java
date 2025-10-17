/**
 * Pergunte o número do mês (1 a 12).
   Diga quantos dias ele tem (ano não bissexto).
   Atenção, utilize a estrutura CASE
   @author: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês como número (1 a 12): ");
        int mes = scanner.nextInt();
        int nrDiasNoMes = 0;

        System.out.println("O ano é bissexto? ");
        boolean anoBissexto = scanner.nextBoolean();

        switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12:
            nrDiasNoMes = 31;
            break;
          case 2:
            nrDiasNoMes = anoBissexto ? 29 : 28;
            break;
          case 4, 6, 9, 11:
            nrDiasNoMes = 30;
            break;
          default:
            nrDiasNoMes = 0;
            break;
        }

        if(anoBissexto) System.out.println("O ano é bissexto!!");
        System.out.printf("A quantidade de dias do mês de %s é: %d", Exercicio4.getMonthNameByMonthNumber(mes) , nrDiasNoMes);
        scanner.close();
    }
}
