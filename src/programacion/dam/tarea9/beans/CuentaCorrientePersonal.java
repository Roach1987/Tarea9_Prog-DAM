package programacion.dam.tarea9.beans;

/**
 *
 * @author Roach
 */
public final class CuentaCorrientePersonal extends CuentaCorriente{
    
    // Atributos
    private Double comisionMantenimiento;
    
    // Constructores
    public CuentaCorrientePersonal(){
        // Invocamos el constructor del padre, para recoger las entidades autorizadas.
        super();
    }
    
    public CuentaCorrientePersonal(Persona titular, Double saldo, String ccc, Double comisionMantenimiento){
        // Invocamos el constructor del padre, para recoger las entidades autorizadas.
        super();
        this.tieneComisionMantenimiento = true;
        this.titular = titular;
        this.saldo = saldo;
        this.ccc = ccc;
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    // Getters y Setters
    public Double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(Double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
}