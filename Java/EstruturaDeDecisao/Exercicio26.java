// Um posto está vendendo combustíveis com a seguinte tabela de descontos:

// Álcool: até 20 litros, desconto de 3% por litro. Acima de 20 litros, desconto de 5% por litro
// Gasolina: até 20 litros, desconto de 4% por litro. acima de 20 litros, desconto de 6% por litro

// Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
// calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoGasolina = 2.50;
        double precoAlcool = 1.90;

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipoCombustivel = scanner.next().toUpperCase();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double valorAPagar = 0;

        if (tipoCombustivel.equals("A")) {
            if (litrosVendidos <= 20) {
                valorAPagar = litrosVendidos * precoAlcool * 0.97;
            } else {
                valorAPagar = litrosVendidos * precoAlcool * 0.95;
            }
        } else if (tipoCombustivel.equals("G")) {
            if (litrosVendidos <= 20) {
                valorAPagar = litrosVendidos * precoGasolina * 0.96;
            } else {
                valorAPagar = litrosVendidos * precoGasolina * 0.94;
            }
        } else {
            System.out.println("Tipo de combustível inválido. Use A para álcool ou G para gasolina.");
            scanner.close();
            return;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

        scanner.close();
    }
}
