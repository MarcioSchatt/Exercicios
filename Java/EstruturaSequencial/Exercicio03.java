// Faça um Programa que peça dois números e imprima a soma.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite dois números:");

        int num1 = numero.nextInt();
        int num2 = numero.nextInt();
        int soma = num1 + num2;
        numero.close();

        System.out.println("A soma de " + num1 + " mais " + num2 + " é igual a " + soma);
    }
}
