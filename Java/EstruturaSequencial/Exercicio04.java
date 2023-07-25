// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner bimestral = new Scanner(System.in);

        System.out.println("Digite as 4 notas bimestrais:");

        float nota1 = bimestral.nextFloat();
        float nota2 = bimestral.nextFloat();
        float nota3 = bimestral.nextFloat();
        float nota4 = bimestral.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        bimestral.close();

        System.out.println("A média total das notas é: " + media);
    }
}
