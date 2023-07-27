// Faça um Programa que leia três números e mostre o maior e o menor deles.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        // Encontrar o maior número entre os três
        double maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }

        // Encontrar o menor número entre os três
        double menorNumero = numero1;
        if (numero2 < menorNumero) {
            menorNumero = numero2;
        }
        if (numero3 < menorNumero) {
            menorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }
}
