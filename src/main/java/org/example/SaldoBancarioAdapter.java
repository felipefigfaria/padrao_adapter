package org.example;

public class SaldoBancarioAdapter extends SaldoDolarAmericano {

    private ISaldoBancario saldoRealBrasileiro;

    public SaldoBancarioAdapter(ISaldoBancario saldoRealBrasileiro) {
        this.saldoRealBrasileiro = saldoRealBrasileiro;
    }

    public float converterParaReal() {
        float saldoDolar = this.getSaldoBancarioDolar();
        float saldoReal = 5 * saldoDolar;
        saldoRealBrasileiro.setSaldoBancario(saldoReal);
        return saldoRealBrasileiro.getSaldoBancario();
    }

    public float converterParaDolar() {
        float saldoReal = saldoRealBrasileiro.getSaldoBancario();
        float saldoDolar = saldoReal / 5 ;
        this.setSaldoBancarioDolar(saldoDolar);
        return this.getSaldoBancarioDolar();
    }
}