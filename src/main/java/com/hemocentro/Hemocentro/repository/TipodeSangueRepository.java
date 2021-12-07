package com.hemocentro.Hemocentro.repository;

import com.hemocentro.Hemocentro.entity.TipodeSangueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipodeSangueRepository extends JpaRepository<TipodeSangueEntity, Integer> {
    List<TipodeSangueEntity> findByTipo(String tipo);
}
