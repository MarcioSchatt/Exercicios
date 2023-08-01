// Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
