/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.conta;

import sun.awt.AWTAccessor;

/**
 *
 * @author Marcos
 */
public class Conta {

    private static Integer cont = 0;
    private Integer conta;
    private Integer agencia;
    private double saldo;
    private String titular, tipoConta;

    /**
     * Default constructor
     *
     * @param titular
     * @param saldo
     */
    public Conta(String titular, Double saldo, String tipoConta) {
        setSaldo(saldo);
        setTitular(titular);
        setTipoConta(tipoConta);
        setConta();
        setAgencia();
        setCont();
    }

    /**
     * Construtor da classe Conta. Aqui será setado o títular da mesma.
     *
     * @param titular
     */
    public Conta(String titular, String tipoConta) {
        setTitular(titular);
        setTipoConta(tipoConta);
    }

    public void setConta() {
        this.conta = cont;
    }

    public void setCont() {
        this.cont++;
    }

    /**
     * @return
     */
    public Integer getConta() {
        return conta;
    }

    /**
     * @param agencia
     */
    public void setAgencia() {
        this.agencia = cont + 1;
    }

    /**
     * @return
     */
    public Integer getAgencia() {
        return agencia;
    }

    /**
     * @param valor
     */
    public void setSaldo(Double valor) {
        this.saldo = valor;
    }

    /**
     * @return
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param nome
     */
    public void setTitular(String nome) {
        this.titular = nome;
    }

    /**
     * @return
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param valor
     */
    public void sacar(Double valor) {
        if (saldoDisponivel(valor)) {
            setSaldo(getSaldo() - valor);
        } else {
            System.err.println("Saldo insuficiente!");
        }
    }

    /**
     * @param valor
     * @param conta
     */
    public void transferencia(Double valor, Conta conta) {
        if (saldoDisponivel(valor)) {
            conta.setSaldo(valor + conta.getSaldo());
            setSaldo(getSaldo() - valor);
        } else {
            System.err.println("Saldo insuficiente!");

        }
    }

    /**
     * @param valor
     * @return
     */
    public Boolean saldoDisponivel(Double valor) {
        return getSaldo() >= valor;
    }

    public String toString() {
        return "Titular: " + getTitular() + "\tTipo Conta: " + getTipoConta()
                + "\nConta: " + getConta() + "\tAgência: " + getAgencia()
                + "\nSaldo:" + getSaldo()
                + "\n------------------------------------------------------------\n";
    }

    /**
     * @return the tipoConta
     */
    public String getTipoConta() {
        return tipoConta;
    }

    /**
     * @param tipoConta the tipoConta to set
     */
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

}
