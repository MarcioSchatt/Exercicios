// Faça um programa que calcule o número médio de alunos por turma.
// Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
// As turmas não podem ter mais de 40 alunos.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        int totalAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            int alunosTurma;
            do {
                System.out.print("Digite a quantidade de alunos da turma " + i + " (não pode ser maior que 40): ");
                alunosTurma = scanner.nextInt();
            } while (alunosTurma <= 0 || alunosTurma > 40);

            totalAlunos += alunosTurma;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("Número médio de alunos por turma: " + mediaAlunosPorTurma);

        scanner.close();
    }
}
