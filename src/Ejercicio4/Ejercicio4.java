/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author samll
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        ArrayList<Pedidos> myPedidos=new ArrayList<>();
        ArrayList<Pedidos> myPedidos1=new ArrayList<>();
        ArrayList<Pedidos> myPedidos2=new ArrayList<>();
        
        Proveedor myprovee=new Proveedor("Carlos Perez", "Santa Ana");
        
        CategVideoJuegos catg=new CategVideoJuegos("Video Juegos");
        CategElectronica catg1=new CategElectronica("Electronica");
        CategMuebles catg2=new CategMuebles("Muebles");
        
        myPedidos.add(new Pedidos("PS4", 500.75, myprovee));
        myPedidos.add(new Pedidos("Fifa 20", 79.99, myprovee));
        myPedidos.add(new Pedidos("Control Xbox", 89.00, myprovee));
        
        myPedidos1.add(new Pedidos("Cama", 298.00, myprovee));
        myPedidos1.add(new Pedidos("Silla reclinable", 110.50, myprovee));
        myPedidos1.add(new Pedidos("Sofa", 200.10, myprovee));
        
        myPedidos2.add(new Pedidos("Lampara", 49.00, myprovee));
        myPedidos2.add(new Pedidos("Control para TV", 8.00, myprovee));
        myPedidos2.add(new Pedidos("Baterias", 1.00, myprovee));
        
        double ttvj=0;
        double ttmuebles=0;
        double ttelctri=0;
        
        for(int i=0; i<myPedidos.size(); i++){
            ttvj+=myPedidos.get(i).precio;
            System.out.println(myPedidos.get(i).producto);
            System.out.println(myPedidos.get(i).precio);
            System.out.println(myPedidos.get(i).provee.nombre);
                        
        }
        System.out.println("Total a pagar por el decuento de Video Juegos: $" + catg.aplicaDesc(ttvj) + "\n");
        
        for(int i=0; i<myPedidos1.size(); i++){
            ttelctri+=myPedidos1.get(i).precio;
            System.out.println(myPedidos1.get(i).producto);
            System.out.println(myPedidos1.get(i).precio);
            System.out.println(myPedidos1.get(i).provee.nombre);
                        
        }
        System.out.println("Total a pagar por el decuento de Electronica: $" + catg1.aplicaDesc(ttelctri) + "\n");
        
        for(int i=0; i<myPedidos2.size(); i++){
            ttmuebles+=myPedidos2.get(i).precio;
            System.out.println(myPedidos2.get(i).producto);
            System.out.println(myPedidos2.get(i).precio);
            System.out.println(myPedidos2.get(i).provee.nombre);
                        
        }
        System.out.println("Total a pagar por el decuento de Muebles: $" + catg2.aplicaDesc(ttmuebles) + "\n");
        
    }
}
