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
public class Guitarra extends Instrumentos{
    public int numeroCuerdas; 

    public Guitarra(int numeroCuerdas, String modelo, int year, String fabricante) {
        super(modelo, year, fabricante);
        this.numeroCuerdas = numeroCuerdas;
    }

    
    
    public String afinarCuerdas(){
        return "Cuerdas afinadas!!!";
    }
    
}
