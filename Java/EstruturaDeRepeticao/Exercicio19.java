// Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
// Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("Numero inválido.");
            scanner.close();
            return;
        }

        int menor = 1001;
        int maior = -1;
        int soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o " + i + "º número (entre 0 e 1000): ");
            int numero = scanner.nextInt();

            while (numero < 0 || numero > 1000) {
                System.out.print("Número inválido! Digite o " + i + "º número (entre 0 e 1000): ");
                numero = scanner.nextInt();
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
    }
}
