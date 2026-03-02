package objeto;
import java.util.ArrayList;
public class Anime {
    public String nombre;
    public String genero;
    private int nroEpisodios;
    private ArrayList<String> episodios;

    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
        this.episodios = new ArrayList<>();
    }
    public String toString() {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", nroEpisodios=" + nroEpisodios +
                ", episodios=" + episodios +
                '}';
    }
}