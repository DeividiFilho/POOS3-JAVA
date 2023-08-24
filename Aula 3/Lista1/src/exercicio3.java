import java.util.Scanner;

//Exercício 3: Escreva um programa que, dado um inteiro x, temos um novo x de acordo
//        com a seguinte regra:
//        • se x e par, x = x / 2
//        • se x e ímpar, x = 3 * x + 1
//        O programa deve parar quando x = 1. Por exemplo, para x = 13, a saída será: 40, 20, 10,
//        5, 16, 8, 4, 2 e 1.
public class exercicio3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insira o valor de X: ");
        int x = scanner.nextInt();

        //if(x%2 == 0) {
          //  x = x/2;
        //} else {
         //   x = 3*x + 1;
       // }

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        System.out.println("X é: " + x);
        }
    }
}