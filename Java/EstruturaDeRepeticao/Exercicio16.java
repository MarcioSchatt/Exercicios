// A série de Fibonacci é formada pela seqüência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
// Faça um programa que gere a série até que o valor seja maior que 500.
package EstruturaDeRepeticao;

public class Exercicio16 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int resultado = 0;

        System.out.print("Série de Fibonacci até que o valor seja maior que 500: ");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");

        while (resultado <= 500) {
            resultado = primeiroTermo + segundoTermo;
            if (resultado <= 500) {
                System.out.print(resultado + " ");
            }
            primeiroTermo = segundoTermo;
            segundoTermo = resultado;
        }
    }
}
