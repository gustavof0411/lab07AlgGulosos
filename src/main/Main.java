import analis.Analisador;

public class Main {
    public static void main(String[] args) {
        Analisador analisador = new Analisador();
        int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double[] probs = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] resultado = analisador.acha_sequencia(probs, valores);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
        int[] a = new int[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
