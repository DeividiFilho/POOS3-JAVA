import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara dois vetores de cinco posições
        int[] a = new int[5];
        int[] b = new int[5];

        // Lê os valores dos vetores A e B
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor do elemento A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite o valor do elemento B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // Cria um terceiro vetor para armazenar a soma dos vetores A e B
        int[] c = new int[5];

        // Calcula a soma dos vetores A e B
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        // Imprime os vetores A, B e C
        System.out.println("Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
