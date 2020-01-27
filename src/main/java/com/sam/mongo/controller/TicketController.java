package com.sam.mongo.controller;

import com.sam.mongo.model.Release;
import com.sam.mongo.model.Ticket;
import com.sam.mongo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jira")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    //..................Ticket ...........CRUD Operation
    @GetMapping("/tickets")
    public List<Ticket> getTickets(){

        return ticketRepository.findAll();
    }

    @GetMapping("/ticket/{id}")
    public Optional<Ticket> getTicketById(@PathVariable("id") String id){

        return ticketRepository.findById(id);
    }

    @PostMapping("/ticket")
    public Ticket addTicket(@RequestBody Ticket ticket){

        return ticketRepository.save(ticket);
    }

    @PutMapping("/ticket/{id}")
    public Ticket updateTicket(@RequestBody Ticket ticket, @PathVariable("id") String id) {

        ticket.setId(id);
        return ticketRepository.save(ticket);
    }

    @DeleteMapping("/ticket/{id}")
    public void deleteTicket(@PathVariable("id") String id){

        ticketRepository.deleteById(id);
    }

}
