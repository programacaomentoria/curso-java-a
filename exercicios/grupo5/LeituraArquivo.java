package exercicios.grupo5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "exemploArquivo.txt"; // Nome do arquivo a ser lido

        // O 'try-with-resources' garante que o arquivo será fechado automaticamente
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
            // Lê linha por linha até o final do arquivo
            while ((linha = br.readLine()) != null) {
                System.out.println("\t" + linha);
            }
        } 
        catch (IOException e) {
            // Captura e imprime possíveis erros de I/O (Input/Output)
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace(); // Para detalhes técnicos do erro
        }
    }
}