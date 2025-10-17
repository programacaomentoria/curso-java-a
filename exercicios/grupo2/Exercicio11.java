/**
 * Pergunte uma letra (V, A, B).
 Diga a cor correspondente (Vermelho, Azul, Branco).
 Atenção, utilize a estrutura CASE.
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma das letras: V, A ou B");
        String charactere = scanner.nextLine();
        String palavraDaLetra = "";
        switch (charactere.toUpperCase()) {
            case "V":
                palavraDaLetra = "Vermelho";
                break;
            case "A":
                palavraDaLetra = "Azul";
                break;
            case "B":
                palavraDaLetra = "Branco";
                break;
            default:
                palavraDaLetra = "Cor não reconhecida";
                break;
        }
        System.out.printf("A cor correspondente a letra %s é: %s", charactere, palavraDaLetra);
        scanner.close();
    }
}
