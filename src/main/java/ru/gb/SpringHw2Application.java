package ru.gb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHw2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringHw2Application.class, args);

		TicketNumberGenerator generatorTicket = context.getBean(TicketNumberGenerator.class);
		System.out.println("Ticket #" + generatorTicket.createNewNumber());
		System.out.println("Ticket #" + generatorTicket.createNewNumber());
		System.out.println("Ticket #" + generatorTicket.createNewNumber());

		Scoreboard scoreboard = context.getBean(Scoreboard.class);
		System.out.println(scoreboard.newTicket());
		System.out.println(scoreboard.newTicket());
		System.out.println(scoreboard.newTicket());
		System.out.println(scoreboard.newTicket());
		System.out.println(scoreboard.newTicket());
	}

}
