package com.example.solid;

import com.example.solid.liskovexample.Cuenta;
import com.example.solid.liskovexample.TransferenciaExterna;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication implements CommandLineRunner {

	public static void main(String[] args) {


		SpringApplication.run(SolidApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
		Cuenta cuentaOrigen  = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();


		TransferenciaExterna transferenciaExterna = new TransferenciaExterna(
				cuentaOrigen, cuentaDestino, 100,"prueba", 2,
				"GTQ", "15"

		);

		transferenciaExterna.realizarTransferencia();
	}
}
