package com.emarques10.cursomc.repositories;

import com.emarques10.cursomc.domain.Cidade;
import com.emarques10.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
