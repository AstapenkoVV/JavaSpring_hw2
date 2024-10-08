package ru.gb;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;


public class Ticket {
    private String ticket;
    private LocalDateTime createdAt;
    private int numberWindow;

    public Ticket(TicketNumberGenerator ticketNumberGenerator) {
        this.ticket = ticketNumberGenerator.createNewNumber();
        this.createdAt = createdAt.now();
        this.numberWindow = ThreadLocalRandom.current().nextInt(1, 10);;
    }

    @Override
    public String toString() {
        return "Ticket #" + ticket +
                ", Data:" + createdAt +
                ", Window №:" + numberWindow;
    }
}
