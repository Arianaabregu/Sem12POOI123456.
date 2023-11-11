import java.util.Date;


class Empleado {
    protected String nombre;
    protected String codigo;
    protected double salarioBase;
    protected Date fechaIngreso;

    public Empleado(String nombre, String codigo, double salarioBase, Date fechaIngreso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
    }

    
    public double calcularSalario() {
        return salarioBase;
    }

    
    public void calcularAumento(double porcentajeAumento) {
        salarioBase *= (1 + porcentajeAumento / 100);
        System.out.println("Aumento aplicado. Nuevo salario: " + salarioBase);
    }

    
}


class Supervisor extends Empleado {
    private int nivelJerarquico;

    public Supervisor(String nombre, String codigo, double salarioBase, Date fechaIngreso, int nivelJerarquico) {
        super(nombre, codigo, salarioBase, fechaIngreso);
        this.nivelJerarquico = nivelJerarquico;
    }

    
    public void calcularPrimaProductividad() {
        double prima = nivelJerarquico * 100; 
        System.out.println("Prima por productividad: " + prima);
    }

   
}


class DepartamentoRecursosHumanos extends Empleado {
    public DepartamentoRecursosHumanos(String nombre, String codigo, double salarioBase, Date fechaIngreso) {
        super(nombre, codigo, salarioBase, fechaIngreso);
    }

    
}


class AccesoPublico extends Empleado {
    public AccesoPublico(String nombre, String codigo, double salarioBase, Date fechaIngreso) {
        super(nombre, codigo, salarioBase, fechaIngreso);
    }

    
}


class Sunat extends Empleado {
    public Sunat(String nombre, String codigo, double salarioBase, Date fechaIngreso) {
        super(nombre, codigo, salarioBase, fechaIngreso);
    }

    
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de empleados
        Empleado empleado1 = new Empleado("Juan", "E001", 2000, new Date());
        Supervisor supervisor1 = new Supervisor("Ana", "S001", 3000, new Date(), 2);
        DepartamentoRecursosHumanos drh = new DepartamentoRecursosHumanos("DRH", "D001", 5000, new Date());
        AccesoPublico accesoPublico = new AccesoPublico("Público", "P001", 1500, new Date());
        Sunat sunat = new Sunat("SUNAT", "SUN001", 10000, new Date());

        
        supervisor1.calcularPrimaProductividad();
        drh.calcularAumento(5);
        accesoPublico.calcularSalario();
        sunat.calcularSalario();
    }
}
