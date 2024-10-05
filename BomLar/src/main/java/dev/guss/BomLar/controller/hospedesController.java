package dev.guss.BomLar.controller;

import dev.guss.BomLar.model.hospedes;
import dev.guss.BomLar.sevice.hospedesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;;

@RestController
@RequestMapping("/api/hospedes")

public class hospedesController {

    @Autowired
    private hospedesService service;

    @PostMapping("/add")
    public ResponseEntity<hospedes> addHospede(@RequestBody hospedes hospede){
        hospedes newHospede = service.createHospede(hospede);
        return new ResponseEntity<>(newHospede, HttpStatus.CREATED);
    }
}
