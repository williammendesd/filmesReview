package com.github.williammendesd.FilmesReview.controller;

import com.github.williammendesd.FilmesReview.dto.GeneroDTO;
import com.github.williammendesd.FilmesReview.service.GeneroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroService service;

    @GetMapping
    public ResponseEntity<List<GeneroDTO>> findAll(){
        List<GeneroDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<GeneroDTO> insert(@RequestBody @Valid GeneroDTO dto){

    }

}
