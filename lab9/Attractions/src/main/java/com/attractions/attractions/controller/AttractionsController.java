package com.tour.tour.controller;

import com.tour.tour.exception.ResourceNotFoundException;
import com.tour.tour.model.Tour;
import com.tour.tour.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AttractionController {

    @Autowired
    AttractionRepository attractionRepository;

    @GetMapping("/attractions")
    public List<Attractions> getAllAttractions() {
        return attractionsRepository.findAll();
    }

    @PostMapping("/attractions")
    public Attraction createAtracttion(@Valid @RequestBody Attraction attraction) {
        return attractionRepository.save(attraction);
    }

    @GetMapping("/attraction/{id}")
    public Atrraction getAttractionById(@PathVariable(value = "id") Long attractionId) {
        return tourRepository.findById(attractionId)
                .orElseThrow(() -> new ResourceNotFoundException("Attraction", "id", attractionId));
    }

    @PutMapping("/attractions/{id}")
    public Attraction updateAttraction(@PathVariable(value = "id") Long attractionId,
                           @Valid @RequestBody Attraction attractionsDetails) {

        Attraction attraction= attractionRepository.findById(attractionId)
                .orElseThrow(() -> new ResourceNotFoundException("Attraction", "id", attractionId));

        attraction.setName(attractionsDetails.getName());

        Atractions updatedAttraction = attractionRepository.save(attraction);
        return updatedAttraction;
    }

    @DeleteMapping("/attractions/{id}")
    public ResponseEntity<?> deleteAttraction(@PathVariable(value = "id") Long attractionId) {
        Attraction atttraction = attractionRepository.findById(attractionId)
                .orElseThrow(() -> new ResourceNotFoundException("Attraction", "id", attractionId));

        attractionRepository.delete(attraction);

        return ResponseEntity.ok().build();
    }
}