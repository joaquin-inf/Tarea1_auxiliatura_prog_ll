public class Libro {
    private String nombre;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }

    // Método para mostrar datos
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }

    public String getNombre() {
        return nombre;
    }
}