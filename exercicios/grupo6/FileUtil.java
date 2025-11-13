package exercicios.grupo6;

public class FileUtil {
    public static void appendLineToFile(String fileName, String line) throws java.io.IOException {
        java.io.FileWriter fileWriter = new java.io.FileWriter(fileName, java.nio.charset.StandardCharsets.UTF_8, true);
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
        bufferedWriter.write(line);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static String[] loadLinesFromFile(String fileName) {
        java.util.List<String> lines = new java.util.ArrayList<>();
        try {
            java.io.FileReader fileReader = new java.io.FileReader(fileName, java.nio.charset.StandardCharsets.UTF_8);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (java.io.IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return lines.toArray(new String[0]);
    }
}
