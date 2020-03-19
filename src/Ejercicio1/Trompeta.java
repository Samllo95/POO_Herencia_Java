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
public class Trompeta extends Instrumentos{
    public String materialFabricacion;

    public Trompeta(String materialFabricacion, String modelo, int year, String fabricante) {
        super(modelo, year, fabricante);
        this.materialFabricacion = materialFabricacion;
    }
    
    public String soplarTrompeta(){
        return "Soplando la Trompeta";
    }
}
