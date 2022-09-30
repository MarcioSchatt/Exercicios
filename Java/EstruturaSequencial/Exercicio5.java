// Faça um Programa que converta metros para centímetros.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);

        System.out.println("Conversor de metros para centímetros");
        System.out.println("Digite quantos metros deseja converter:");

        float metros = conversor.nextInt();
        float cent = metros / 100;
        conversor.close();

        System.out.println("A conversão foi de: " + metros + "m para " + cent + "cm");
    }
}
