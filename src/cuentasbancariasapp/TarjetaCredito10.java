package cuentasbancariasapp;

/* @author gamur */
public class TarjetaCredito10 implements TarjetaCredito{
    
    @Override
    public double getCosto() {
        return 18.0; 
    }

    @Override
    public double getLimiteEndeudamiento() {
        return 0.6; 
    }
}
