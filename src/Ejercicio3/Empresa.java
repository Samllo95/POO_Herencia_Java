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
public class Empresa {
    public String nombreEmpresa;
    public String rubroEmpresa;
    public String localizacionEmpresa;
    public int yearFundacion;
    public int numEmpleados;

    public Empresa() {
    }
    public Empresa(String nombreEmpresa, String rubroEmpresa, String localizacionEmpresa, int yearFundacion, int numEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.rubroEmpresa = rubroEmpresa;
        this.localizacionEmpresa = localizacionEmpresa;
        this.yearFundacion = yearFundacion;
        this.numEmpleados = numEmpleados;
    }
    
    public String infoEmpresa(){
        String info=this.nombreEmpresa + "\n" + this.rubroEmpresa + "\n" +
                    this.localizacionEmpresa + "\n" + this.yearFundacion + "\n" +
                    this.numEmpleados + "\n";
        return info;
    }
    
    public String recibirPedidos(){
        return "Pedidos recibidos";
    }
    
    public String enviarPedidos(){
        return "Pedidos enviados";
    }
    
}
