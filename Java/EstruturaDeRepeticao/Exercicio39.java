// Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura em centímetros.
// Encontre o aluno mais alto e o mais baixo.
// Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0, numeroAlunoMaisBaixo = 0;
        int alturaMaisAlto = 0, alturaMaisBaixo = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();
            System.out.print("Digite a altura do aluno (em centímetros): ");
            int alturaAluno = scanner.nextInt();

            if (alturaAluno > alturaMaisAlto) {
                alturaMaisAlto = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (alturaAluno < alturaMaisBaixo) {
                alturaMaisBaixo = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto:");
        System.out.println("Número do aluno: " + numeroAlunoMaisAlto);
        System.out.println("Altura: " + alturaMaisAlto + " cm");

        System.out.println("Aluno mais baixo:");
        System.out.println("Número do aluno: " + numeroAlunoMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixo + " cm");

        scanner.close();
    }
}
