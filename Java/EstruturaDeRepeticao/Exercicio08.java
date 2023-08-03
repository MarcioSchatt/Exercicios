// Faça um programa que leia 5 números e informe a soma e a média dos números.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 5 números: ");

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
