package pe.edu.upeu.ExamenParcialLP.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.ExamenParcialLP.entity.Orden;

public interface OrdenDao {
	Orden create(Orden o);
	Orden update(Orden o);
	void delete(Long id);
	Optional<Orden> read(Long id);
	List<Orden> readAll();
}