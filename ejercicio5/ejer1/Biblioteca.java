public class Biblioteca {
    private String nombre;
    private int cantLibros;
    private Libro[] libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[100];
        this.cantLibros = 0;
    }

    // Agregar libro
    public void agregarLibro(Libro libro) {
        if (cantLibros < 100) {
            libros[cantLibros] = libro;
            cantLibros++;
        }
    }

    // Buscar libro por nombre
    public void buscarLibro(String nombreLibro) {
        boolean encontrado = false;
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getNombre().equalsIgnoreCase(nombreLibro)) {
                libros[i].mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public String getNombre() {
        return nombre;
    }
}