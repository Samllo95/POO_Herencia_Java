/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author samll
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++PRESIDENTE++++++++++++++++++++++++++++++++++");
        Presidente mypresid=new Presidente("La constacia", 1500, "Juan Lopez", "San Salvador", "Presidente", 78820912, 986.55);
        System.out.println(mypresid.infoEmpleado());
        System.out.println(mypresid.realizaPagos());
        
        System.out.println("+++++++++++++++++++++++++++GERENTES++++++++++++++++++++++++++++++++++++");
        System.out.println("GERENTE N°1");
        Gerente gerent1=new Gerente("Ventas", 875.98, mypresid, "Jose Chavez", "Sonsonate", "Gerente", 71982431, 723.00);
        System.out.println(gerent1.infoEmpleado());
        System.out.println(gerent1.adminis());
        
        System.out.println("\nGERENTE N°2");
        Gerente gerent2=new Gerente("Almacen", 875.98, mypresid, "Carmen Tovar", "La Union", "Gerente", 71943321, 773.00);
        System.out.println(gerent2.infoEmpleado());
        System.out.println(gerent2.adminis());
        
        
        System.out.println("+++++++++++++++++++++++++++EMPLEADOS++++++++++++++++++++++++++++++++++++");
        Empleados empl1=new Empleados("Elmer Gomez", "Santa Ana", "Vendedor", 78651231, 415.75, gerent1);
        System.out.println(empl1.info());
        System.out.println(empl1.estadoEmpl()+"\n");
        
        Empleados empl2=new Empleados("Sandra Esmeralda", "Santa Ana", "Vendedora", 78341231, 415.75, gerent1);
        System.out.println(empl2.info());
        System.out.println(empl2.estadoEmpl()+"\n");
        
        Empleados empl3=new Empleados("Raul Martinez", "Metapan", "Vendedor", 78893456, 415.75, gerent1);
        System.out.println(empl3.info());
        System.out.println(empl3.estadoEmpl()+"\n");
        
        Empleados empl4=new Empleados("Rosa Cruz", "Chalchuapa", "Organisadora", 78834571, 415.75, gerent2);
        System.out.println(empl4.info());
        System.out.println(empl4.estadoEmpl()+"\n");
        
        Empleados empl5=new Empleados("Manuel Cruz", "La Liberta", "Repartidor", 78344571, 415.75, gerent2);
        System.out.println(empl5.info());
        System.out.println(empl5.estadoEmpl()+"\n");
        
        Empleados empl6=new Empleados("Josue Villalobos", "San Salvador", "Bodeguista", 71212571, 415.75, gerent2);
        System.out.println(empl6.info());
        System.out.println(empl6.estadoEmpl()+"\n");
        
    }
  
}
