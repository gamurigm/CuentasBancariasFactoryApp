package cuentasbancariasapp;

/* @author gamur  */

public interface CuentasBancariasFactory {
    Cuenta crearCuenta();
    TarjetaDebito crearTarjetaDebito();
    TarjetaCredito crearTarjetaCredito();
    Regalo crearRegalo();
  
    
}
