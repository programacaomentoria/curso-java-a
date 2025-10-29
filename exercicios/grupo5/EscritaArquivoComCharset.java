package exercicios.grupo5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets; // Import para StandardCharsets

public class EscritaArquivoComCharset {
    public static void main(String[] args) {
        String nomeArquivo = "exemplo_utf8.txt";
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(nomeArquivo), StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo com UTF-8: " + e.getMessage());
        }
    }   
}