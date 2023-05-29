/* Algoritmo que mostre todos os números de 0 a 200 e a cada múltiplo de 10
Nome : Geovanni Almeida
Data : 28/05/2023 */


public class GeovanniAlmeidaDesafio1 {
  public static void main(String[] args) {

    // Aqui esta a entrada

      int contador1 = 0;
      int contador2 = 0;

    // Aqui esta o processamento e saída
      
      while (contador1 <= 200) {
          if (contador2 == 10) {
              System.out.println("O número " + contador1 + " é um múltiplo de 10");
              contador2 = 0;
          } else {
              System.out.println(contador1);
          }

          contador1++;
          contador2++;
      }
  }
}
