import java.util.Scanner;

public class exercicio7 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declara um vetor de cinco posições
    int[] a = new int[5];

    // Lê os valores do vetor A
    for (int i = 0; i < a.length; i++) {
        System.out.print("Digite o valor do elemento A[" + i + "]: ");
        a[i] = scanner.nextInt();
    }

    // Declara as variáveis para armazenar as somas dos elementos ímpares e pares
    int somaImpar = 0;
    int somaPar = 0;

    // Calcula a soma dos elementos ímpares
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 1) {
            somaImpar += a[i];
        }
    }

    // Calcula a soma dos elementos pares
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            somaPar += a[i];
        }
    }

    // Imprime os resultados
    System.out.println("A soma dos elementos ímpares é: " + somaImpar);
    System.out.println("A soma dos elementos pares é: " + somaPar);
}

}
