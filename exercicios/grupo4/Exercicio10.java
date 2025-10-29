package exercicios.grupo4;

import java.util.Scanner;

/*
 * INÍCIO

    // Declaração de variáveis
    DECLARE numeros[5] COMO REAL       // Vetor para armazenar os 5 valores
    DECLARE i COMO INTEIRO              // Variável de controle do laço
    DECLARE maior COMO REAL             // Variável para armazenar o maior valor encontrado

    // Entrada de dados: ler 5 números
    PARA i ← 0 ATÉ 4 FAÇA
        ESCREVA "Digite o valor da posição ", i + 1, ": "
        LEIA numeros[i]
    FIMPARA

    // Inicialização do maior valor com o primeiro elemento do vetor
    maior ← numeros[0]

    // Processamento: verificar qual é o maior valor
    PARA i ← 1 ATÉ 4 FAÇA
        SE (numeros[i] > maior) ENTÃO
            maior ← numeros[i]
        FIMSE
    FIMPARA

    // Saída: exibir o maior valor encontrado
    ESCREVA "O maior valor digitado é: ", maior

FIM
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        double[] numeros = new double[5];   // Vetor para armazenar os 5 valores
        double maiorNumero = 0;             // Variável para armazenar o maior valor encontrado
        Scanner leituraTeclado = new Scanner(System.in);
        
        // Entrada de dados: ler 5 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor da posição: " + (i + 1));
            numeros[i] = leituraTeclado.nextDouble();
        }
        
        // Inicialização do maior valor com o primeiro elemento do vetor
        maiorNumero = numeros[0];

        // Processamento: verificar qual é o maior valor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        
        // Saída: exibir o maior valor encontrado
        System.out.println("O maior valor digitado é: " + maiorNumero);
        leituraTeclado.close();
    }
}
