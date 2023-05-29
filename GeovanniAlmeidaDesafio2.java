/* Algoritmo para ler um valor e mostrar de acordo com sua quantidade
Nome : Geovanni Almeida
Data : 28/05/2023 */

import java.util.Scanner;

public class GeovanniAlmeidaDesafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite um valor inteiro acima de 1: ");
        int valor = scanner.nextInt();

        // Aqui esta o processamento e saída

        if (valor <= 1) {
            System.out.println("O valor deve ser maior que 1.");
        } else {
            for (int i = 0; i < valor; i++) {
                System.out.println(valor);
            }
        }

        scanner.close();
    }
}
