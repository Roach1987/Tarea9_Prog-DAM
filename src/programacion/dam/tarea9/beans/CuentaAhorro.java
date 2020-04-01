package programacion.dam.tarea9.beans;

/**
 *
 * @author Roach
 */
public class CuentaAhorro extends CuentaBancaria{
    
    // Atributos
    protected Double tipoInteres;
    
    // Constructores
    protected CuentaAhorro(Persona titular, Double saldo, String ccc, Double tipoInteres){
        this.titular = titular;
        this.saldo = saldo;
        this.ccc = ccc;
        this.cuentaRemunerada = true;
        this.tipoInteres = tipoInteres;
    }
    
    // Getters y Setters
    protected Double getTipoInteres() {
        return tipoInteres;
    }

    protected void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}