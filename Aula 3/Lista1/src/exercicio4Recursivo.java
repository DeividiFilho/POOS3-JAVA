public class exercicio4Recursivo {
    public static void main(String[] args) {
        int n = 10;

        // Chama o método recursivo
        exercicio4Recursivo.printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Chama o método recursivo para calcular os n - 1 primeiros números
        exercicio4Recursivo.printFibonacci(n - 1);

        // Imprime o n-ésimo número
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursão
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
