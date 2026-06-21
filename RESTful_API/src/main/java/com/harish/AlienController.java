package com.harish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/aliens")
public class AlienController {

    @Autowired
    AlienRepository repo;

    @GetMapping
    public List<Alien> getAliens() {
        List<Alien> aliens = (List<Alien>) repo.findAll();
        return aliens;
    }
}
