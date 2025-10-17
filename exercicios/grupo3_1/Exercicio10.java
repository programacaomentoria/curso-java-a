/**
 * Menu de Opções: Crie um menu simples que exiba as opções "1. Iniciar", "2. Configurar", "3. Sair". 
 * O programa deve continuar exibindo o menu até que o usuário escolha a opção "3".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // exibir as opcoes 1. Iniciar, 2. Configurar, 3. Sair
        // solicitar que se digite a escolha/opcao
        // verificar se a opcao não é 3, senao, perguntar novamente.
        //se a opcao digitada for a 3, sair das opcoes
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 0;
        do{
            System.out.println("Digite uma das 3 opções:");
            System.out.println("\t1. Iniciar");
            System.out.println("\t2. Configurar");
            System.out.println("\t3. Sair");
            opcaoMenu = scanner.nextInt();
            // if (opcaoMenu < 1 || opcaoMenu > 3) {
            //     System.out.println("Opcao Invalida. Tente novamente...");
            // }
            // else if (opcaoMenu == 1) {
            //     System.out.println("Entrou na rotina de iniciar");
            // }
            // else if (opcaoMenu == 2) {
            //     System.out.println("Entrou na rotina de configurar");
            // }
        } while(opcaoMenu != 3);
        scanner.close();
    }
}
