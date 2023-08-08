// Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
// Um número primo é aquele que é divisível apenas por um e por ele mesmo.
// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (primeNumber(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
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
