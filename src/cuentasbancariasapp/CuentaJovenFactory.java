package cuentasbancariasapp;

/* @author gamur */

public class CuentaJovenFactory implements CuentasBancariasFactory{

    @Override
    public Cuenta crearCuenta() {
        return new CuentaJoven();
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebitoJoven();
    }

    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaCredito() {
            @Override
            public double getCosto() {
                return 0;  
            }
            
            @Override
            public double getLimiteEndeudamiento(){
                return 0;
            }
        };
                
    }
    
    @Override
    public Regalo crearRegalo() {
       return new RegaloJoven(); 
    }
}
