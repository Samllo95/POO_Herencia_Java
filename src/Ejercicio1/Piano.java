/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author samll
 */
public class Piano extends Instrumentos{
    public String tipoPiano;

    public Piano(String tipoPiano, String modelo, int year, String fabricante) {
        super(modelo, year, fabricante);
        this.tipoPiano = tipoPiano;
    }
    
    public String tocarMelodia(){
        return "║░█░█░║░█░█░█░║░█░█░║" +
                "\n" +
                "║░█░█░║░█░█░█░║░█░█░║" +
                "\n" +
                "║░║░║░║░║░║░║░║░║░║░║" +
                "\n" +
                "╚═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩";
    }
    
}
