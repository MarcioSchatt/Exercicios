// Faça um Programa que leia um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (1 a 7) para representar o dia da semana: ");
        int numeroDia = scanner.nextInt();

        String diaSemana;
        switch (numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
                System.out.println(diaSemana);
                System.exit(numeroDia);
        }

        System.out.println("Dia correspondente da semana: " + diaSemana);

        scanner.close();
    }
}
