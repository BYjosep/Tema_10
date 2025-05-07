package com.BYjosep04.ejercicio6;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    private static Faker faker = new Faker();
    private static Random rand = new Random();
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        for (int i = 0; i < rand.nextInt(1,101); i++) {
            tienda.agregarSocio(generarSocio());

        }

    }

    private static Socio generarSocio() {
        LocalDate fechaNacimiento =faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        StringBuilder nif = new StringBuilder();
        nif.append( faker.number().numberBetween(1, 1000000)).append((char) rand.nextInt(65,123));
        Socio socio= new Socio(nif.toString(),
                faker.name().firstName(),
                fechaNacimiento,
                faker.address().cityName());
        return socio;
    }


    private static VideoJuegos generarVideoJuegos() {
        VideoJuegos videoJuego;
        ArrayList<String> plataformas = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(1,101); i++) {
            plataformas.add(faker.company().name()+" "+faker.team().name());
        }
        videoJuego = new VideoJuegos(faker.name().title(),
                faker.name().fullName(),
                faker.number().numberBetween(1400,LocalDate.now().getYear()),TipoMultimedia.valueOf(String.valueOf(rand.nextInt(0, TipoMultimedia.values().length))),plataformas);

    return videoJuego;}

}
