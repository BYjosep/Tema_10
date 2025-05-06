package com.BYjosep04.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private final List<Alquiler> alquileres;
    private final List<Socio> socios;
    private final List<Multimedia> multimedia;

    public Tienda() {
        this.alquileres = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.multimedia = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.multimedia.add(pelicula);
    }
    public void agregarVideoJuego(VideoJuegos videoJuego) {
        this.multimedia.add(videoJuego);
    }

    public void agregarSocio(Socio socio) {
        this.socios.add(socio);
    }



    public void agregarAlquiler(Multimedia multimedia, LocalDate fechaPrestamo,Socio socio) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getSocio().equals(socio) && !Alquiler.isDevuelto(alquiler) ) {
                throw new IllegalArgumentException("No se ha devuelto un alquiler");
            }

        }

        this.alquileres.add(new Alquiler(multimedia,fechaPrestamo,socio));
    }
    public void devolverMultimedia(Alquiler alquiler, LocalDate fechaDeDevolucion) {

        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).equals(alquiler)) {
                alquiler.devolver(fechaDeDevolucion);
                alquileres.set(i, alquiler);
            }
        }

    }

    /**
     *
     * @return devuelve un String con los datos más importantes de una pelicula
     */
    public String getPeliculas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peliculas:\n");
        for (Multimedia multimedia : this.multimedia) {
            if (multimedia.getClass() == Pelicula.class) {
                sb.append(multimedia.getTitulo()).append(", ").append(multimedia.getAutor()).append(", ").append(multimedia.getYear());
            sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     *
     * @return devuelve un String con los datos más importantes de un videojuego
     */
    public String getVideoJuegos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video Juegos:\n");
        for (Multimedia multimedia : this.multimedia) {
            if (multimedia.getClass() == VideoJuegos.class) {
                sb.append(multimedia.getTitulo()).append(", ").append(multimedia.getAutor()).append(", ").append(multimedia.getYear());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
