package com.github.williammendesd.FilmesReview.service;

import com.github.williammendesd.FilmesReview.dto.GeneroDTO;
import com.github.williammendesd.FilmesReview.model.Genero;
import com.github.williammendesd.FilmesReview.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    @Transactional
    public List<GeneroDTO> findAll(){
        List<Genero> generos = repository.findAll();
        return generos.stream().map(GeneroDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public GeneroDTO insert(GeneroDTO dto){
        Genero entity = new Genero();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new GeneroDTO(entity);
    }

    private void copyDtoToEntity(GeneroDTO dto, Genero entity) {
        entity.setNome(dto.getNome());
    }

}
