package com.BYjosep04.ejercicio6;

import java.time.LocalDate;
import java.util.*;

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


    public void agregarAlquiler(Multimedia multimedia, LocalDate fechaPrestamo, Socio socio) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getSocio().equals(socio) && !Alquiler.isDevuelto(alquiler)) {
                throw new IllegalArgumentException("No se ha devuelto un alquiler");
            }
        }
        this.alquileres.add(new Alquiler(multimedia, fechaPrestamo, socio));
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




    /*
        ToStrings
     */


    public String multimediaToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Multimedia{\n");
        for (Multimedia multimedia : this.multimedia) {
            sb.append(multimedia.toString()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    public String toStringPeliculasPorTitulo() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        for (Multimedia multimedia : this.multimedia) {
            if (multimedia.getClass() == Pelicula.class) {
                peliculas.add((Pelicula) multimedia);
            }
        }
        Collections.sort(peliculas);

        sb.append("Peliculas:\n");
        for (Pelicula pelicula : peliculas) {
            sb.append(pelicula.toStringForBucle()).append("\n");
        }

        return sb.toString();
    }

    public String toStringVideoJuegos() {
        StringBuilder sb = new StringBuilder();
        ArrayList<VideoJuegos> videoJuegoS = new ArrayList<VideoJuegos>();
        sb.append("Video Juegos:\n");
        for (Multimedia multimedia : this.multimedia) {
            if (multimedia.getClass() == VideoJuegos.class) {
                videoJuegoS.add((VideoJuegos) multimedia);
            }
        }
        Collections.sort(videoJuegoS);
        for (VideoJuegos videoJuego : videoJuegoS) {
            sb.append(videoJuego.toStringForBucle()).append("\n");
        }
        return sb.toString();
    }

    public String toStringHistorialAlquilersDeUnSocio(Socio socio) {
        ArrayList<Alquiler> alquilerSocio = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (Alquiler alquiler : alquileres) {
            if (alquiler.getSocio().equals(socio)) {
                alquilerSocio.add(alquiler);
            }
        }

        Collections.sort(alquilerSocio);
        sb.append("Alquileres del socio: ").append(socio).append("\n");
        for (Alquiler alquiler : alquilerSocio) {
            sb.append(alquiler.toStringForBucle(false)).append("\n");
        }
        return sb.toString();
    }

    public String toStringAlquilersDeUnSocio(Socio socio) {
        ArrayList<Alquiler> alquilerSocio = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (Alquiler alquiler : alquileres) {
            if (alquiler.getSocio().equals(socio) && !Alquiler.isDevuelto(alquiler)) {
                alquilerSocio.add(alquiler);
            }
        }

        Collections.sort(alquilerSocio);
        sb.append("Alquileres pendientes del socio: ").append(socio).append("\n");
        for (Alquiler alquiler : alquilerSocio) {
            sb.append(alquiler.toStringForBucle(false)).append("\n");
        }
        return sb.toString();
    }

    public String toStringSocioConRecargo() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Alquiler> alquilersConRecargo = new ArrayList<>();
        for (Alquiler alquiler : alquileres) {
            if (!Alquiler.isDevuelto(alquiler)&& alquiler.calcularPrecioTotal() != alquiler.getPrecio()) {
                alquilersConRecargo.add(alquiler);
            }
        }

        TreeSet<Socio> socios = new TreeSet<>();
        for (Alquiler alquiler : alquilersConRecargo) {
            socios.add(alquiler.getSocio());
        }

        for (Socio socio : socios) {
            sb.append(socios.toString()).append("\n");
        }
        return sb.toString();
    }
}
