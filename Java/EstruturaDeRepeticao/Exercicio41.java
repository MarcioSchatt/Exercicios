// Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
// Os juros e a quantidade de parcelas seguem a tabela abaixo:

// Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
// 1       0
// 3       10
// 6       15
// 9       20
// 12      25
// Exemplo de saída do programa:

// Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
// R$ 1.000,00     0               1                       R$  1.000,00
// R$ 1.100,00     100             3                       R$    366,00
// R$ 1.150,00     150             6                       R$    191,67
package EstruturaDeRepeticao;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Digite o valor da dívida: R$");
        double divida = scanner.nextDouble();

        System.out.println("Valor da Dívida  Valor dos Juros  Quantidade de Parcelas  Valor da Parcela");

        double valorParcela = 0;

        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double juros = divida * parcelas / 100.0;
            double valorTotal = divida + juros;

            if (parcelas > 1) {
                valorParcela = valorTotal / parcelas;
            }

            System.out.println("   R$ " + decimalFormat.format(valorTotal) + "     R$ " + decimalFormat.format(juros) +
                    "               " + parcelas + "               R$ " + decimalFormat.format(valorParcela));
        }

        scanner.close();
    }
}
