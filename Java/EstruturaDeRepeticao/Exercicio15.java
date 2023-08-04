// A série de Fibonacci é formada pela sequência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
// Faça um programa capaz de gerar a série até o n−ésimo termo.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci até o n-ésimo termo: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        int primeiroTermo = 0;
        int segundoTermo = 1;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                System.out.print(i + " ");
            } else {
                int resultado = primeiroTermo + segundoTermo;
                System.out.print(resultado + " ");
                primeiroTermo = segundoTermo;
                segundoTermo = resultado;
            }
        }

        scanner.close();
    }
}
