package objeto;
public class Televisor {
    private String marca;
    private int resolucion;
    private String tipo;
    public Televisor() {
    }
    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }
    public String toString() {
        return "Televisor{" +
                "marca='" + marca + '\'' +
                ", resolucion=" + resolucion +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}