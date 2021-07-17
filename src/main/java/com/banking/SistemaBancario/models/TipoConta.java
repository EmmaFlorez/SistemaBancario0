package com.banking.SistemaBancario.models;

public enum TipoConta {

    POUPANCA ( "Conta poupança"), CORRENTE ( "Conta corrente");

    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
