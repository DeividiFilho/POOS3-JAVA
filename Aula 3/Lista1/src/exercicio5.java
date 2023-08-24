import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor para armazenar as temperaturas
        int[] temperaturas = new int[7];

        // Lê as temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }

        // Calcula a média das temperaturas
        int media = 0;
        for (int temperatura : temperaturas) {
            media += temperatura;
        }
        media /= temperaturas.length;

        // Conta os dias em que a temperatura esteve acima da média
        int diasAcimaDaMedia = 0;
        for (int temperatura : temperaturas) {
            if (temperatura > media) {
                diasAcimaDaMedia++;
            }
        }

        // Imprime o resultado
        System.out.println("A temperatura esteve acima da média em " + diasAcimaDaMedia + " dias.");
    }
}
