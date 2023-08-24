//Exercício 4: Um matemático italiano da idade média conseguiu modelar o ritmo do
//        crescimento da população de coelhos por meio de uma sequência de números naturais
//        que passou a ser conhecida como Sequência de Fibonacci. Tal sequência é descrita da
//        seguinte forma:
//        • Fi = Fi-1 – Fi-2 para i > 2;
//        • F2 = 1; e
//        • F1 = 1.

public class exercicio4 {
    public static void main(String[] args) {
        int n = 10;
        // Iterativo
        // Declara as variáveis para armazenar os números da sequência
        int f1 = 1;
        int f2 = 1;
        int fn;

        // Imprime os dois primeiros números
        System.out.println(f1);
        System.out.println(f2);

        // Calcula os n - 2 números restantes
        for (int i = 2; i < n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;

            System.out.println(fn);
        }


    }
}
