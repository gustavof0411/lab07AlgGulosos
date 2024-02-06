package analis;

import java.util.ArrayList;

public class Analisador {

    public int[] acha_sequencia(double[] probs, int[] valores) {
        ArrayList<Integer> sequencia = new ArrayList<>(valores.length);
        ArrayList<Integer> melhorSequencia = new ArrayList<>(valores.length);
        int indiceMaiorValor = 0; // Maior índice de cada decisão
        double maiorValor = -1;
        // É negativo, pois qualquer valor da variável "calculo" que está dentro do
        // while abaixo será maior que o valor inicial -1.

        for (int i = 0; i < valores.length; i++) {
            sequencia.add(i);
        }

        while (!sequencia.isEmpty()) {
            for (int i : sequencia) {
                double calculo = (probs[i] * valores[i]) / (1 - probs[i]);
                if (calculo > maiorValor) {
                    indiceMaiorValor = i;
                    maiorValor = calculo;
                }
            }
            sequencia.remove(sequencia.indexOf(indiceMaiorValor));
            maiorValor = -1;
            melhorSequencia.add(indiceMaiorValor);
        }

        // Transformando ArrayList<Integer> em int[].
        int[] sequenciaFinal = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            sequenciaFinal[i] = melhorSequencia.get(i);
        }
        return sequenciaFinal;
    }
}
