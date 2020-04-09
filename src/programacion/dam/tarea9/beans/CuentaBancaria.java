package programacion.dam.tarea9.beans;

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
    
    // Getters y Setters
    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public boolean isCuentaRemunerada() {
        return cuentaRemunerada;
    }

    public void setCuentaRemunerada(boolean cuentaRemunerada) {
        this.cuentaRemunerada = cuentaRemunerada;
    }
}