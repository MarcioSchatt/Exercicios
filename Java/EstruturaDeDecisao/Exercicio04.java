// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal.");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("A letra é uma consoante.");
        } else {
            System.out.println("Caractere inválido.");
        }

        scanner.close();
    }
}
