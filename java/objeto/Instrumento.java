package objeto;
public class Instrumento {
    public String nombre;
    private String material;
    private String tipo;
    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMaterial() {
        return material;
    }
    public String getTipo() {
        return tipo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString() {
        return "Instrumento{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
