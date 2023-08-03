// Faça um programa que leia 5 números e informe o maior número.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 5 números: ");

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
