/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author samll
 */
public class CategElectronica extends Categorias{
    public double descuento;

    public CategElectronica(String categ) {
        super(categ);
        this.descuento = 0.10;
    }
    
    public double aplicaDesc(double desc){
        double descuent=desc-(desc*this.descuento);
        return descuent;
    }
    
}
