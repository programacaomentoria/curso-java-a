/**
 * Pergunte um número de 1 a 7.
  Diga a qual dia da semana esse número é correspondente (1 = Domingo, 2 = Segunda, ..., 7 =
  Sábado). Atenção, utilize a estrutura CASE.
  * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana, sendo: ");
        System.out.println("\t1 - Segunda-feira");
        System.out.println("\t2 - Terça-feira");
        System.out.println("\t3 - Quarta-feira");
        System.out.println("\t4 - Quinta-feira");
        System.out.println("\t5 - Sexta-feira");
        System.out.println("\t6 - Sábado");
        System.out.println("\t7 - Domingo");
        int diaDaSemana = scanner.nextInt();
        String diaDaSemanaDigitado;
        //logica, usa o switch no proprio codigo ou
        //usando um método para "calcular a data da semana" getWeekdayNameByNumber(diaDaSemana)

        switch (diaDaSemana) {
        case 1:
            diaDaSemanaDigitado = "Segunda-feira";
            break;
        case 2:
            diaDaSemanaDigitado = "Terça-feira";
            break;
        case 3:
            diaDaSemanaDigitado = "Quarta-feira";
            break;
        case 4:
            diaDaSemanaDigitado = "Quinta-feira";
            break;
        case 5:
            diaDaSemanaDigitado = "Sexta-feira";
            break;
        case 6:
            diaDaSemanaDigitado = "Sábado";
            break;
        case 7:
            diaDaSemanaDigitado = "Domingo";
            break;
        default:
            diaDaSemanaDigitado = "";
        }

        if (diaDaSemanaDigitado != "") {
            System.out.println("O dia da semana escolhido foi " + diaDaSemanaDigitado);
        }
        else {
            System.out.println("Dia Inválido!!");
        }
        

        scanner.close();
    }
    /*
    public static String getWeekdayNameByNumber(int number) {
        String weekdayName;
        switch (number) {
        case 1:
            weekdayName = "Segunda-feira";
            break;
        case 2:
            weekdayName = "Terça-feira";
            break;
        case 3:
            weekdayName = "Quarta-feira";
            break;
        case 4:
            weekdayName = "Quinta-feira";
            break;
        case 5:
            weekdayName = "Sexta-feira";
            break;
        case 6:
            weekdayName = "Sábado";
            break;
        case 7:
            weekdayName = "Domingo";
            break;
        default:
            weekdayName = "Dia Inválido";
        }
        return weekdayName;
    }
    */
}
