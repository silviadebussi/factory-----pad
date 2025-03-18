package com.example.padrao;

public class ServicoQuarto implements IServico {

    public String executar() {
        return "Pedido efetivado";
    }

    public String cancelar() {
        return "Pedido cancelado";
    }
}