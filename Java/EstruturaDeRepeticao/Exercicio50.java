// Sendo:
// -  H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
// Faça um programa que calcule o valor de H com N termos.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        double valorH = 0.0;

        for (int i = 1; i <= n; i++) {
            valorH += 1.0 / i;
        }

        System.out.println("O valor de H com " + n + " termos é: " + valorH);

        scanner.close();
    }
}
