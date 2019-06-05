package com.u2d.experiencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.u2d.experiencia.schedule.Agendador;

@SpringBootApplication
public class ExperienciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienciaApplication.class, args);
		
		Agendador schedule = new Agendador();
		schedule.scheduleFutureTask();
	}

}
