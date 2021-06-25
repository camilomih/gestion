package com.aplicacionmovil.gestion;

import com.aplicacionmovil.gestion.consult.GeneralConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionApplication {


	public static void main(String[] args) {
		SpringApplication.run(GestionApplication.class, args);
	}

}
