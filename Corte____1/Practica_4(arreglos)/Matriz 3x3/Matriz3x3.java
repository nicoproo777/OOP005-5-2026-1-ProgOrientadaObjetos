package matriz3x3;
import java.util.Scanner;

public class Matriz3x3 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz3x3() {
        filas = 3;
        columnas = 3;
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
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                System.out.print(getDato(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz3x3 m = new Matriz3x3();
        m.cargar();
        m.imprimir();
    }
}