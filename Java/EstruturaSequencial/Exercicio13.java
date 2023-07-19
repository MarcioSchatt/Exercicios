// Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:

// a) Para homens: (72.7*h) - 58
// b) Para mulheres: (62.1*h) - 44.7
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        double pesoIdealHomens = (72.7 * altura) - 58;
        double pesoIdealMulheres = (62.1 * altura) - 44.7;

        System.out.printf("Peso ideal para homens: %.2f kg%n", pesoIdealHomens);
        System.out.printf("Peso ideal para mulheres: %.2f kg%n", pesoIdealMulheres);

        scanner.close();
    }
}
