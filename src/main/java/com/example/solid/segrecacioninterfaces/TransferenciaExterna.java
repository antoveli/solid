package com.example.solid.segrecacioninterfaces;

public class TransferenciaExterna implements OperacionBancaria {

    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    private double monto;
    private String bancoDestino;

    public TransferenciaExterna(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto, String bancoDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.bancoDestino = bancoDestino;
    }

    @Override
    public void realizarOperacion(double monto) throws OperacionBancariaException {
        Retiro retiro = new Retiro(cuentaOrigen);

        System.out.println("Iniciando el proceso de tranferencia a otro banco");
    }
}
