package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(0);
    }

	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        //Mostramos el saldo actual de la cuenta.
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
        	//Se produce cuando se intenta retirar una cantidad negativa o el saldo es insuficiente
            System.out.print("Fallo al retirar");
        }
        try {
        	//Se realiza el ingreso en la cuenta
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
        	//Se produce cuando se intenta ingresar una cantidad negativa
            System.out.print("Fallo al ingresar");
        }
	}
}
