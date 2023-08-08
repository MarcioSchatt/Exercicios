// Um funcionário de uma empresa recebe aumento salarial anualmente:

// Sabe-se que:
// a) Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
// b) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
// c) A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.

// Faça um programa que determine o salário atual desse funcionário.
// Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.
package EstruturaDeRepeticao;

public class Exercicio38 {
    public static void main(String[] args) {
        int anoContratacao = 1995;
        double salarioInicial = 1000.0;
        double percentualAumento = 0.015;
        int anoAtual = 2023;

        for (int ano = anoContratacao + 1; ano <= anoAtual; ano++) {
            salarioInicial += salarioInicial * percentualAumento;
            percentualAumento *= 2;
        }

        System.out.println("Salário atual em " + anoAtual + ": R$" + salarioInicial);
    }
}
