public class Aula {
    private String nombreAula;
    private int piso;
    private String[] estudiantes;
    private int[] notas;
    // Constructor
    public Aula(String nombreAula, int piso, String[] estudiantes, int[] notas) {
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }
    // Método 1: mostrar todos los datos
    public void mostrar() {
        System.out.println("Aula: " + nombreAula);
        System.out.println("Piso: " + piso);

        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
        }
    }
    // Método sobrecargado: mostrar aprobado/reprobado
    public void mostrar(boolean estado) {
        System.out.println("\nEstado de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            String resultado;
            if (notas[i] >= 51) {
                resultado = "APROBADO";
            } else {
                resultado = "REPROBADO";
            }
            System.out.println(estudiantes[i] + " - " + notas[i] + " - " + resultado);
        }
    }
    public static void main(String[] args) {

        String[] estudiantes = {"Luis", "Aracely"};
        int[] notas = {67, 89};

        Aula aula1 = new Aula("Aula 101", 1, estudiantes, notas);

        // Mostrar datos completos
        System.out.println("DATOS DEL AULA:");
        aula1.mostrar();

        // Mostrar estado (polimorfismo)
        aula1.mostrar(true);
    }
}