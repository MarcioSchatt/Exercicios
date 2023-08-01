// Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
// Dica: utilize o operador módulo (resto da divisão).
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        scanner.close();
    }
}
