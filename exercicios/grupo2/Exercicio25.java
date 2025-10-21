/**
 Temperatura Ideal para Atividade: Para praticar um esporte ao ar livre, a temperatura deve estar entre
10°C E 30°C (inclusive). Peça a temperatura e informe se é "Ideal para o esporte" ou "Não ideal".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio25 {

    public static boolean checkTemperatura(double temperatura) {
        return (temperatura >= 10 & temperatura <= 30);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura atual: ");
        double temperaturaAtual = scanner.nextDouble();
        String mensagemTemperatura = "A temperatura " + (checkTemperatura(temperaturaAtual) ? "está ideal para praticar esportes" : "não está ideal para praticar esportes") + ".";
        System.out.println(mensagemTemperatura);
        scanner.close();
    }
}
