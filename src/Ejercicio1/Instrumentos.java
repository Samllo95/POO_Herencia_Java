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
public class Instrumentos {
    public String modelo;
    public int year;
    public String fabricante;

    public Instrumentos() {
    }
    public Instrumentos(String modelo, int year, String fabricante) {
        this.modelo = modelo;
        this.year = year;
        this.fabricante = fabricante;
    }
    
    public String sonidoInstrum(){
        String son="♫ ♪ ♫ ♪";
        return son;
    }
    
}
