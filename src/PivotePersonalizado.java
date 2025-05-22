public class PivotePersonalizado {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 4, 5},
            {2, 4, 3},
            {1, 1, 1}
        };

        int n = matriz.length;
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        for (int k = 0; k < n; k++) {
            int[][] nuevaMatriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    nuevaMatriz[i][j] = matriz[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                if (i == k) continue;
                for (int j = 0; j < n; j++) {
                    if (j == k) continue;
                    int suma = matriz[i][k] + matriz[k][j];
                    if (suma > matriz[i][j]) {
                        nuevaMatriz[i][j] = suma;
                    }
                }
            }

            matriz = nuevaMatriz;
            System.out.println("Después del pivote fila/columna " + (k + 1) + ":");
            imprimirMatriz(matriz);
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
