import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private int numeroEmpleado;

    
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el número de empleado:");
        numeroEmpleado = scanner.nextInt();
    }

   
    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }

    public static void main(String[] args) {
       
        Empleado empleado = new Empleado();

        
        empleado.leerDatos();

      
        empleado.verDatos();
    }
}
