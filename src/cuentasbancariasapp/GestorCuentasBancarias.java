package cuentasbancariasapp;

/* @author gamur */

public class GestorCuentasBancarias {

    public static void main(String[] args) {
        
        CuentasBancariasFactory c = new CuentaJovenFactory();
        Cuenta objC = c.crearCuenta();
        TarjetaDebito objTD = c.crearTarjetaDebito();
        TarjetaCredito objTC = c.crearTarjetaCredito(); 
        Regalo objR = c.crearRegalo();
        
        System.out.println("Interes:  " + objC.getTipoInteres());
        System.out.println("Costo Tarjeta Debito:  " + objTD.getCosto());
        System.out.println("Costo Tarjeta Credito:  " + objTC.getCosto());
        System.out.println("Limite Endeudamiento Tarjeta Credito:  " + objTC.getLimiteEndeudamiento());
        System.out.println("Regalo:  " + objR.getDescripcion());
     
    }
}
