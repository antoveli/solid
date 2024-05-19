package com.example.solid.segrecacioninterfaces;

public class TransferenciaInterna implements OperacionBancaria {

    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    private double monto;

    public TransferenciaInterna(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    @Override
    public void realizarOperacion(double monto) throws OperacionBancariaException {
        Retiro retiro = new Retiro(cuentaOrigen);
        Deposito deposito = new Deposito(cuentaDestino);

        retiro.retirarMonto(monto);
        deposito.depositarMonto(monto);
    }
}
