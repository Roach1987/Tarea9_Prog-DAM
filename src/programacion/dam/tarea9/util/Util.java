package programacion.dam.tarea9.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Roach
 */
public class Util {
    
    // Constantes de clase
    public static final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
    
//**************************************** Validaciones Fecha ************************************************
    /**
     * Método que comprueba el formato de una fecha, el formato debe de ser dd/MM/yyyy.
     * @param fecha
     * @return boolean
     */
    public static boolean validarFecha(String fecha) {
        boolean resultado;
        try {
            // Seteamos al formato fecha el modo  Modo no-permisivo
            // para que solo soporte el formato dd/MM/yyyy
            FORMATO_FECHA.setLenient(false);
            FORMATO_FECHA.parse(fecha);
            resultado = true;
        } catch (ParseException e) {
            // Si la fecha llegada por parametro es invalida, el metodo devolvera
            // false
            resultado = false;
        }
        return resultado;
    }    
// ***********************************************************************************************************    
    
// **************************************** Validaciones Cuenta **********************************************
    /**
     * Método utilitario, en el que validaremos que el String llegado sean todo
     * numeros.
     * @param cadena
     * @return (boolean) true si todos los caracteres de la cadena llegada son
     * numeros.
     */
    public static boolean validaNumeros(String cadena) {
        boolean resultado = true;
        int longitud = cadena.length();

        // Recorremos la cadena llegada
        for (int i = 0; i < longitud; i++) {
            // Comprobamos que el caracter es un numero.
            if (!Character.isDigit(cadena.charAt(i))) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    
    /**
     * Método que comprueba la cuenta llegada por parametro y devuelve el digito de control
     * para un correcto uso del metodo se debe enviar cada parte del numero de cuenta
     * en la primera invocación enviar los numeros de entidad y sucursal concatenados con 2 ceros 
     * al principio, y luego el numero de cuenta, para asi obtener los dos digitos de control a comprobar.
     * @param cuenta
     * @return (int) digito de control
     */
    public static int obtenerDigitoControl(String cuenta) {
        int resultado = 0;
        int[] factores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int longitudCuenta = cuenta.length();
        int digito;

        // Recorremos el numero de cuenta.
        for (int i = 0; i < longitudCuenta; i++) {
            // Obtenemos el caracter actual de la cuenta.
            String caracterActual = String.valueOf(cuenta.charAt(i));
            // Parseamos el valor del caracter actual a entero. 
            digito = Integer.parseInt(caracterActual);
            // Guardamos el caracter parseado.
            resultado += digito * factores[i];
        }
        resultado = 11 - (resultado % 11);
        
        // Comprobamos que el modulo de la operacion del digito, y luego se le restara
        // el propio valor del digito, y se comprobara que sea
        // 11 en cuyo caso se asignara el valor 0, 10 en este caso se asignara el valor 1
        // u otro resultado en cuyo caso se pondra su valor (0 al 9).
        if(resultado == 11){
            resultado = 0;
        }else if(resultado == 10){
            resultado = 1;
        }

        return resultado;
    }
// ************************************************************************************************************
}