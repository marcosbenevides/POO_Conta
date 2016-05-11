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
public class POOConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poupanca p = new Poupanca("Marcos", 100.0);

        Corrente c = new Corrente("Carina", 200.0);

        System.out.println(p.toString());
        System.out.println(c.toString());

        System.err.println("\n---------- Transferências ----------\n");
        p.transferencia(50.00, c);
        p.gerarRendimento();
        System.out.println(p.toString() + "\n" + c.toString());
       
        

    }

}
