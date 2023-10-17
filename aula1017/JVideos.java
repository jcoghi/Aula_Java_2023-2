package aula1017;

import aula1017.filmes.Filmes;
import aula1017.series.Series;
import java.util.ArrayList;

/**
 * @author prof. João Felipe Coghi
 */
public class JVideos {

    public static void main(String[] args) {
        ArrayList<Series> series = new ArrayList<>();
        ArrayList<Filmes> filmes = new ArrayList<>();

        series.add(new Series("Round 6", 40, 1, 12));
        series.add(new Series("Wandinha", 40, 1, 12));

        filmes.add(new Filmes("Guardiões da Galáxia 2", 150, "Ação, Aventura, Comédia"));
        filmes.add(new Filmes("Robbit", 3500, "Fantasia, Ação"));

        System.out.println(series.get(0).toString());
        System.out.println(filmes.get(0).toString());
    }

}
