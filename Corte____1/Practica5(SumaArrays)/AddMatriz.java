package addmatriz;
import java.util.Scanner;

public class AddMatriz {
    private int[][] data;
    private int filas;
    private int columnas;
    public AddMatriz() {
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
    public AddMatriz sumar ( AddMatriz otra ) {
AddMatriz resultado = new AddMatriz();

for (int i = 0; i < getFilas() ; i ++) {
for (int j = 0; j < getColumnas() ; j ++) {

int suma = this.getDato(i,j) + otra.getDato(i,j); 
resultado.setDato(i,j, suma);
    }
}
return resultado ;

}
    
   
    
    
    public static void main(String[] args) {
 AddMatriz m1 = new AddMatriz(); 
 AddMatriz m2 = new AddMatriz();
 System.out.println("Ingrese matriz 1:");
 m1.cargar();
 System.out.println("Ingrese matriz 2:");
 m2.cargar();
 AddMatriz suma= m1.sumar(m2);
 System.out.println("Resultado de la suma:");
 suma.imprimir();
    }
    
}
