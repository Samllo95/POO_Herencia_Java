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
public class EmpresaRopa extends Empresa{
    public String tiposPrenda;
    public int numPrendas;

    public EmpresaRopa(String tiposPrenda, int numPrendas, String nombreEmpresa, String rubroEmpresa, String localizacionEmpresa, int yearFundacion, int numEmpleados) {
        super(nombreEmpresa, rubroEmpresa, localizacionEmpresa, yearFundacion, numEmpleados);
        this.tiposPrenda = tiposPrenda;
        this.numPrendas = numPrendas;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tiposPrenda + "\n" + this.numPrendas + "\n";
        return info+super.infoEmpresa(); 
    }
 
    public String crearPrenda(){
        return "Prenda creada: " + this.tiposPrenda;
    }
    
}
