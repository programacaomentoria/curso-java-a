package exercicios.grupo5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "saida.txt"; // Nome do arquivo a ser escrito
        String conteudo = "Olá, alunos!\nEste é um teste de escrita em Java.\n" +
                          "A terceira linha do nosso arquivo.";

        // O 'try-with-resources' garante que o arquivo será fechado automaticamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            bw.write(conteudo); // Escreve a string inteira no arquivo
            System.out.println("Dados escritos com sucesso no arquivo " + nomeArquivo);
        }
        catch (IOException e) {
            // Captura e imprime possíveis erros de I/O
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        // Exemplo de como adicionar (append) a um arquivo existente
        // FileWriter(nomeArquivo, true) indica modo de anexar (append)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            bw.newLine(); // Adiciona uma nova linha antes do conteúdo
            bw.write("Esta linha foi adicionada depois!");
            System.out.println("Conteúdo adicionado com sucesso ao arquivo " + nomeArquivo);
        }
        catch (IOException e) {
            System.err.println("Erro ao adicionar ao arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}