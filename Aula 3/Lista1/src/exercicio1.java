// Exercício 1: Leia cinco números inteiros e imprima o maior e o menor números. Cada
// número da entrada deve ser lido após pressionar 'Enter

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis para armazenar os números lidos
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Lê cinco números inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Atualiza os valores de maior e menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Imprime o maior e o menor números
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
