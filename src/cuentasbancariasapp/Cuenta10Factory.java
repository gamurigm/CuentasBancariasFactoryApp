package cuentasbancariasapp;

/* @author gamur */
public class Cuenta10Factory implements CuentasBancariasFactory {

    @Override
    public Cuenta crearCuenta() {
        return new Cuenta10();
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebito10();
    }

    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaCredito10();
    }

    @Override
    public Regalo crearRegalo() {
        return new Regalo10();
    }
}
