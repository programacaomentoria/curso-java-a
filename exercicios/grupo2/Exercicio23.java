/**
Condição de Crédito: Um cliente pode obter crédito se tiver renda mensal acima de R$2000,00 OU se
tiver um bom histórico de crédito (digite "bom" ou "ruim"). Informe se o crédito é "Aprovado" ou
"Negado".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio23 {

    public static boolean hasCreditoAprovado(double salario, String historicoCredito) {
        boolean isGoodHistoricoCredito = historicoCredito.toLowerCase().equals("bom");
        return (salario > 2000 && isGoodHistoricoCredito);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        Double rendaMensal = scanner.nextDouble();

        System.out.println("Digite o histórico do cliente(bom ou ruim): ");
        String historicoCredito = scanner.nextLine();
        
        boolean creditoAprovado = hasCreditoAprovado(rendaMensal, historicoCredito);
        System.out.println("O Crédito foi " + (creditoAprovado ? "Aprovado" : "Reprovado"));
        scanner.close();
    }
}