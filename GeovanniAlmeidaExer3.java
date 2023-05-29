/* Algoritmo para calcular a média entre 500 números inseridos.
Nome : Geovanni Almeida
Data : 28/05/2023 */

import java.util.Scanner;

public class GeovanniAlmeidaExer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        int totalNumeros = 500;
        int soma = 0;

        // Aqui esta o processamento

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / totalNumeros;

        // Aqui esta a saída

        System.out.println("A média dos " + totalNumeros + " números é: " + media);

        scanner.close();
    }
}
