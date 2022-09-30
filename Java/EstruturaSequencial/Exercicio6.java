// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo:");

        double raio = sc.nextFloat();
        double area = (raio * 2) * 3.14;
        sc.close();

        System.out.println("A área total do círculo é: " + area);
    }
}
