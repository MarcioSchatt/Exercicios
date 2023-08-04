// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
// Altere o programa anterior para mostrar no final a soma dos números.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        int soma = 0;

        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.print(i + " ");
                soma += i;
            }
        } else {
            for (int i = numero1; i >= numero2; i--) {
                System.out.print(i + " ");
                soma += i;
            }
        }

        System.out.println("\nSoma dos números no intervalo: " + soma);

        scanner.close();
    }
}
