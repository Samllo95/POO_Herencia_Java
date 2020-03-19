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
public class Gerente extends Empleados{
    public String puestoGerencia;
    public double comiGerente;
    public Presidente presidente;

    public Gerente(String puestoGerencia, double comiGerente, Presidente presidente, String nombre, String direccion, String puesto, int telefono, double sueldo) {
        super(nombre, direccion, puesto, telefono, sueldo);
        this.puestoGerencia = puestoGerencia;
        this.comiGerente = comiGerente;
        this.presidente = presidente;
    }

    @Override
    public String infoEmpleado() {
        String info="Estas al servicio de " + this.presidente.nombre + " Presidente de la empresa " + this.presidente.empresa + 
                    "\n" + this.comiGerente + "\n";
        return info+super.infoEmpleado();
    }

    
    
    public String adminis(){
        return "Gerente especial del departamento de " + this.puestoGerencia;
    }
    
}
