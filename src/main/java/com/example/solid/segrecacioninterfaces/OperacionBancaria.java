package com.example.solid.segrecacioninterfaces;

public interface OperacionBancaria
{
    void realizarOperacion(double monto) throws OperacionBancariaException;
}
