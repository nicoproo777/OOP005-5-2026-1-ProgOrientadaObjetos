
package matriz2x2;

import java.util.Scanner;

public class Matriz2x2 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz2x2() {
        filas = 2;
        columnas = 2;
        data = new int[filas][columnas];
    }

        public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getDato(int i, int j) {
        return data[i][j];
    }


    public void setDato(int i, int j, int valor) {
        data[i][j] = valor;
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                setDato(i, j, sc.nextInt());
            }
        }
    }

    public void imprimir() {
        System.out.println("\nMatriz 2x2:");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                System.out.print(getDato(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz2x2 m = new Matriz2x2();
        m.cargar();
        m.imprimir();
    }
}