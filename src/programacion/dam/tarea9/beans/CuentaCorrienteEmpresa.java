package programacion.dam.tarea9.beans;

/**
 *
 * @author Roach
 */
public final class CuentaCorrienteEmpresa extends CuentaCorriente{
    
    // Atributos
    private Double maximoDescubierto;
    private Double tipoInteresDescubierto;
    private Double comisionDescubierto;
    
    // Constructores
    public CuentaCorrienteEmpresa(){
        // Invocamos el constructor del padre, para recoger las entidades autorizadas.
        super();
    }
    
    public CuentaCorrienteEmpresa(Persona titular, Double saldo, String ccc, Double maximoDescubierto, 
            Double tipoInteresDescubierto, Double comisionDescubierto){
        // Invocamos el constructor del padre, para recoger las entidades autorizadas.
        super();
        this.tieneComisionMantenimiento = false;
        this.titular = titular;
        this.saldo = saldo;
        this.ccc = ccc;
        this.maximoDescubierto = maximoDescubierto;
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.comisionDescubierto = comisionDescubierto;
    }
    
    // Getters y Setters
    public Double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(Double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public Double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(Double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public Double getComisionDescubierto() {
        return comisionDescubierto;
    }

    public void setComisionDescubierto(Double comisionDescubierto) {
        this.comisionDescubierto = comisionDescubierto;
    }
}