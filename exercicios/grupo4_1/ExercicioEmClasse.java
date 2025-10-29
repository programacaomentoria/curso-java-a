package exercicios.grupo4_1;

public class ExercicioEmClasse {
    public static void main(String[] args) {
        String[] vetorNomeProduto = new String[] {"Livro de Farofa", "Livro de Receita de Carne", "Kit Utensilios", "Kit Churrasco"};
        double[] vetorPrecos = new double[] {75.26, 23.25, 126.15, 189.90};
        int[] vetorQtde = new int[] { 10, 10, 10, 3 };
        
        //DECLARAR VARIAVEL DE SOMATORIA DE PRODUTOS (SEM DESCONTO)
        //DECLARAR VARIAVEL DE SOMATORIA DE PRODUTOS (COM DESCONTO)
        double[] totalDoCarrinhoDeCompras = new double[2];

        double totalDoCarrinhoSemDesconto = 0;
        double totalDoCarrinhoComDesconto = 0;

        //na posicao 0 valor sem desconto
        //na posicao 1 valor com desconto

        //VARRER OS ELEMENTOS MOSTRANDO O PRODUTO, PRECO E QTDE DENTRO DA CESTA DE PRODUTOS
        //CALCULAR O VALOR TOTAL COM BASE NAS DUAS REGRAS, 
        //  COM DESCONTO (QUANDO A QTDE DE ITENS DO PRODUTO NA CESTA FOR IMPAR) - DESCONTO DE 15%
        //a Katia atraves da GMUD pediu para incluir para os livros, dar um desconto extra de 30% -- JIRA 021398123
        //  OU QUANDO NAO FOR IMPAR, NAO APLICAR DESCONTO ALGUM
        for (int indice = 0; indice < vetorNomeProduto.length; indice++) {
            double valorDoItemSemDesconto = vetorPrecos[indice] * vetorQtde[indice];
            double valorDoItemComDesconto = valorDoItemSemDesconto;
            //SE A QUANTIDADE DE ITENS FOR IMPAR, APLICAR 15% DE DESCONTO
            if (vetorQtde[indice] % 2 == 1) {
                valorDoItemComDesconto -= (valorDoItemComDesconto * 0.15);
            }

            System.out.println("\t" + indice + "\t" + vetorNomeProduto[indice] + ((indice == 1) ? "\t" : "\t\t\t") + vetorPrecos[indice] + "\t"
                    + vetorQtde[indice] + "\t" + valorDoItemSemDesconto + "\t" + valorDoItemComDesconto);
            totalDoCarrinhoSemDesconto += valorDoItemSemDesconto;
            totalDoCarrinhoComDesconto += valorDoItemComDesconto;

            totalDoCarrinhoDeCompras[0] += valorDoItemSemDesconto;
            totalDoCarrinhoDeCompras[1] += valorDoItemComDesconto;
        }

        //MOSTRAR AO FINAL O VALOR TOTAL DA COMPRA SEM DESCONTO
        //MOSTRAR AO FINAL O VALOR TOTAL DA COMPRA COM DESCONTO
        System.out.println("\t\t\t\t\t\t\t" + totalDoCarrinhoSemDesconto + "\t" + totalDoCarrinhoComDesconto);
        System.out.println("\t\t\t\t\t\t\t" + totalDoCarrinhoDeCompras[0] + "\t" + totalDoCarrinhoDeCompras[1]);
    }
}
