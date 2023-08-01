// Faça um Programa que peça os 3 lados de um triângulo.
// O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

// Dicas:
// - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
// - Triângulo Equilátero: três lados iguais;
// - Triângulo Isósceles: quaisquer dois lados iguais;
// - Triângulo Escaleno: três lados diferentes;
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os valores podem formar um triângulo.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero: três lados iguais.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles: quaisquer dois lados iguais.");
            } else {
                System.out.println("Triângulo Escaleno: três lados diferentes.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }

        scanner.close();
    }
}
