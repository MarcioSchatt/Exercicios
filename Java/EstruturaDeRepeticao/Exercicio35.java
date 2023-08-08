// Encontrar números primos é uma tarefa difícil.
// Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + numero + ":");

        for (int i = 2; i <= numero; i++) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean primeNumber(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
