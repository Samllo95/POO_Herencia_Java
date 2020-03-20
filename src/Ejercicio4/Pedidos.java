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
public class Pedidos {
    public String producto;
    public double precio;
    Proveedor provee;

    public Pedidos(String producto, double precio, Proveedor provee) {
        this.producto = producto;
        this.precio = precio;
        this.provee = provee;
    }
    
    
    
}
