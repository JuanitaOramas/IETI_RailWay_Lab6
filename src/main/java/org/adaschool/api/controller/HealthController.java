package org.adaschool.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @RequestMapping("/health")
    public String checkAPI(){

        return "Maria Juanita Oramas Bermudez";

    }
}
