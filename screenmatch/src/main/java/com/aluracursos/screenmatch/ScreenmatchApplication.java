package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.principal.Principal;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.muestraElMenu();

//        var consumoApi = new ConsumoAPI();
//        var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=Loki&apikey=efc7f80b");
//        //var json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
//        System.out.println(json);
//        ConvierteDatos conversor = new ConvierteDatos();
//        var datos = conversor.obtenerDatos(json, DatosSerie.class);
//        System.out.println(datos);
//        json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=Loki&Season=1&Episode=1&apikey=efc7f80b");
//        DatosEpisodio episodioDatos = conversor.obtenerDatos(json, DatosEpisodio.class);
//        System.out.println(episodioDatos);
//
//        List<DatosTemporadas> temporadas = new ArrayList<>();
//        for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
//            json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=Loki&Season=" + i + "&apikey=efc7f80b");
//            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
//            temporadas.add(datosTemporadas);
//        }
//        temporadas.forEach(System.out::println);
    }
}
