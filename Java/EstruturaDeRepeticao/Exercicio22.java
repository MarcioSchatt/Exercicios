// Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean ehPrimo = true;
            String divisores = "";

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    divisores += i + " ";
                }
            }

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
                System.out.println(numero + " é divisível por: " + divisores);
            }
        }

        scanner.close();
    }
}
