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
public class Empleados {
    public String nombre;
    public String direccion;
    public String puesto;
    public int telefono;
    public double sueldo;
    public Gerente gerente;

    public Empleados() {
    }
    public Empleados(String nombre, String direccion, String puesto, int telefono, double sueldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puesto = puesto;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }
    public Empleados(String nombre, String direccion, String puesto, int telefono, double sueldo, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puesto = puesto;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.gerente = gerente;
    }
    
    public String info(){
        return "Estas a las ordenes del " + this.gerente.puesto + " " + this.gerente.nombre + "\n" + infoEmpleado();
    }
    
    public String infoEmpleado(){
        String info=this.nombre + "\n" + this.direccion + "\n" +
                    this.puesto + "\n" + this.telefono + "\n" + 
                    this.sueldo;
        return info;
    }
    
    public String estadoEmpl(){
        return "Trabajando";
    }
    
    
}
