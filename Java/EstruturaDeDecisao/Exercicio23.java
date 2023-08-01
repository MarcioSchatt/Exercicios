// Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
// Dica: utilize uma função de arredondamento.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero == Math.round(numero)) {
            System.out.println(numero + " é um número inteiro.");
        } else {
            System.out.println(numero + " é um número decimal.");
        }

        scanner.close();
    }
}
