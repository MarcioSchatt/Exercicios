// Uma fruteira está vendendo frutas com a seguinte tabela de preços:

//                       Até 5 Kg           Acima de 5 Kg
// Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
// Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
// Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PRECO_MORANGO_ATE_5KG = 2.50;
        double PRECO_MORANGO_ACIMA_5KG = 2.20;
        double PRECO_MACA_ATE_5KG = 1.80;
        double PRECO_MACA_ACIMA_5KG = 1.50;
        double DESCONTO_ADICIONAL = 0.10;

        System.out.print("Digite a quantidade (em Kg) de morangos adquiridos: ");
        double quantidadeMorangos = scanner.nextDouble();

        System.out.print("Digite a quantidade (em Kg) de maçãs adquiridas: ");
        double quantidadeMacas = scanner.nextDouble();

        double valorTotalMorangos = 0;
        double valorTotalMacas = 0;

        if (quantidadeMorangos <= 5) {
            valorTotalMorangos = quantidadeMorangos * PRECO_MORANGO_ATE_5KG;
        } else {
            valorTotalMorangos = quantidadeMorangos * PRECO_MORANGO_ACIMA_5KG;
        }

        if (quantidadeMacas <= 5) {
            valorTotalMacas = quantidadeMacas * PRECO_MACA_ATE_5KG;
        } else {
            valorTotalMacas = quantidadeMacas * PRECO_MACA_ACIMA_5KG;
        }

        double valorTotalCompra = valorTotalMorangos + valorTotalMacas;

        if ((quantidadeMorangos + quantidadeMacas) > 8 || valorTotalCompra > 25) {
            valorTotalCompra *= (1 - DESCONTO_ADICIONAL);
        }

        System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotalCompra);

        scanner.close();
    }
}
