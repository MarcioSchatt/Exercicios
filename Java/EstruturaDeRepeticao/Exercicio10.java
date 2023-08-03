// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        if (numero1 <= numero2) {
            for (int i = numero1+1; i <= numero2-1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = numero1-1; i >= numero2+1; i--) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
