// Faça um Programa que pergunte em que turno você estuda.
// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? Digite M para Matutino, V para Vespertino ou N para Noturno: ");
        char turno = scanner.next().charAt(0);

        // Verificar o turno informado e mostrar a saudação
        switch (turno) {
            case 'M':
            case 'm':
                System.out.println("Bom Dia!");
                break;
            case 'V':
            case 'v':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
            case 'n':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido.");
        }

        scanner.close();
    }
}
