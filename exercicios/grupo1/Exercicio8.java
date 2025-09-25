/*
 * Objetivo: 
  Você está montando um cadastro para uma empresa de vendas na internet, e precisa fornecer este "formulário de dados de clientes".
  Não se preocupe neste momento se irá ou não guardar este dado em algum lugar.
  Pergunte e obtenha os seguintes dados e depois exiba todos na tela:
  - Nome Completo
  - Data de Nascimento
  - Cidade/País de Origem(Nascimento)
  - Endereço completo de onde mora
  - País onde reside
  - Data do Cadastro
  - Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior
 * @creator: Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio8 {

    public static void criarLinhaCabecalho() {
        System.out.println("=======================================");
    }

    public static void criarCabecalhoMensagem(String mensagemCabecalho) {
        criarLinhaCabecalho();
        System.out.printf("%s", mensagemCabecalho);
        criarLinhaCabecalho();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        criarCabecalhoMensagem("Cadastro de Clientes\n\0");
            
        System.out.print("Nome Completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Cidade/País de Origem (Nascimento): ");
        String cidadePaisOrigem = scanner.nextLine();

        System.out.print("Endereço Completo: ");
        String enderecoCompleto = scanner.nextLine();

        System.out.print("País residência: ");
        String paisResidencia = scanner.nextLine();

        System.out.print("Escolaridade (Ensino Básico/ Ensino Fundamental/ Ensino Superior): ");
        String escolaridade = scanner.nextLine();

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataCadastro = currentDate.format(formatter);

        System.out.printf("\n");
        criarCabecalhoMensagem("Dados do cliente cadastrado\n\0");

        System.out.printf("\nNome Completo: %s", nomeCompleto);
        System.out.printf("\nData de Nascimento: %s", dataNascimento);
        System.out.printf("\nCidade/País de Origem: %s", cidadePaisOrigem);
        System.out.printf("\nEndereço Completo: %s", enderecoCompleto);
        System.out.printf("\nPaís de Residência: %s", paisResidencia);
        System.out.printf("\nEscolaridade: %s", escolaridade);
        System.out.printf("\nData de Cadastro: %s\n", dataCadastro);

        scanner.close();
    }
}
