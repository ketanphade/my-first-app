package com.sins.ash.controller;

import com.sins.ash.models.Speaker;
import com.sins.ash.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {

    @Autowired
    SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> speakers(){
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping({"id"})
    public Speaker get(@PathVariable Long id){
        return speakerRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Speaker create(@RequestBody final Speaker speaker){
        return speakerRepository.saveAndFlush(speaker);
    }






}
