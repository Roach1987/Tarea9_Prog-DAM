package programacion.dam.tarea9.beans;

import java.util.Hashtable;

/**
 *
 * @author Roach
 */
public abstract class CuentaCorriente extends CuentaBancaria{
    
    // Atributos
    protected Hashtable<String,Double> listaEntidadesAutorizadas;
    protected boolean tieneComisionMantenimiento;
    
    // Constructores
    protected CuentaCorriente(){
        listaEntidadesAutorizadas= new Hashtable();
        listaEntidadesAutorizadas.put("EntidadAutorizada1",500d);
        listaEntidadesAutorizadas.put("EntidadAutorizada2",1000d);
        listaEntidadesAutorizadas.put("EntidadAutorizada3",400d);
        listaEntidadesAutorizadas.put("EntidadAutorizada4",100d);
        listaEntidadesAutorizadas.put("EntidadAutorizada5",200d);
    }
    
    // Getters y Setters

    protected Hashtable<String,Double> getListaEntidadesAutorizadas() {
        return listaEntidadesAutorizadas;
    }

    protected void setListaEntidadesAutorizadas(Hashtable<String,Double> listaEntidadesAutorizadas) {
        this.listaEntidadesAutorizadas = listaEntidadesAutorizadas;
    }

    protected boolean isTieneComisionMantenimiento() {
        return tieneComisionMantenimiento;
    }

    protected void setTieneComisionMantenimiento(boolean tieneComisionMantenimiento) {
        this.tieneComisionMantenimiento = tieneComisionMantenimiento;
    }
}