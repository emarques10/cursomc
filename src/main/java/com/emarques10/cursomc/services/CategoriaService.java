package com.emarques10.cursomc.services;

import com.emarques10.cursomc.domain.Categoria;
import com.emarques10.cursomc.repositories.CategoriaRepository;
import com.emarques10.cursomc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não Encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
