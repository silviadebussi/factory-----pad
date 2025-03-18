package com.example.padrao;

public class ServicoCheckout implements IServico {

    public String executar() {
        return "Checkout efetivado";
    }

    public String cancelar() {
        return "Checkout cancelado";
    }
}