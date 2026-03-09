public class MainBus {

    public static void main(String[] args) {

        Bus bus = new Bus(30);

        bus.subirPasajeros(10);
        bus.cobrarPasaje();

        System.out.println("Asientos disponibles: " + bus.asientosDisponibles());
    }
}