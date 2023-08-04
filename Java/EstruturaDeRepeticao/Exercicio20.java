// Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro positivo e menor que 16 para calcular o fatorial (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            } else if (numero >= 16 || numero < 0) {
                System.out.println("Número inválido! O número deve ser inteiro positivo e menor que 16.");
            } else {
                int fatorial = 1;
                System.out.print(numero + "!=");
                for (int i = numero; i >= 1; i--) {
                    if (i == 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(i+".");
                    }
                    fatorial *= i;
                }

                System.out.print("=" + fatorial + "\n");
            }
        } while (true);

        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}
