package pe.edu.upeu.ExamenParcialLP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.ExamenParcialLP.entity.Tipo_orden;

@Repository
public interface Tipo_ordenRepository extends JpaRepository<Tipo_orden, Long>{

}