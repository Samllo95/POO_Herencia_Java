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
public class EmpresaAutos extends Empresa{
    public String tipoChasis;
    public String tipoCarroceria;
    public String tipoMotor;
    public int numPuertas;

    public EmpresaAutos(String tipoChasis, String tipoCarroceria, String tipoMotor, int numPuertas, String nombreEmpresa, String rubroEmpresa, String localizacionEmpresa, int yearFundacion, int numEmpleados) {
        super(nombreEmpresa, rubroEmpresa, localizacionEmpresa, yearFundacion, numEmpleados);
        this.tipoChasis = tipoChasis;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoMotor = tipoMotor;
        this.numPuertas = numPuertas;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tipoChasis + "\n" + this.tipoCarroceria + "\n" + 
                    this.tipoMotor + "\n" + this.numPuertas + "\n";
        
        return info+super.infoEmpresa(); 
    }
    
    public String ensamblarAuto(){
        return "Auto ensamblado satisfactoriamente";
    }
    
}
