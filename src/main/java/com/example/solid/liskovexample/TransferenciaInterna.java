package com.example.solid.liskovexample;

import com.example.solid.exceptions.TransferenciaException;

public class TransferenciaInterna extends Transferencia {

    public TransferenciaInterna(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto, String descripcion) {
        super(cuentaOrigen, cuentaDestino, monto, descripcion);
    }

    @Override
    public void realizarTransferencia() throws TransferenciaException {
        validarDatos();
        verificarSaldos();
        actualizarSaldos();
    }
}
