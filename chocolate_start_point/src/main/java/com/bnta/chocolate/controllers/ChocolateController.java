package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/chocolates")
public class ChocolateController {
    ////// Add Service here§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
    //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

    @GetMapping

    public ResponseEntity<List<Chocolate>> getAllChocolates(
            @RequestParam (required = false,
            name = "cocoaPercentage") Integer cocoaPercentage,
            return new ResponseEntity<>(chocolateRepository)
}
    @GetMapping
    public ResponseEntity<Optional<Chocolate>> getChocolate(@PathVariable long id){
            @RequestParam Integer cocoaPercentage,
            @RequestParam
    )
}
