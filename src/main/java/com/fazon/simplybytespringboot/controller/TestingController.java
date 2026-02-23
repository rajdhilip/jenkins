package com.fazon.simplybytespringboot.controller;

import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health")
@AllArgsConstructor
public class TestingController {

    @GetMapping
    public String health() {
    return "Hello Everyone, It's me Rajdhilip.G I'm Quality Assurance - Software Engineerin from Sakha Tech";
    }

}
