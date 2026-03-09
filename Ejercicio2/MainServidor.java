public class MainServidor {

    public static void main(String[] args) {

        Servidor s = new Servidor();

        s.agregarJugador("Steve", 120);
        s.agregarJugador("Alex", 80);
        s.agregarJugador("Juan", 200);

        s.stacksDiamantes();
        s.jugadorMasDiamantes();
        s.totalDiamantes();
    }
}