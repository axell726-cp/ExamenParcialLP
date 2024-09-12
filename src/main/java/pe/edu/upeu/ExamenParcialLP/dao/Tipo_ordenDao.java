package pe.edu.upeu.ExamenParcialLP.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.ExamenParcialLP.entity.Tipo_orden;

public interface Tipo_ordenDao {
	Tipo_orden create(Tipo_orden t);
	Tipo_orden update(Tipo_orden t);
	void delete(Long id);
	Optional<Tipo_orden> read(Long id);
	List<Tipo_orden> readAll();
}