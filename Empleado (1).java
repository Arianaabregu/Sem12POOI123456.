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
        
        Empleado[] empleados = new Empleado[50];

       
        for (int i = 0; i < empleados.length; i++) {
           
            empleados[i] = new Empleado();

           
            empleados[i].leerDatos();
        }

       
        System.out.println("Datos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println("---------------------------");
        }
    }
}

