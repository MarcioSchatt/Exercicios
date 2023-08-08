// Faça um programa que calcule o mostre a média aritmética de N notas.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas (N): ");
        int N = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / N;

        System.out.println("Média aritmética das " + N + " notas: " + media);

        scanner.close();
    }
}
