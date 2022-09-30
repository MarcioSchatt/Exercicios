// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em F:");
        int fahrenheit = sc.nextInt();
        int celsius = 5 * ((fahrenheit - 32) / 9);
        sc.close();

        System.out.println(fahrenheit + "F é igual a " + celsius + "°C");
    }
}
