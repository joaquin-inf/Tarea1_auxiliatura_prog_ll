import java.util.Scanner;
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    // Constructor vacío (sobrecarga 1)
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "PC";
        this.cantidadJugadores = 1;
    }
    // Constructor con parámetros (sobrecarga 2)
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    // Método para agregar 1 jugador
    public void agregarJugadores() {
        cantidadJugadores++;
    }
    // Método sobrecargado para agregar varios jugadores
    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
    }
    // Método para mostrar datos
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciar 2 videojuegos
        Videojuego juego1 = new Videojuego("FIFA 24", "PlayStation", 2);
        Videojuego juego2 = new Videojuego("Minecraft", "PC", 1);
        // Mostrar inicial
        System.out.println("DATOS INICIALES:");
        juego1.mostrar();
        juego2.mostrar();
        // Agregar 1 jugador (polimorfismo)
        juego1.agregarJugadores();
        // Agregar varios jugadores (polimorfismo)
        System.out.print("Ingrese cantidad de jugadores a agregar: ");
        int n = sc.nextInt();
        juego2.agregarJugadores(n);
        // Mostrar final
        System.out.println("\nDATOS ACTUALIZADOS:");
        juego1.mostrar();
        juego2.mostrar();
    }
}