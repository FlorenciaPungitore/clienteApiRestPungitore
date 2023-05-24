package com.coderhouse.ClienteApiRestPungitore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* CONSIGNA:

        Crear una tabla cliente con los siguientes atributos:
        -nombre
        -apellido
        -fecha de nacimiento
		------- ok --------

        Además, crear un restcontroller que retorne un JSON con la siguiente estructura:

        {
        	nombre: XXXXXX;
        	apellido: YYYYYY;
        	años: #####
        }

        En la capa servicio se deberá calcular la edad de la persona consultada y retornar el JSON.
                */

@SpringBootApplication
public class ClienteApiRestPungitoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClienteApiRestPungitoreApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		System.out.println("Server listening on. http://localhost:8888/h2-console");
	}
}
