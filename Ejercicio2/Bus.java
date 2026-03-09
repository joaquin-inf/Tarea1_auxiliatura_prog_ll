public class Bus {

    int capacidad;
    int pasajeros;
    double dinero;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.dinero = 0;
    }

    public void subirPasajeros(int x) {
        if (pasajeros + x <= capacidad) {
            pasajeros += x;
        } else {
            System.out.println("No hay asientos suficientes");
        }
    }

    public void cobrarPasaje() {
        dinero = pasajeros * 1.50;
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }
}
