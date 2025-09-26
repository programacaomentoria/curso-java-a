/**
 * Pergunte a data de nascimento e verifique se a data atual é a data de aniversário.
  Se for, printe a mensagem de Feliz Aniversário, senão printe a mensagem hoje e dia X de Y
  de ZZZZ.
  * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio4 {
    public static String getMonthNameByMonthNumber(int monthNumber) {
        String monthName;
        switch (monthNumber) {
        case 1:
            monthName = "Janeiro";
            break;
        case 2:
            monthName = "Fevereiro";
            break;
        case 3:
            monthName = "Março";
            break;
        case 4:
            monthName = "Abril";
            break;
        case 5:
            monthName = "Maio";
            break;
        case 6:
            monthName = "Junho";
            break;
        case 7:
            monthName = "Julho";
            break;
        case 8:
            monthName = "Agosto";
            break;
        case 9:
            monthName = "Setembro";
            break;
        case 10:
            monthName = "Outubro";
            break;
        case 11:
            monthName = "Novembro";
            break;
        case 12:
            monthName = "Dezembro";
            break;
        default:
            monthName = "";
        }
        return monthName;
    }

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá!! Digite a sua data de nascimento: ");
        String dtNascimento = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNascimentoAsDate = LocalDate.parse(dtNascimento, formatter);

        //data atual
        LocalDate currentDate = LocalDate.now();
        boolean mesmoDiaDeNascimento = currentDate.getDayOfMonth() == dtNascimentoAsDate.getDayOfMonth();
        boolean mesmoMesDeNascimento = currentDate.getMonthValue() == dtNascimentoAsDate.getMonthValue();

        if (mesmoDiaDeNascimento && mesmoMesDeNascimento) {
            System.out.println("Feliz Aniversário!!");
        } 
        else {
            System.out.println("Hoje é dia " + currentDate.getDayOfMonth() + " de " + getMonthNameByMonthNumber(currentDate.getMonthValue()) + " de " + currentDate.getYear());
        }

        scanner.close();
    }
    
    
}
