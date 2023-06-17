package org.example;

public class Cliente {

    ISaldoBancario saldoBancario;
    SaldoBancarioAdapter adaptador;

    public Cliente() {
        saldoBancario = new SaldoRealBrasileiro();
        adaptador = new SaldoBancarioAdapter(saldoBancario);
    }

    public void setSaldoBancario(float saldo) {
        saldoBancario.setSaldoBancario(saldo);
        adaptador.converterParaDolar();
    }

    public float getSaldoBancario() {
        return adaptador.converterParaReal();
    }

    public float getSaldoDolar() {
        return adaptador.getSaldoBancarioDolar();
    }
}