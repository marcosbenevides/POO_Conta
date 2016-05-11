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
public class Poupanca extends Conta {

    private static Double rendimento = 0.005;
    private static final String tipoConta = "Poupança";

    public Poupanca(String titular, Double saldo) {
        super(titular, saldo, tipoConta);
    }

    public Poupanca(String titular) {
        super(titular, tipoConta);
    }

    /**
     */
    public void gerarRendimento() {
        setSaldo(getSaldo() + (getSaldo() * rendimento));
    }

    /**
     * @param valor
     */
    public void setRendimento(Double valor) {
        this.rendimento = valor;
    }

    /**
     * @return
     */
    public Double getRendimento() {
        return rendimento * 100;
    }
}
