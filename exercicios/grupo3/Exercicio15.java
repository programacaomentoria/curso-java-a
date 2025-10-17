/**
 * Pergunte quantos alunos há na turma. 
    Para cada aluno, pergunte a nota e calcule a média da turma. 
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da turma: ");
        int quantidadeAlunosTurma = scanner.nextInt();
        double mediaNotas = 0;
        double somaNotasTurma = 0;

        for (int alunoLido = 1; alunoLido <= quantidadeAlunosTurma; alunoLido++) {
            System.out.printf("Digite a nota do aluno %d: ", alunoLido);
            double notaAluno = scanner.nextDouble();
            somaNotasTurma += notaAluno;
        }
        mediaNotas = somaNotasTurma / quantidadeAlunosTurma;
        System.out.printf("A média de notas da turma de %d alunos é de %.2f", quantidadeAlunosTurma, mediaNotas);
        scanner.close();


        //PRIMEIRO PERGUNTO A QUANTIDADE DE ALUNOS
        //PARA CADA ALUNO, PERGUNTAR A NOTA E SOMAR TODAS AS NOTAS (PARA CADA UMA)
        //DEPOIS QUE PERGUNTOU TODAS AS NOTAS, CALCULAR A MEDIA
        //MEDIA = SOMATORIA DE NOTAS / QUANTIDADE DE ALUNOS
        //EXIBIR O RESULTADO

    }
}
