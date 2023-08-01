// Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
// Observando os termos no plural a colocação do "e", da vírgula entre outros.
// Exemplo:
// 326 = 3 centenas, 2 dezenas e 6 unidades
// 12 = 1 dezena e 2 unidades
// Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero >= 1000) {
            System.out.println("Número inválido. Digite um número entre 1 e 999.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            String textoCentenas = centenas > 0 ? centenas + (centenas == 1 ? " centena" : " centenas") : "";
            String textoDezenas = dezenas > 0 ? dezenas + (dezenas == 1 ? " dezena" : " dezenas") : "";
            String textoUnidades = unidades > 0 ? unidades + (unidades == 1 ? " unidade" : " unidades") : "";

            if (centenas > 0 && (dezenas > 0 || unidades > 0)) {
                textoCentenas += " e ";
            }

            if (dezenas > 0 && unidades > 0) {
                textoDezenas += " e ";
            }

            String resultado = textoCentenas + textoDezenas + textoUnidades;

            System.out.println(numero + " = " + resultado);
        }

        scanner.close();
    }
}
