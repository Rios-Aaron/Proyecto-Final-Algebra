import java.util.Scanner;
public class OperacionesDeMatrices {

    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {


            System.out.print("Ingrese el número de variables: ");
            int numero = Teclado.nextInt();

            double[][] matriz = new double[numero][numero + 1];

            System.out.println("Ingrese los coeficientes de cada ecuación:");
            for (int i = 0; i < numero; i++) {
                System.out.println("Ecuación " + (i + 1) + ":");
                for (int j = 0; j < numero + 1; j++) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
                    matriz[i][j] = Teclado.nextDouble();
                }
            }

            double[][] matriz = new double(matriz);

            boolean Matriz;
            if (Matriz == null) {
                System.out.println("Hay variables infinitas en el sistema de ecuaciones....");
            } else {
                System.out.println("La solución es:");
                for (int i = 0; i < numero; i++) {
                    System.out.println("x" + (i + 1) + " = " + matriz[i][numero+1]);
                }
            }
        }

            for (int i = 0; i < numero; i++) {

        double pivote = matriz[i][i];

        for (int j = 0; j < numero+1; j++) {
            matriz[i][j] /= pivote;
        }

        for (int k = 0; k < numero; k++) {
            if (k != i) {
                double factor = matriz[k][i];
                for (int j = 0; j < numero+1; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    }

            System.out.println("Solución:");
            for (int i = 0; i < numero; i++) {
        System.out.println("X" + (i+1) + " = " + matriz[i][numero]);
    }
}
    }