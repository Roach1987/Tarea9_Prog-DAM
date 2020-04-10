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
        listaEntidadesAutorizadas.put("Banco Mediolanum",500.0);
        listaEntidadesAutorizadas.put("Caja Extremadura",1000.0);
        listaEntidadesAutorizadas.put("Caixa la Avenue",400.0);
        listaEntidadesAutorizadas.put("Caja Mar",100.0);
        listaEntidadesAutorizadas.put("Banco Palomo",200.);
    }
    
    // Getters y Setters
    public Hashtable<String,Double> getListaEntidadesAutorizadas() {
        return listaEntidadesAutorizadas;
    }

    public void setListaEntidadesAutorizadas(Hashtable<String,Double> listaEntidadesAutorizadas) {
        this.listaEntidadesAutorizadas = listaEntidadesAutorizadas;
    }

    public boolean isTieneComisionMantenimiento() {
        return tieneComisionMantenimiento;
    }

    public void setTieneComisionMantenimiento(boolean tieneComisionMantenimiento) {
        this.tieneComisionMantenimiento = tieneComisionMantenimiento;
    }
}