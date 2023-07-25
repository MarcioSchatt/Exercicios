// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu salário por hora: R$");
        double salario = sc.nextDouble();

        System.out.println("Horas trabalhadas no mês:");
        double horas = sc.nextDouble();

        double salarioTotal = salario * horas;
        sc.close();

        System.out.println("Salário total é de: R$" + salarioTotal);
    }
}
