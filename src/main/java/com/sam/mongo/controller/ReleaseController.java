package com.sam.mongo.controller;

import com.sam.mongo.model.Application;
import com.sam.mongo.model.Release;
import com.sam.mongo.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jira")
public class ReleaseController {

    @Autowired
    private ReleaseRepository releaseRepository;

    //..................Release ...........CRUD Operation
    @GetMapping("/release")
    public List<Release> getReleases(){

        return releaseRepository.findAll();
    }

    @GetMapping("/release/{id}")
    public Optional<Release> getReleaseById(@PathVariable("id") String id){

        return releaseRepository.findById(id);
    }

    @PostMapping("/release")
    public Release addRelease(@RequestBody Release release){

        return releaseRepository.save(release);
    }

    @PutMapping("/release/{id}")
    public Release updateRelease(@RequestBody Release release, @PathVariable("id") String id) {

        release.setId(id);
        return releaseRepository.save(release);
    }

    @DeleteMapping("/release/{id}")
    public void deleteRelease(@PathVariable("id") String id){

        releaseRepository.deleteById(id);
    }
}
