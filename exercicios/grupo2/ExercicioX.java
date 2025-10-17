package exercicios.grupo2;

import java.util.Scanner;

public class ExercicioX {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i++);
        }
        
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (true) {
            if (numero % 2 == 0) {
                System.out.println("O numero: " + numero++ + " é par");
            }
            // numero++;
            if(numero == 100)
                break;
            // break;
            // continue;
        }

        // do{
        //     System.out.println("Digite uma opcao: ");
        //     System.out.println("1 - Cadastrar nome do aluno");
        //     System.out.println("2 - Calcular media do aluno");
        //     System.out.println("3 - Sair do programa");
        //     menu = scanner.nextInt();
        //     System.out.println("Opcao selecionada: " + menu);
        // } while (menu != 3);
    }
}
