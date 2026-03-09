public class Servidor {

    Jugador jugadores[] = new Jugador[10];
    int contador = 0;

    public void agregarJugador(String nombre, int diamantes) {

        if (contador < 10) {
            jugadores[contador] = new Jugador(nombre, diamantes);
            contador++;
        } else {
            System.out.println("Servidor lleno");
        }
    }

    public void stacksDiamantes() {

        for (int i = 0; i < contador; i++) {
            int stacks = jugadores[i].diamantes / 64;

            System.out.println(jugadores[i].nombre + " tiene " + stacks + " stacks");
        }
    }

    public void jugadorMasDiamantes() {

        int max = 0;
        String nombre = "";

        for (int i = 0; i < contador; i++) {

            if (jugadores[i].diamantes > max) {
                max = jugadores[i].diamantes;
                nombre = jugadores[i].nombre;
            }
        }

        System.out.println("Jugador con mas diamantes: " + nombre);
    }

    public void totalDiamantes() {

        int total = 0;

        for (int i = 0; i < contador; i++) {
            total += jugadores[i].diamantes;
        }

        System.out.println("Total diamantes: " + total);
    }
}