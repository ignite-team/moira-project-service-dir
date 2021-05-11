package es.ozona.moira.project.callejero.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ozona.moira.project.callejero.domain.model.entities.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> { 
	List<Pais> findAll();
}
