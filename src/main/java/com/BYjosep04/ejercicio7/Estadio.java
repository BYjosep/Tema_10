package com.BYjosep04.ejercicio7;

import com.BYjosep04.ejercicio7.entradas.EntradaNormal;
import com.BYjosep04.ejercicio7.entradas.EntradaVip;
import com.BYjosep04.ejercicio7.zonas.Zona;
import com.BYjosep04.ejercicio7.zonas.ZonaNormal;
import com.BYjosep04.ejercicio7.zonas.ZonaVip;
import com.BYjosep04.ejercicio7.entradas.Entrada;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

import java.util.ArrayList;
import java.util.List;

public class Estadio {
    private final String nombre;
    private final List<Zona> zonas;
    private final List<Evento> eventos;
    private final List<Entrada> entradasVendidas;

    /**
     * Constructor para crear un estadio.
     * @param nombre El nombre del estadio.
     */
    public Estadio(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del estadio no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.entradasVendidas = new ArrayList<>();
    }

    /**
     * Añade una zona al estadio.
     * @param zona La zona a añadir.
     */
    public void agregarZona(Zona zona) {
        if (zona == null) {
            throw new IllegalArgumentException("La zona no puede ser nula.");
        }
        zonas.add(zona);
    }

    /**
     * Añade un evento al estadio.
     * @param evento El evento a añadir.
     */
    public void agregarEvento(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser nulo.");
        }
        eventos.add(evento);
    }

    /**
     * Vende una entrada para un evento específico.
     * @param evento El evento para el que se vende la entrada.
     * @param zona El asiento asociado a la entrada.
     * @param fila La fila del asiento.
     * @param columna La columna del asiento.
     * @return La entrada vendida.
     * @throws IllegalArgumentException Si el evento, el asiento o las coordenadas son inválidos.
     */
    public Entrada venderEntrada(Evento evento, Zona zona, int fila, int columna) {
        if (evento == null || zona == null) {
            throw new IllegalArgumentException("El evento y la zona no pueden ser nulos.");
        }
        if (!eventos.contains(evento)) {
            throw new IllegalArgumentException("El evento no está programado en este estadio.");
        }
        if (!zonas.contains(zona)) {
            throw new IllegalArgumentException("La zona no pertenece a este estadio.");
        }

        // Verificar que el asiento esté dentro de la matriz de asientos de la zona
        IAsiento asiento = zona.getAsientos()[fila][columna];
        if (asiento == null || asiento.isOcupado()) {
            throw new IllegalArgumentException("El asiento seleccionado no está disponible.");
        }

        // Crear la entrada correspondiente según el tipo de zona
        Entrada entrada;
        if (zona instanceof ZonaVip) {
            entrada = new EntradaVip(asiento, evento, (ZonaVip) zona, fila, columna);
        } else if (zona instanceof ZonaNormal) {
            entrada = new EntradaNormal(asiento, evento, generarNumeroSorteo());
        } else {
            throw new IllegalArgumentException("Tipo de zona no soportado.");
        }

        // Ocupar el asiento y registrar la entrada vendida
        entrada.venderEntrada(asiento);
        entradasVendidas.add(entrada);
        return entrada;
    }

    /**
     * Genera un número de sorteo aleatorio para entradas normales.
     * @return Un número de sorteo aleatorio.
     */
    private int generarNumeroSorteo() {
        return (int) (Math.random() * 1000000); // Número aleatorio entre 0 y 999999
    }

    /**
     * Obtiene el nombre del estadio.
     * @return El nombre del estadio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de zonas del estadio.
     * @return La lista de zonas.
     */
    public List<Zona> getZonas() {
        return zonas;
    }

    /**
     * Obtiene la lista de eventos programados en el estadio.
     * @return La lista de eventos.
     */
    public List<Evento> getEventos() {
        return eventos;
    }

    /**
     * Obtiene la lista de entradas vendidas en el estadio.
     * @return La lista de entradas vendidas.
     */
    public List<Entrada> getEntradasVendidas() {
        return entradasVendidas;
    }

    /**
     * Representación en cadena del estadio.
     * @return Información sobre el estadio.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estadio: ").append(nombre).append("\n");
        sb.append("Zonas:\n");
        for (Zona zona : zonas) {
            sb.append("- ").append(zona.toString()).append("\n");
        }
        sb.append("Eventos programados:\n");
        for (Evento evento : eventos) {
            sb.append("- ").append(evento.toString()).append("\n");
        }
        sb.append("Entradas vendidas: ").append(entradasVendidas.size()).append("\n");
        return sb.toString();
    }
}