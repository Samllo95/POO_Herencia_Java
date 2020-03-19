/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author samll
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        EmpresaRopa ropaInc=new EmpresaRopa("Casuales", 34, "Nike", "Ropa", "US", 1989, 178);
        System.out.println(ropaInc.infoEmpresa());
        System.out.println(ropaInc.recibirPedidos());
        System.out.println(ropaInc.enviarPedidos());
        System.out.println(ropaInc.crearPrenda());
        
        System.out.println("_____________________________________________________________________________\n");
        
        EmpresaAutos autoInc=new EmpresaAutos("Chasis Grande", "Carroceria de aluminio", "Motor V8", 2, "Ferrari", "Autos", "Italia", 1960, 77);
        System.out.println(autoInc.infoEmpresa());
        System.out.println(autoInc.recibirPedidos());
        System.out.println(autoInc.enviarPedidos());
        System.out.println(autoInc.ensamblarAuto());
        
        System.out.println("_____________________________________________________________________________\n");
        
        EmpresaPesca pescaInc=new EmpresaPesca("Comercial", "Ceviche Inc", "Pesca", "Japon", 2009, 34);
        System.out.println(pescaInc.infoEmpresa());
        System.out.println(pescaInc.recibirPedidos());
        System.out.println(pescaInc.enviarPedidos());
        System.out.println(pescaInc.pescar());
    }
}
