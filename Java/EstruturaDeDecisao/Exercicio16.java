// Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
// O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

// a) Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
// b) Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
// c) Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
// d) Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            scanner.close();
            return;
        }

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui apenas uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}
