/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.conta;

/**
 *
 * @author Marcos
 */
public class Corrente extends Conta {

    private static Double taxaSaque;
    private static Double taxaTransf;
    private static Double limCheEsp;
    private static final String tipoConta = "Corrente";

    public Corrente(String titular, Double saldo) {
        super(titular, saldo, tipoConta);
        limCheEsp = (getSaldo() * 0.3) * -1;
        setTaxaSaque(1.3);
        setTaxaTransf(2.10);
    }

    public Corrente(String titular) {
        super(titular, tipoConta);
    }

    /**
     */
    public void cobrarTaxaSaque() {
        if (saldoDisponivel(taxaSaque)) {
            setSaldo(getSaldo() - taxaSaque);
        } else {
            System.err.println("Saldo negativado!");
        }
    }

    public void cobrarTaxaTransf() {
        if (saldoDisponivel(taxaTransf)) {
            setSaldo(getSaldo() - taxaTransf);
        } else {
            System.err.println("Saldo negativado!");
        }
    }

    /**
     * @param valor
     */
    public final void setTaxaSaque(Double valor) {
        this.taxaSaque = valor;
    }

    /**
     * @return
     */
    public Double getTaxaSaque() {
        return taxaSaque;
    }

    /**
     * @param valor
     */
    public final void setTaxaTransf(Double valor) {
        this.taxaTransf = valor;
    }

    /**
     * @return
     */
    public Double getTaxaTransf() {
        return taxaTransf;
    }

    @Override
    public void sacar(Double valor) {
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado!");
        } else if (getSaldo() < valor || getSaldo() - valor > getLimCheEsp()) {
            System.err.println("Alerta! Você entrou no cheque especial");
            setSaldo(getSaldo() - valor);
        } else if (getSaldo() - valor < getLimCheEsp()) {
            System.err.println("Saldo insuficiente!");
        }
    }

    /**
     * @return the limCheEsp
     */
    public static Double getLimCheEsp() {
        return limCheEsp;
    }

    /**
     * @param aLimCheEsp the limCheEsp to set
     */
    public static void setLimCheEsp(Double aLimCheEsp) {
        limCheEsp = aLimCheEsp;
    }
}
