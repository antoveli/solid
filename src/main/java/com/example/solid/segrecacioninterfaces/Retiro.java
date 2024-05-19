package com.example.solid.segrecacioninterfaces;

public class Retiro implements OperacionBancaria, OperacionCuentaOrigen {

    private CuentaBancaria cuenta;

    public Retiro(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void realizarOperacion(double monto) throws OperacionBancariaException
    {
        if (monto > 0) {
            retirarMonto(monto);
        } else {
            throw new OperacionBancariaException("El monto a retirar debe ser positivo");
        }
    }

    @Override
    public void verificarSaldoSuficiente(double monto) throws OperacionBancariaException
    {
        if (cuenta.getSaldo() < monto) {
            throw new OperacionBancariaException("Saldo insuficiente en la cuenta origen");
        }
    }

    @Override
    public void retirarMonto(double monto) throws OperacionBancariaException
    {
        verificarSaldoSuficiente(monto);

        System.out.println("Aca se iniciar el proceso de retiro");
    }
}

