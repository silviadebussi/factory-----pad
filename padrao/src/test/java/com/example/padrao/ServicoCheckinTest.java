package com.example.padrao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCheckinTest {

    @Test
    void executarCheckin() {
        IServico servico = ServicoFactory.obterServico("Checkin");
        assertEquals("Checkin efetivado", servico.executar());
    }

    @Test
    void cancelarCheckin() {
        IServico servico = ServicoFactory.obterServico("Checkin");
        assertEquals("Checkin cancelado", servico.cancelar());
    }

}
