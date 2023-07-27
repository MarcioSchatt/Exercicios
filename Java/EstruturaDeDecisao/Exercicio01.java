// Faça um Programa que peça dois números e imprima o maior deles.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int maiorNumero = numero1 > numero2 ? numero1 : numero2;
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
