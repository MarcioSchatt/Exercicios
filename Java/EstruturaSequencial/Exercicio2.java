// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);

    System.out.println("Digite um número:");

    int num = numero.nextInt();
    numero.close();

    System.out.println("O número informado foi: " + num);
  }
}
