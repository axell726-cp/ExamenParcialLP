package pe.edu.upeu.ExamenParcialLP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.ExamenParcialLP.entity.Almacen;


@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long>{

}
