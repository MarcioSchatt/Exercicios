// Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
// O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

// - par ou ímpar;
// - positivo ou negativo;
// - inteiro ou decimal.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scanner.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Escolha inválida. Saindo do programa.");
                scanner.close();
                return;
        }

        System.out.println("Resultado da operação: " + resultado);

        String parOuImpar = resultado % 2 == 0 ? "par" : "ímpar";
        String positivoOuNegativo = resultado >= 0 ? "positivo" : "negativo";
        String inteiroOuDecimal = resultado == Math.round(resultado) ? "inteiro" : "decimal";

        System.out.println("O número é " + parOuImpar + ", " + positivoOuNegativo + " e " + inteiroOuDecimal + ".");

        scanner.close();
    }
}
