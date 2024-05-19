package com.example.solid.exceptions;

public class TransferenciaException extends  Exception
{
    private String mensaje;

    public TransferenciaException(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
