package org.example;
public class Main {
    public static int[][] matrizCompleta(int[][] matrizInferior) {
        int n = matrizInferior.length;
        int[][] matrizCompleta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    matrizCompleta[i][j] = matrizInferior[i][j];
                } else {
                    matrizCompleta[i][j] = matrizInferior[j][i];
                    matrizCompleta[j][i] = matrizInferior[j][i];
                }
            }
        }

        return matrizCompleta;
    }

    public static void main(String[] args) {
        int[][] matrizInferior = {
                {0},
                {1, 0},
                {0, 1, 0},
                {0, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0}
        };

        System.out.println("Matriz de adjacências na forma triangular inferior:");
        for (int[] linha : matrizInferior) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        int[][] matrizCompletaResultante = matrizCompleta(matrizInferior);

        System.out.println("\nMatriz de adjacências completa:");
        for (int[] linha : matrizCompletaResultante) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
