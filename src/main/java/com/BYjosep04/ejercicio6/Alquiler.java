package com.BYjosep04.ejercicio6;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler implements Comparable<Alquiler> {
    private static final int PRECIO_BASE = 4;
    private final Multimedia multimedia;
    private final LocalDate fechaDePrestamo;
    private int precio;
    private LocalDate fechaDeDevolucion;
    private final Socio socio;

    public Alquiler(Multimedia multimedia, LocalDate fechaDePrestamo, Socio socio) {
        this.multimedia = multimedia;
        this.fechaDePrestamo = fechaDePrestamo;
        this.precio = calcularPrecio(multimedia);
        this.socio = socio;
        this.fechaDeDevolucion = null;
    }

    public static boolean isDevuelto(Alquiler alquiler) {
        return alquiler.fechaDeDevolucion != null;
    }

    /**
     * @param fechaDeDevolucion fecha en la que se devuelve
     * @return en caso de poderse devolver devuelve true
     * @throws IllegalStateException En caso de ya haber sido devuelto provoca una exepcion,
     *                               ya que no se puede devolver algo ya devuelto
     */
    public boolean devolver(LocalDate fechaDeDevolucion) throws IllegalStateException {
        if (this.fechaDeDevolucion != null) {
            throw new IllegalStateException("Alquiler ya está devuelto");
        }
        this.calcularPrecioTotal();
        precio = 0;
        this.fechaDeDevolucion = fechaDeDevolucion;
        return true;
    }

    private int calcularPrecio(Multimedia multimedia) {
        int precio = PRECIO_BASE;
        if (multimedia.getClass() == Pelicula.class && multimedia.getYear() <= 2012) {
            precio -= 1;
        } else if (multimedia.getClass() == VideoJuegos.class && multimedia.getYear() <= 2010) {
            precio -= 1;
        }
        return precio;
    }

    public int calcularPrecioTotal() {
        int diasDePrestamo = fechaDePrestamo.compareTo(LocalDate.now());
        int precio = this.precio;
        if (diasDePrestamo <= 0) {
            return precio;

        } else {
            precio += diasDePrestamo * 2;
            return precio;
        }


    }

    public Socio getSocio() {
        return socio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alquiler alquiler = (Alquiler) o;
        return precio == alquiler.precio && Objects.equals(multimedia, alquiler.multimedia) && Objects.equals(fechaDePrestamo, alquiler.fechaDePrestamo) && Objects.equals(fechaDeDevolucion, alquiler.fechaDeDevolucion) && Objects.equals(socio, alquiler.socio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multimedia, fechaDePrestamo, fechaDeDevolucion, precio, socio);
    }

    @Override
    public int compareTo(Alquiler o) {
        return this.fechaDePrestamo.compareTo(o.fechaDePrestamo);
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "multimedia=" + multimedia +
                ", fechaDePrestamo=" + fechaDePrestamo +
                ", precio=" + precio +
                ", fechaDeDevolucion=" + fechaDeDevolucion +
                ", socio=" + socio +
                '}';
    }

    public String toStringForBucle(boolean mostrarSocio){
        StringBuilder sb = new StringBuilder();
        sb.append("Multimedia: ").append(multimedia).append("\n");
        sb.append("Fecha de prestamo: ").append(fechaDePrestamo).append("\n");
        sb.append("Precio: ").append(precio).append("\n");
        sb.append("Fecha de devolucion: ").append(fechaDeDevolucion).append("\n");
        if (mostrarSocio) {
            sb.append("Socio: ").append(socio).append("\n");
        }
        return sb.toString();
    }
}
