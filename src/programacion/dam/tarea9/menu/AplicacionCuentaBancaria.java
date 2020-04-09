package programacion.dam.tarea9.menu;

import programacion.dam.tarea9.beans.CuentaAhorro;
import programacion.dam.tarea9.beans.CuentaCorrientePersonal;
import programacion.dam.tarea9.beans.CuentaCorrienteEmpresa;
import programacion.dam.tarea9.beans.Persona;
import programacion.dam.tarea9.util.Util;
import programacion.dam.tarea9.ventanas.Principal;

/**
 *
 * @author Roach
 */
public class AplicacionCuentaBancaria{
    
    public static void main(String[] args) {
    
        // Creamos un ejemplo de cada una de las cuentas
        Persona persona1 = new Persona("Antonio", "Parra Olmedo", "10/03/1985");
        Persona persona2 = new Persona("Manuel", "Pérez Jiménez", "25/02/1998");
        Persona persona3 = new Persona("Jesús", "Navarra López", "12/07/2000");
        
        CuentaAhorro cuentaAhorro = new CuentaAhorro(persona1, 500.0, "4629-3332-98-8964388892", 2.0);
        CuentaCorrientePersonal cuentaCorrientePersonal = new CuentaCorrientePersonal(persona2, 600.0, "3466-2331-19-6933272672", 10.0);
        CuentaCorrienteEmpresa cuentaCorrienteEmpresa = new CuentaCorrienteEmpresa(persona3, 700.0, "7978-6952-45-5993240447", 5.0, 6.0, 100.0);
        
        Util.agregarCuentaBancariaEnLista(cuentaAhorro);
        Util.agregarCuentaBancariaEnLista(cuentaCorrientePersonal);
        Util.agregarCuentaBancariaEnLista(cuentaCorrienteEmpresa);
        
        //creamos la ventana del programa y la hacemos visible
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
    }
}
