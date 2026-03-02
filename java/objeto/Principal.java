package objeto;

public class Principal {

    public static void main(String[] args) {

        // Animes
        Anime anime1 = new Anime("Naruto", "Shonen", 220);
        Anime anime2 = new Anime("Attack on Titan", "Seinen", 87);

        // Televisores
        Televisor tv1 = new Televisor("Samsung", 1080, "LED");
        Televisor tv2 = new Televisor("LG", 2160, "OLED");

        // Instrumentos
        Instrumento inst1 = new Instrumento("Guitarra", "Madera", "Cuerda");
        Instrumento inst2 = new Instrumento("Flauta", "Metal", "Aire");

        // Mostrar en pantalla
        System.out.println(anime1);
        System.out.println(anime2);
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(inst1);
        System.out.println(inst2);
    }
}