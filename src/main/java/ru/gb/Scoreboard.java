package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Scoreboard {
    @Autowired
    public TicketNumberGenerator ticketNumberGenerator;

    public Ticket ticket;

    public Ticket newTicket() {
        ticket = new Ticket(ticketNumberGenerator);
        return ticket;
    }

}
