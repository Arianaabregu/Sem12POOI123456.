public class Cadena {
    private int longitud;
    private String cadena;

    
    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    
    public int getLongitud() {
        return longitud;
    }

   
    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return '\0'; 
        }
    }

   
    public void visualizar() {
        System.out.println("Cadena: " + cadena);
    }

    public static void main(String[] args) {
        
        Cadena miCadena = new Cadena("Hola Amigos");

      
        System.out.println("Longitud de la cadena: " + miCadena.getLongitud());
        miCadena.visualizar();

        
        int indice = 4;
        char caracterEnPosicion = miCadena.caracter(indice);
        if (caracterEnPosicion != '\0') {
            System.out.println("Carácter en la posición " + indice + ": " + caracterEnPosicion);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
