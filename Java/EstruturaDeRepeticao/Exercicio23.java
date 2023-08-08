// Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio23 {
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
