package com.example.solid.segrecacioninterfaces;

public class Deposito implements OperacionBancaria, OperacionCuentaDestino {

    private CuentaBancaria cuenta;

    public Deposito(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void realizarOperacion(double monto) throws OperacionBancariaException {
        if (monto > 0) {
            depositarMonto(monto);
        } else {
            throw new OperacionBancariaException("El monto a depositar debe ser positivo");
        }
    }

    @Override
    public void depositarMonto(double monto) throws OperacionBancariaException {
        if (monto > 0) {

            System.out.println("Aca iniciamos a depositar ");

        } else {
            throw new OperacionBancariaException("El monto a depositar debe ser positivo");
        }
    }
}
