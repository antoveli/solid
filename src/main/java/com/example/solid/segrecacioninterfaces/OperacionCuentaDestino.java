package com.example.solid.segrecacioninterfaces;

public interface OperacionCuentaDestino
{
    void depositarMonto(double monto) throws OperacionBancariaException;
}
