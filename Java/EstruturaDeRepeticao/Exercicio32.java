// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

// Ex.: 5!=5.4.3.2.1=120.
// A saída deve ser conforme o exemplo abaixo:

// Fatorial de: 5
// 5! =  5 . 4 . 3 . 2 . 1 = 120
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        String expressaoFatorial = numero + "! =";

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            if (i == 1) {
                expressaoFatorial += " " + i;
            } else {
                expressaoFatorial += " " + i + " .";
            }
        }

        System.out.println(expressaoFatorial + " = " + fatorial);

        scanner.close();
    }
}
