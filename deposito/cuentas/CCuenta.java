package cuentas;
/**
 * Esta clase informa de los datos de una cuenta corriente bancaria.
 * 
 * @author jmr25
 * @version 1.0
 *
 */
public class CCuenta {
	//Atributos
	/**
	 * Nombre del titular de la cuenta
	 * Número de cuenta bancaria
	 * Saldo de la cuenta bancaria
	 * Tipo de interés de la cuenta bancaria.
	 */
	

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    //Constructor
    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
    //Metodos 
/**
 * Devuelve el nombre del titular de la cuenta
 * @return nombre del titular de la cuenta
 */
    private String getNombre() {
		return nombre;
	}
    /**
     * Modifica el nombre de un titular de la cuenta
     * @param nombre
     */
    		

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el número de una cuenta bancaria
	 * @return número de cuenta
	 */

	private String getCuenta() {
		return cuenta;
	}
	/**
	 * Modifica el número de cuenta bancaria
	 * @param cuenta
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Devuelve el saldo de una cuenta bancaria
	 * @return saldo cuenta
	 */

	private double getSaldo() {
		return saldo;
	}
	/**
	 * Modifica el saldo de una cuenta bancaria
	 * @param saldo
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Devuelve el tipo de interés de una cuenta bancaria
	 * @return tipo de interés cuenta
	 */

	private double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Modifica el tipo de interés de una cuenta bancaria
	 * @param tipoInterés
	 */

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	/**
	 * Constructor con 4 parametros
	 * @param nom  Nombre titular cuenta
	 * @param cue  Número de cuenta
	 * @param sal  Saldo de la cuenta
	 * @param tipo Tipo de interés de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
	/**
	 * Devuelve el saldo de la cuenta bancaria
	 * @return saldo cuenta
	 */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad a la cuenta bancaria
     * @param cantidad
     * @throws Exception No es posible introducir una cantidad <=0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta bancaria
     * @param cantidad
     * @throws Exception No es posible retirar una cantidad <=0 y tampoco es posible
     * retirar una cantidad mayor al saldo actual de la cuenta bancaria.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
