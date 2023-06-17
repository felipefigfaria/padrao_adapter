package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarSaldoBancarioEmReal() {
        Cliente cliente = new Cliente();
        cliente.setSaldoBancario(4000);

        assertEquals(4000, cliente.getSaldoBancario());
    }

    @Test
    void deveRetornarSaldoBancarioEmDolar() {
        Cliente cliente = new Cliente();
        cliente.setSaldoBancario(7500);

        assertEquals(1500, cliente.getSaldoDolar());
    }
}