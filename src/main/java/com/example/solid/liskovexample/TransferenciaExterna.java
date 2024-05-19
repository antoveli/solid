package com.example.solid.liskovexample;

import com.example.solid.exceptions.TransferenciaException;

public class TransferenciaExterna extends Transferencia {

    private int tipoCuentaDestino;
    private String monedaCuentaDestino;
    private String bancoDestino;


    public TransferenciaExterna(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto, String descripcion, int tipoCuentaDestino, String monedaCuentaDestino, String bancoDestino) {
        super(cuentaOrigen, cuentaDestino, monto, descripcion);
        this.tipoCuentaDestino = tipoCuentaDestino;
        this.monedaCuentaDestino = monedaCuentaDestino;
        this.bancoDestino = bancoDestino;
    }

    @Override
    public void realizarTransferencia() throws TransferenciaException {
        System.out.println("Iniciando transferencia a otro banco");
        validarDatosExternos();
        validarDatos();
        verificarSaldos();
        actualizarSaldos();
        System.out.println("Finalizando transferencaia a otro banco");
    }

    private void validarDatosExternos() throws TransferenciaException {
        // Validacion de cuentas
        System.out.println("Validando Datos de cuenta otro banco para transferencia a otro banco");

    }
}
