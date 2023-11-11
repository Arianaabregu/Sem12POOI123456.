import java.util.Scanner;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que inicializa los datos a 0
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

   
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    
    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

   
    public void sumarHoras(Hora otraHora) {
        this.segundos += otraHora.segundos;
        this.minutos += otraHora.minutos;
        this.horas += otraHora.horas;

        
        if (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
        }

        if (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas++;
        }
    }

    public static void main(String[] args) {
        
        Hora hora1 = new Hora(3, 45, 30);
        Hora hora2 = new Hora(2, 15, 45);

        
        Hora resultado = new Hora();

      
        System.out.println("Hora 1:");
        hora1.visualizarHora();

        System.out.println("Hora 2:");
        hora2.visualizarHora();

   
        resultado.sumarHoras(hora1);
        resultado.sumarHoras(hora2);

      
        System.out.println("Resultado de la suma:");
        resultado.visualizarHora();
    }
}
