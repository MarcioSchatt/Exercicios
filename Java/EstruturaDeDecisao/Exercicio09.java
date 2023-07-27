// Faça um Programa que leia três números e mostre-os em ordem decrescente.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maior, meio, menor;
        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
            if (numero2 >= numero3) {
                meio = numero2;
                menor = numero3;
            } else {
                meio = numero3;
                menor = numero2;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
            if (numero1 >= numero3) {
                meio = numero1;
                menor = numero3;
            } else {
                meio = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 >= numero2) {
                meio = numero1;
                menor = numero2;
            } else {
                meio = numero2;
                menor = numero1;
            }
        }

        System.out.println("Os números em ordem decrescente são: " + maior + ", " + meio + ", " + menor);

        scanner.close();
    }
}
