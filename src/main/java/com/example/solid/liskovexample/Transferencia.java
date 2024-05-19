package com.example.solid.liskovexample;

import com.example.solid.exceptions.TransferenciaException;

abstract class Transferencia
{
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double monto;
    private String descripcion;

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto, String descripcion) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public abstract void realizarTransferencia() throws TransferenciaException;

    protected void validarDatos() throws TransferenciaException {
        //Realizar validaciones para operar transferncias
        System.out.println("Validadndo datos de cuenta para realizar transferencia");
    }

    protected void verificarSaldos() throws TransferenciaException {
        // Verificar saldos para permitir la transferencia
        System.out.println("Verificando saldos");
    }

    protected void actualizarSaldos() {
        // Actualizar el saldo de la cuenta origen
        // Actualizar el saldo de la cuenta destino
        System.out.println("Actualizando Saldos despues de transferencia");
    }
}
