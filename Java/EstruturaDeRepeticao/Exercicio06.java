// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
// Depois modifique o programa para que ele mostre os números um ao lado do outro.
package EstruturaDeRepeticao;

public class Exercicio06 {
    public static void main(String[] args) {
        // Um abaixo do outro
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // Um ao lado do outro
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}
