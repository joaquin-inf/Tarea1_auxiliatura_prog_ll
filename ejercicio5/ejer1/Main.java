public class Main {
    public static void main(String[] args) {

        // Crear bibliotecas
        Biblioteca b1 = new Biblioteca("Biblioteca Central");
        Biblioteca b2 = new Biblioteca("Biblioteca Sur");

        // Crear libros
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
        Libro l2 = new Libro("1984", "Orwell", 1949);
        Libro l3 = new Libro("Cien Años de Soledad", "García Márquez", 1967);
        Libro l4 = new Libro("El Principito", "Saint-Exupéry", 1943);

        // Agregar libros
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);

        b2.agregarLibro(l3);
        b2.agregarLibro(l4);

        // c) Buscar libro
        System.out.println("Buscando en Biblioteca Central:");
        b1.buscarLibro("1984");

        // d) Mostrar biblioteca con más libros
        if (b1.getCantLibros() > b2.getCantLibros()) {
            System.out.println("La biblioteca con más libros es: " + b1.getNombre());
        } else if (b2.getCantLibros() > b1.getCantLibros()) {
            System.out.println("La biblioteca con más libros es: " + b2.getNombre());
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de libros:");
            System.out.println(b1.getNombre());
            System.out.println(b2.getNombre());
        }
    }
}