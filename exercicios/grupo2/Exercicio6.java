/**
 * Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um
  adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais)
  * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("Criança");
        }
        else if(idade >= 13 && idade <= 17){
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulta");
        }
        else if(idade >= 60) {
            System.out.println("Idosa");
        }
        else {
            System.out.println("Idade inválida");
        }

        scanner.close();
    }
}
