// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.

// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

// a) salário bruto.
// b) quanto pagou ao INSS.
// c) quanto pagou ao sindicato.
// d) o salário líquido.
// e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
//     + Salário Bruto : R$
//     - IR (11%) : R$
//     - INSS (8%) : R$
//     - Sindicato ( 5%) : R$
//     = Salário Liquido : R$
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor ganho por hora: R$ ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadasNoMes = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadasNoMes;

        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        System.out.printf("+ Salário Bruto : R$ %.2f%n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f%n", descontoIR);
        System.out.printf("- INSS (8%%) : R$ %.2f%n", descontoINSS);
        System.out.printf("- Sindicato (5%%) : R$ %.2f%n", descontoSindicato);
        System.out.printf("= Salário Líquido : R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
