package com.u2d.experiencia.schedule;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Agendador {

	private final long MINUT = 2000 * 60;

	@Scheduled(fixedDelay = MINUT)
	public void scheduleFutureTask() {
		LocalDateTime atual = LocalDateTime.now();
		System.out.println("schedule ok! "+atual);
	}

}
