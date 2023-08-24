import java.util.Random;

public class exercicio8 {
    public static void main(String[] args) {
        // Cria um objeto aleatório
        Random random = new Random();

        // Declara um vetor para armazenar os resultados das jogadas
        int[] resultados = new int[6];

        // Simula 100.000 jogadas
        for (int i = 0; i < 100_000; i++) {
            // Gera dois números aleatórios entre 1 e 6
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            // Calcula a soma dos números
            int soma = dado1 + dado2;

            // Armazena o resultado no vetor
            int resultado = resultados[soma - 2];
            ++resultados[soma - 2];
        }

        // Imprime as estatísticas
        for (int i = 2; i < resultados.length; i++) {
            // Calcula a porcentagem do resultado
            double porcentagem = (double) resultados[i] / 100_000.0 * 100;

            // Imprime o resultado
            System.out.println("Resultado " + i + ": " + porcentagem + "%");
        }
    }
}
