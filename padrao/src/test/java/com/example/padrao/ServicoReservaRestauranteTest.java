package com.example.padrao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoReservaRestauranteTest {

    @Test
    void executarReservaRestaurante() {
        IServico servico = ServicoFactory.obterServico("ReservaRestaurante");
        assertEquals("Reserva efetivada", servico.executar());
    }

    @Test
    void cancelarReservaRestaurante() {
        IServico servico = ServicoFactory.obterServico("ReservaRestaurante");
        assertEquals("Reserva cancelada", servico.cancelar());
    }

}
