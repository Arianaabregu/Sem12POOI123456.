public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    
    public void avanzar() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    
    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
       
        Hora miHora = new Hora(12, 30, 45);

        
        System.out.println("Hora actual:");
        miHora.visualizar();

       
        miHora.avanzar();
        System.out.println("Después de avanzar la hora:");
        miHora.visualizar();

        
        miHora.ponerACero();
        System.out.println("Después de poner a cero la hora:");
        miHora.visualizar();
    }
}
