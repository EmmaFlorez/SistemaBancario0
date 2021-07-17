package com.banking.SistemaBancario.models;

import javax.persistence.*;


@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String agencia;

    @Column ( name = "digito_verificador", nullable = false)
    private String digitoVerificador;

    @Column(name = "tipo_conta")
    @Enumerated(value = EnumType.STRING)
    private TipoConta tipoConta = TipoConta.CORRENTE;

    @Column(name = "numero_conta",nullable = false)
    private String numeroConta;

    @Column(name = "cpf_cnpj", nullable = false)
    private String cpfCnpj;
    private double saldo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public com.banking.SistemaBancario.models.TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(com.banking.SistemaBancario.models.TipoConta tipoConta) {
        tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
