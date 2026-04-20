package inheritance;

public class Employee extends Person {
    
    private final int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Employee(int idEmpleado, double Sueldo, String Nombre, char Genero, int Edad, String Direccion) {
        super(Nombre, Genero, Edad, Direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = Sueldo;
    }
        
 /*
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Sueldo: " + this.sueldo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
   */

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Sueldo: " + this.sueldo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
           
/*    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("Empleado ID = ").append(idEmpleado);
        sb.append(", Sueldo = ").append(sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }



}