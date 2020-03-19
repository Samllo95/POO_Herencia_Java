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
public class EmpresaPesca extends Empresa{
    public String tipoPesca;

    public EmpresaPesca(String tipoPesca, String nombreEmpresa, String rubroEmpresa, String localizacionEmpresa, int yearFundacion, int numEmpleados) {
        super(nombreEmpresa, rubroEmpresa, localizacionEmpresa, yearFundacion, numEmpleados);
        this.tipoPesca = tipoPesca;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tipoPesca + "\n";
        return info+super.infoEmpresa(); 
    }
    
    public String pescar(){
        return "Barcos pescando";
    }
    
    
}
