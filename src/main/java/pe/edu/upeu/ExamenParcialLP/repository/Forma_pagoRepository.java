package pe.edu.upeu.ExamenParcialLP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Forma_pagoRepository extends JpaRepository<pe.edu.upeu.ExamenParcialLP.entity.Forma_pago, Long>{

}
