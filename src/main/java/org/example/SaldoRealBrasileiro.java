package org.example;

public class SaldoRealBrasileiro implements ISaldoBancario {

    private float saldoBancario;

    @Override
    public float getSaldoBancario() {
        return saldoBancario;
    }

    @Override
    public void setSaldoBancario(float saldoBancario) {
        this.saldoBancario = saldoBancario;
    }
}
