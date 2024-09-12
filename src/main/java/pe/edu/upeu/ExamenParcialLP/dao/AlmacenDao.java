package pe.edu.upeu.ExamenParcialLP.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.ExamenParcialLP.entity.Almacen;

public interface AlmacenDao {
	Almacen create(Almacen a);
	Almacen update(Almacen a);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}