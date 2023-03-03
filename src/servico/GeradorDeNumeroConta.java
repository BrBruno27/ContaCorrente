package servico;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class GeradorDeNumeroConta {
        private static List<Integer> numerosUtilizados = new ArrayList<>();
        private static final int NUM_DIGITOS_CONTA = 6;

        public static int gerarNumeroConta() {
            Random rand = new Random();
            int numeroConta;
            do {
                // Gera um número aleatório de 6 dígitos
                numeroConta = rand.nextInt((int)Math.pow(10, NUM_DIGITOS_CONTA));
            } while (numerosUtilizados.contains(numeroConta)); // Verifica se o número já foi utilizado

            // Adiciona o número à lista de números utilizados
            numerosUtilizados.add(numeroConta);

            return numeroConta;
        }

}
