import java.util.ArrayList;
import java.util.List;


class LAN {
    private List<Nodo> nodos;

    public LAN() {
        this.nodos = new ArrayList<>();
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void addNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void removeNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public void configurarRed(Topologia topologia) {
      
    }

    public void enviarPaquete(Nodo origen, Nodo destino, int tamanoPaquete) {
        
    }

    public void difundirPaquete(Nodo origen, int tamanoPaquete) {
        
    }

    public void realizarEstadisticas() {
        
    }
}


class Nodo {
    private String nombre;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


enum Topologia {
    ESTRELLA, ANILLO, BUS, HUB
}

public class SimulacionLAN {
    public static void main(String[] args) {
       
        LAN miRedLAN = new LAN();

        
        Nodo nodo1 = new Nodo("Nodo1");
        Nodo nodo2 = new Nodo("Nodo2");
        Nodo nodo3 = new Nodo("Nodo3");

        miRedLAN.addNodo(nodo1);
        miRedLAN.addNodo(nodo2);
        miRedLAN.addNodo(nodo3);

        
        miRedLAN.configurarRed(Topologia.ESTRELLA);

        
        miRedLAN.enviarPaquete(nodo1, nodo2, 1024);

        
        miRedLAN.difundirPaquete(nodo3, 512);

       
        miRedLAN.realizarEstadisticas();

        
        System.out.println("Nodos actuales de la red LAN:");
        for (Nodo nodo : miRedLAN.getNodos()) {
            System.out.println("Nombre: " + nodo.getNombre());
        }
    }
}
