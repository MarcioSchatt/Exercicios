// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em °C:");
        int celsius = sc.nextInt();
        int fahrenheit = celsius * (9/5) + 32;
        sc.close();

        System.out.println(celsius + "°C é igual a " + fahrenheit + "F");
    }
}