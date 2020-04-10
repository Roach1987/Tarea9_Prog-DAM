package programacion.dam.tarea9.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import programacion.dam.tarea9.beans.CuentaBancaria;

/**
 *
 * @author Roach
 */
public class Util {
    
    // Constantes de clase
    public static final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
    public static final int TOTAL_CUENTA = 20;
    public static final String VALIDACION_OK = "OK";
    public static final int SEVERIDAD_INFORMACION = JOptionPane.INFORMATION_MESSAGE;
    public static final int SEVERIDAD_ADVERTENCIA = JOptionPane.WARNING_MESSAGE;
    public static final int SEVERIDAD_ERROR = JOptionPane.ERROR_MESSAGE;
    public static final String OPERACION_INGRESAR = "Ingresar";
    public static final String OPERACION_RETIRAR = "Retirar";
    public static final String OPERACION_SALDO = "Saldo";
    
    // Lista de Cuentas Bancarias
    public static ArrayList<CuentaBancaria> listaCuentasBancarias = new ArrayList<CuentaBancaria>();
   
// ************************************************************************************************************ 
// ************************************** CRUD Cuenta Bancaria ************************************************
// ************************************************************************************************************
    
    /**
     * Método que crea una cuenta bancaria en la lista, si esta no existe previamente.
     * @param cuenta 
     */
    public static void agregarCuentaBancariaEnLista(CuentaBancaria cuenta){
        // CREATE
        if(null != cuenta){
            if(null != cuenta.getCcc()){
                String cuentaBuscar = cuenta.getCcc(); 
                CuentaBancaria cuentaEncontrada = buscarCuentaBancariaPorCCC(cuentaBuscar);
                
                if(null == cuentaEncontrada){
                    listaCuentasBancarias.add(cuenta);
                }else{
                    mostrarMensaje(null, "Ya existe una cuenta con el ccc ".concat(cuentaBuscar), SEVERIDAD_INFORMACION);
                }
            }
        }
    }
    
    /**
     * Método que devuelve la lista de cuentas bancarias.
     * @return listaCuentasBancarias
     */
    public static ArrayList<CuentaBancaria> listarCuentasBancarias(){
        // READ
        return listaCuentasBancarias;
    }
    
    /**
     * Método que busca en la lista llegada por parametro, y devuelve el coincidente con el ccc
     * llegado por parametro.
     * @param ccc
     * @return 
     */
    public static CuentaBancaria buscarCuentaBancariaPorCCC(String ccc){
        // SEARCH
        CuentaBancaria respuesta = null;
        for(CuentaBancaria cuenta : listaCuentasBancarias){
            if(cuenta.getCcc().equals(ccc)){
                respuesta = cuenta;
                break;
            }
        }
        return respuesta;
    }
    
    /**
     * Método que actualiza una cuenta bancaria existente en la lista de cuentas.
     * Si no existe, se notificara con un panel con el mensaje correspondiente.
     * @param cuenta
     * @param operacion
     * @param saldo 
     */
    public static void actualizarCuentaBancariaEnLista(CuentaBancaria cuenta, String operacion, double saldo){
        // UPDATE
        if(null != cuenta){
            if(null != cuenta.getCcc()){
                String codigoCuentaBuscar = cuenta.getCcc();
                CuentaBancaria cuentaEncontrada = buscarCuentaBancariaPorCCC(codigoCuentaBuscar);

                if(null != cuentaEncontrada){
                    if(operacion.equals(OPERACION_INGRESAR)){
                        cuentaEncontrada.setSaldo(cuentaEncontrada.getSaldo() + saldo);
                    }else{
                        // No permitiremos que ninguna cuenta bancaria este en numeros negativos.
                        double auxiliar = ((cuentaEncontrada.getSaldo() - saldo) < 0) ? 0 : cuentaEncontrada.getSaldo() - saldo;
                        cuentaEncontrada.setSaldo(auxiliar);
                    }
                }else{
                    mostrarMensaje(null, "No existe una cuenta bancaria con ccc ".concat(codigoCuentaBuscar), SEVERIDAD_ADVERTENCIA);
                }
            }else{
                mostrarMensaje(null, "La cuenta bancaria no tiene codigo CCC.", SEVERIDAD_ERROR);
            }
        }else{
            mostrarMensaje(null, "La cuenta bancaria no existe.", SEVERIDAD_ERROR);
        }
    }
    
    // ******************************************************************* 
    // ******** Este programa no cuenta con opción de borrar una cuenta.
    // *******************************************************************     
    
// ************************************************************************************************************    
// **************************************** Validaciones Cuenta ***********************************************
// ************************************************************************************************************
    
    /**
     * Método que valida el numero de la cuenta que se recibe por parametro.
     * Devolvera true si el numero de cuenta introducido es valido, para ello comprobara
     * cada uno de los componentes de la cuenta, incluido las digitos de control.
     * @param cuentaProvisional
     * @return (String) Mensaje de la operación.
     */
    public static String validarCuentaCorrienteCliente(String cuentaProvisional) {
        String mensajeCuenta = "";

        // Declaramos un booleano que comprobara que cada componente de la cuenta
        // corriente sea correcto.
        boolean validaComponente = true;
       
        // Declaramos una cadena con la Entidad y la oficina, para validar los 
        // digitos de control
        String controlEntidadSucursal;

        // variable para en la que guardaremos el primer digito de control
        int digitoEntidadSucursal;

        // Declaramos una cadena con el numero de cuenta, para validar los 
        // digitos de control
        String controlNumeroCuenta;

        // variable para en la que guardaremos el segundo digito de control
        int digitoNumeroCuenta;

        // Validamos que el numero de cuenta tenga los caracteres que tiene que tener.
        if (cuentaProvisional.length() != TOTAL_CUENTA) {
            mensajeCuenta = "El numero de cuenta debe tener 20 digitos!";
        } else {
            // Declaramos una variable auxiliar que se sobreescribira con 
            // el trozo de la cuenta corriente correspondiente a los 4 componentes
            // de la Cuenta Corriente
            String cadenaAuxiliar = "";

            // Recorreremos el bucle 4 veces cada vuelta corresponde a un trozo de 
            // la cuenta corriente (Entidad, Sucursal, Digito de Control y Numero Cuenta)
            for (int i = 0; i < 4; i++) {
                if (validaComponente) {
                    switch (i) {
                        case 0: // Entidad
                            cadenaAuxiliar = cuentaProvisional.substring(0, 4);
                            if (!validaNumeros(cadenaAuxiliar)) {
                                mensajeCuenta = "Los digitos de la entidad deben de ser numericos.";
                                validaComponente = false;
                            }
                            break;
                        case 1: // Sucursal u oficina
                            cadenaAuxiliar = cuentaProvisional.substring(4, 8);
                            if (!validaNumeros(cadenaAuxiliar)) {
                                mensajeCuenta = "Los digitos de la sucursal deben de ser numericos.";
                                validaComponente = false;
                            }
                            break;
                        case 2: // Digito de control
                            cadenaAuxiliar = cuentaProvisional.substring(8, 10);
                            if (!validaNumeros(cadenaAuxiliar)) {
                                mensajeCuenta = "Los digitos del control deben de ser numericos.";
                                validaComponente = false;
                            }
// *********************************** Primer Digito de Control **********************************************
                            // Concatenamos dos ceros al principio, para que sumen 10 digitos
                            // necesario para obtener el primer digito de control
                            controlEntidadSucursal = "00".concat(cuentaProvisional.substring(0, 8));
                            digitoEntidadSucursal = obtenerDigitoControl(controlEntidadSucursal);
// *********************************** Segundo Digito de Control *********************************************
                            // obtenemos el numero de cuenta
                            controlNumeroCuenta = cuentaProvisional.substring(10, 20);
                            digitoNumeroCuenta = obtenerDigitoControl(controlNumeroCuenta);
// *********************************** Digito de Control resultado *******************************************
                            // obtenemos el digito de control completo, que es el resultado
                            // de concatenar el primer digito con el segundo.
                            String digitoControlResultado = String.valueOf(digitoEntidadSucursal).concat(String.valueOf(digitoNumeroCuenta));
// ***********************************************************************************************************                                
                            // Comprobamos que el digito de control resultante sea valido
                            if (!digitoControlResultado.equals(cadenaAuxiliar)) {
                                mensajeCuenta = "Los digitos del control no son validos";
                                validaComponente = false;
                            }
                            break;
                        case 3: // Numero de cuenta
                            cadenaAuxiliar = cuentaProvisional.substring(10, 20);
                            if (!validaNumeros(cadenaAuxiliar)) {
                                mensajeCuenta = "Los digitos del numero de cuenta deben de ser numericos.";
                                validaComponente = false;
                            }
                            break;
                    }    
                } else {
                    // Si algun componente de la cuenta no es valido, se rompe el bucle y  se
                    // vuelve a solicitar el numero de cuenta al usuario.
                    break;
                }
            }
            mensajeCuenta = (validaComponente) ? VALIDACION_OK : mensajeCuenta;
        }
        return mensajeCuenta;
    }
  
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
// **************************************** Métodos Utilitarios ***********************************************
// ************************************************************************************************************
    
    /**
     * Método para mostrar mensajes de error generados en el flujo del programa.
     * @param panel
     * @param mensaje 
     * @param severidad 
     */
    public static void mostrarMensaje(JPanel panel,String mensaje, int severidad){
        JOptionPane.showMessageDialog(panel, mensaje, "Información del sistema", 
                severidad);
    }
    
    /**
     * valida que sea un double y que no sea negativo
     * @param dato: el saldo que hay que retirar/ingresar 
     * @return true si es un double positivo.
     */
    public static boolean validarDouble(String dato){
        try{
            double numeroValidar = Double.parseDouble(dato); 
            if (numeroValidar < 0){
                mostrarMensaje(null, "El campo no puede ser negativo", SEVERIDAD_INFORMACION);
                return false;
            } else if (numeroValidar == 0){
                mostrarMensaje(null, "No se puede ingresar o retirar 0?", SEVERIDAD_INFORMACION);
                return false;
            } 
        } catch (NumberFormatException ex){
            mostrarMensaje(null, "El campo no tiene un formato valido", SEVERIDAD_ERROR);
            return false;
        }
        return true;
    }
    
    /**
     * validamos que el dato sea double y este entre 0 y 100
     * @param panel
     * @param dato
     * @return 
     */
    public static boolean validarPorcentaje(String dato){
        try{
            double porcentajeValidar = Double.parseDouble(dato); 
            if (!(porcentajeValidar >= 0 && porcentajeValidar <= 100)){
                mostrarMensaje(null, "El campo tiene que estar entre 0 y 100%", SEVERIDAD_ADVERTENCIA);
                return false;
            }
        } catch (NumberFormatException ex){
            mostrarMensaje(null, "El campo no tiene un formato numerico valido", SEVERIDAD_ERROR);
            return false;
        }
        return true;
    }
    
    /**
     * Método que comprueba el formato de una fecha, el formato debe de ser dd/MM/yyyy.
     * @param fecha
     * @return boolean si la fecha es valida.
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
    
    /**
     * Método utilitario que elimina los espacios en blanco y guiones (-) 
     * dentro de una cadena de caracteres, ya que se puede dar ambas casuisticas 
     * a la hora de enviar una los numeros de una cuenta corriente.
     * @param cadena
     * @return (String) cadena sin espacios.
     */
    public static String eliminarEspaciosGuiones(String cadena){
        int longitud = cadena.length();
        StringBuilder constructorCadenas = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != '-')
            constructorCadenas.append(cadena.charAt(i));
        }
        return constructorCadenas.toString();
    }
    
    /**
     * Método que comprueba que un nombre o apellido no contenga numeros
     * y como mucho contenga 2 espacios (Nombre o apellidos compuestos)
     * @param cadena
     * @return 
     */
    public static boolean compruebaCadena(String cadena){        
        int longitud = cadena.length();
        for(int i = 0; i < longitud; i++){
            char caracter = cadena.charAt(i);
            int contadorEspacios = 0;
            
            if(contadorEspacios > 2 || caracter != ' ' || !Character.isLetter(caracter)){
                return false;
            }            
            if(Character.isSpaceChar(caracter)){
                contadorEspacios ++;
            }
        }
        return true;
    }
// ************************************************************************************************************
}