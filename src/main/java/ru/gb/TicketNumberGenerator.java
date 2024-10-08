package ru.gb;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {
    String ticketNumber;

    public String createNewNumber(){
        ticketNumber = UUID.randomUUID().toString();
        return ticketNumber;
    }
}
