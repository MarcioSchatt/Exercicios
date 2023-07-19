// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:

// a) o produto do dobro do primeiro com metade do segundo.
// b) a soma do triplo do primeiro com o terceiro.
// c) o terceiro elevado ao cubo.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numeroInteiro1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numeroInteiro2 = scanner.nextInt();

        System.out.print("Digite o número real: ");
        double numeroReal = scanner.nextDouble();

        int resultadoA = (2 * numeroInteiro1) * (numeroInteiro2 / 2);
        double resultadoB = (3 * numeroInteiro1) + numeroReal;
        double resultadoC = Math.pow(numeroReal, 3);

        System.out.println("a) O produto do dobro do primeiro com metade do segundo é: " + resultadoA);
        System.out.println("b) A soma do triplo do primeiro com o terceiro é: " + resultadoB);
        System.out.println("c) O terceiro elevado ao cubo é: " + resultadoC);

        scanner.close();
    }
}
