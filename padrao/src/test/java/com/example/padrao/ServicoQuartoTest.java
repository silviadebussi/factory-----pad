package com.example.padrao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoQuartoTest {

    @Test
    void executarPedido() {
        IServico servico = ServicoFactory.obterServico("Quarto");
        assertEquals("Pedido efetivado", servico.executar());
    }

    @Test
    void cancelarPedido() {
        IServico servico = ServicoFactory.obterServico("Quarto");
        assertEquals("Pedido cancelado", servico.cancelar());
    }

}
