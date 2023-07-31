// Faça um programa para o cálculo de uma folha de pagamento.
// Sabendo que os descontos são do Imposto de Renda, que depende do salário bruto, e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
// O Salário Líquido corresponde ao Salário Bruto menos os descontos.
// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

// Desconto do IR:
// - Salário Bruto até 900 (inclusive) - isento
// - Salário Bruto até 1500 (inclusive) - desconto de 5%
// - Salário Bruto até 2500 (inclusive) - desconto de 10%
// - Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

//         Salário Bruto: (5 * 220)        : R$ 1100,00
//         (-) IR (5%)                     : R$   55,00  
//         (-) INSS ( 10%)                 : R$  110,00
//         FGTS (11%)                      : R$  121,00
//         Total de descontos              : R$  165,00
//         Salário Liquido                 : R$  935,00
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: R$");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = inss;
        double salarioLiquido;
        String percentualIR;

        if (salarioBruto <= 900) {
            totalDescontos += 0;
            percentualIR = "Isento";
        } else if (salarioBruto <= 1500) {
            totalDescontos += salarioBruto * 0.05;
            percentualIR = "5%";
        } else if (salarioBruto <= 2500) {
            totalDescontos += salarioBruto * 0.10;
            percentualIR = "10%";
        } else {
            totalDescontos += salarioBruto * 0.20;
            percentualIR = "20%";
        }

        salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (R$%.2f * %d): R$%.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%s): R$%.2f%n", percentualIR, totalDescontos - inss);
        System.out.printf("(-) INSS (10%%): R$ %.2f%n", inss);
        System.out.printf("FGTS (11%%): R$ %.2f%n", fgts);
        System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
