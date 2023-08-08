// Faça um programa que mostre os n termos da Série a seguir:
//   S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
// Imprima no final a soma da série.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        double soma = 0.0;
        int numerador = 1;
        int denominador = 1;

        System.out.print("Série: ");
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" + ");
            }
            
            System.out.print(numerador + "/" + denominador);

            soma += (double) numerador / denominador;

            numerador++;
            denominador += 2;
        }

        System.out.println("\nSoma da série: " + soma);

        scanner.close();
    }
}
