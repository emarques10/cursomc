package com.emarques10.cursomc.repositories;

import com.emarques10.cursomc.domain.Categoria;
import com.emarques10.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
