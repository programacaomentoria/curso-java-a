/**
 Permissão para Dirigir: Uma pessoa pode dirigir se tiver 18 anos ou mais E possuir CNH. Peça a idade
e se possui CNH (sim/não) e informe se a pessoa pode ou não dirigir.
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio21 {

    public static boolean isPermitidoDirigir(int idade, boolean possuiCNH) {
        return (idade >= 18 && possuiCNH);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do condutor: ");
        int idadeCondutor = scanner.nextInt();
        System.out.println("Digite se o condutor possui CNH: ");
        boolean condutorPossuiCNH = scanner.nextBoolean();
        boolean permitidoDirigir = isPermitidoDirigir(idadeCondutor, condutorPossuiCNH);
        String mensagemPermitidoDirigir = "O condutor " + (!permitidoDirigir ? "não " : "") + "pode dirigir";
        System.out.println(mensagemPermitidoDirigir);
        scanner.close();
    }
}
