/**
 * (DESAFIO DA SEMANA 3) 
Implemente um programa que cadastre produtos com Nome, Fabricante e Preço. 
Após cada cadastro, pergunte se deseja continuar. 
Ao final, o programa deve exibir todos os produtos cadastrados e destacar o produto mais caro.

Objetivos didáticos:
- Uso de loops com controle por resposta
- Comparação de valores dentro do loop
- Identificação de máximo valor


Exemplo de saída esperada:
Produtos cadastrados:
- Caneta (Bic) - R$2.50
- Caderno (Tilibra) - R$15.00
- Mochila (Nike) - R$120.00

Produto mais caro:
- Mochila (Nike) - R$120.00

 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        String nomeProduto = "", fabricante = "", nomeProdutoMaisCaro = "";
        String produtosCadastrados = "";
        double preco = 0, precoMaisCaro = 0;
        String continuaPerguntas = "N";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scanner.nextLine();
            System.out.println("Digite o nome do fabricante: ");
            fabricante = scanner.nextLine();
            System.out.println("Digite o valor do produto: ");
            preco = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Deseja continuar o cadastro dos produtos? ");
            System.out.println("Digite S para sim ou N para parar de cadastrar.");
            continuaPerguntas = scanner.nextLine();

            produtosCadastrados += "\t- " + nomeProduto + "(" + fabricante + ") - R$ " + preco + "\n";
            if (preco > precoMaisCaro) {
                nomeProdutoMaisCaro = "\t-" + nomeProduto + "(" + fabricante + ")";
                precoMaisCaro = preco;
            }
        } while (continuaPerguntas.equals("S"));

        System.out.println("Produtos Cadastrados");
        System.out.println(produtosCadastrados);
        System.out.println("Produto mais caro: ");
        System.out.println(nomeProdutoMaisCaro + " - R$ " + precoMaisCaro);
        scanner.close();
    }
}
