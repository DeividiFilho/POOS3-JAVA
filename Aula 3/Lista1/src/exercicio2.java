//Exercício 2: Escreva dois programas, um recursivo e outro iterativo, que calculem o
//        fatorial de um número n. O fatorial de n é calculado tal que:
//       • n! = n * (n-1)!
//        • 1! = 1
//        • 0! = 1

import java.util.Scanner;

public class exercicio2 {

    public  static int factorial(int n) {
        int factorial = 1;
        for (int i=2; i<=n; i++) {
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Sou um programa que calcula o fatorial!\n\n");
        System.out.print("Digite um número para calcular seu fatorial: ");
        int n = scanner.nextInt();
        int factorial = factorial(n);
        System.out.println("\nO fatorial de " + n + " é: " + factorial);
    }
}
