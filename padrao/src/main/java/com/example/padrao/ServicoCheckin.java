package com.example.padrao;

public class ServicoCheckin implements IServico {

    public String executar() {
        return "Checkin efetivado";
    }

    public String cancelar() {
        return "Checkin cancelado";
    }
}