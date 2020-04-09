package programacion.dam.tarea9.beans;

/**
 *
 * @author Roach
 */
public class CuentaAhorro extends CuentaBancaria{
    
    // Atributos
    protected Double tipoInteres;
    
    // Constructores
    public CuentaAhorro(Persona titular, Double saldo, String ccc, Double tipoInteres){
        this.titular = titular;
        this.saldo = saldo;
        this.ccc = ccc;
        this.cuentaRemunerada = true;
        this.tipoInteres = tipoInteres;
    }
    
    // Getters y Setters
    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}