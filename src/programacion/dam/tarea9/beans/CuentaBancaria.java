package programacion.dam.tarea9.beans;

import java.util.ArrayList;

/**
 *
 * @author Roach
 */
public abstract class CuentaBancaria {
    
    // Atributos
    protected Persona titular;
    protected Double saldo;
    protected String ccc;
    protected boolean cuentaRemunerada;
    protected ArrayList<CuentaBancaria> listaCuentas;
    
    
    // Getters y Setters
    protected Persona getTitular() {
        return titular;
    }

    protected void setTitular(Persona titular) {
        this.titular = titular;
    }

    protected Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    protected String getCcc() {
        return ccc;
    }

    protected void setCcc(String ccc) {
        this.ccc = ccc;
    }

    protected boolean isCuentaRemunerada() {
        return cuentaRemunerada;
    }

    protected void setCuentaRemunerada(boolean cuentaRemunerada) {
        this.cuentaRemunerada = cuentaRemunerada;
    }

    protected ArrayList<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    protected void setListaCuentas(ArrayList<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}