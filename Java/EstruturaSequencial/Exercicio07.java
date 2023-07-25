// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área de um círculo:");

        double area = sc.nextDouble();
        double dobroArea = area * 2;
        sc.close();

        System.out.println("O dobro da área de " + area + "m é " + dobroArea + "m");
    }
}
