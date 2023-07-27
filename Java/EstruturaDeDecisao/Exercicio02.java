// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        scanner.close();
    }
}
