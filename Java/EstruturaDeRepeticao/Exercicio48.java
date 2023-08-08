// Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
// Exemplo:
//   12376489
//   => 98467321
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);

        scanner.close();
    }
}
