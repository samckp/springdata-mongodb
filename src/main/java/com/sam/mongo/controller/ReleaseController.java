package com.sam.mongo.controller;

import com.sam.mongo.model.Application;
import com.sam.mongo.repository.ApplicationRepository;
import com.sam.mongo.repository.ReleaseRepository;
import com.sam.mongo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jira")
public class ReleaseController {

    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private ReleaseRepository releaseRepository;
    @Autowired
    private TicketRepository ticketRepository;

    //..................Application ...........CRUD Operation
    @GetMapping("/apps")
    public List<Application> getApplications(){

        return applicationRepository.findAll();
    }

    @GetMapping("/app/{id}")
    public Optional<Application> getApplicationById(@PathVariable("id") String id){

        return applicationRepository.findById(id);
    }

    @PostMapping("/add")
    public Application addApplication(@RequestBody Application application){

        return applicationRepository.save(application);
    }

    @PutMapping("/app/{id}")
    public Application updateApplication(@RequestBody Application application, @PathVariable("id") String id) {

        application.setId(id);
        return applicationRepository.save(application);
    }

    @DeleteMapping("/app/{id}")
    public void deleteApp(@PathVariable("id") String id){

        applicationRepository.deleteById(id);
    }

}
