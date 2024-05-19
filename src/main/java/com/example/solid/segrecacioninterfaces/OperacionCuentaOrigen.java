package com.example.solid.segrecacioninterfaces;

public interface OperacionCuentaOrigen
{
    void verificarSaldoSuficiente(double monto) throws OperacionBancariaException;
    void retirarMonto(double monto) throws OperacionBancariaException;
}
