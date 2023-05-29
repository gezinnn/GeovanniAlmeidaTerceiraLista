/* Algoritmo para ler dois números e mostrar os números entre eles
Nome : Geovanni Almeida
Data : 28/05/2023*/

import java.util.Scanner;

public class GeovanniAlmeidaExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        // Aqui esta o processamento
        int menor = Math.min(valor1, valor2);
        int maior = Math.max(valor1, valor2);

        System.out.println("Números entre " + menor + " e " + maior + ":");

        // Aqui esta a saída
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
