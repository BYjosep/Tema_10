package com.BYjosep04.ejercicio7.zonas;

import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public class Asiento implements IAsiento {
    private boolean ocupado ;
    public Asiento() {
        ocupado = false;
    }

    @Override
    public boolean isOcupado(){
        return ocupado;
    }

    @Override
    public void ocuparAsiento() {
        ocupado = true;
    }

    @Override
    public void liberarAsiento() {
        ocupado = false;
    }

}
