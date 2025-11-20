package exercicios.grupo6;

public class Strings {
    public static void main(String[] args) {
        String nome = "   Rodrigo Fischer   ";
        System.out.println("Nome original: '" + nome + "'");
        
        String nomeTrimmed = nome.trim();
        System.out.println("Nome após trim(): '" + nomeTrimmed + "'");

        String nomeUpper = nomeTrimmed.toUpperCase();
        System.out.println("Nome em maiúsculas: '" + nomeUpper + "'");

        String nomeLower = nomeTrimmed.toLowerCase();
        System.out.println("Nome em minúsculas: '" + nomeLower + "'");

        int comprimento = nomeTrimmed.length();
        System.out.println("Comprimento do nome: " + comprimento);

        String[] partes = nomeTrimmed.split(" ");
        System.out.println("Partes do nome:");
        for (String parte : partes) {
            System.out.println("- '" + parte + "'");
        }

        String nomeSub = nomeTrimmed.substring(0, 7);
        System.out.println("Substring (0, 7): '" + nomeSub + "'");
        
        int indiceF = nomeTrimmed.indexOf('F');
        System.out.println("Índice da letra 'F': " + indiceF);

        String nomeReplace = nomeTrimmed.replace("Rodrigo", "Rodolfo");
        System.out.println("Nome após replace: '" + nomeReplace + "'");

        
    }
}
