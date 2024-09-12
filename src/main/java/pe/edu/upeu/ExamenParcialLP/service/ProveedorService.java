package pe.edu.upeu.ExamenParcialLP.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.ExamenParcialLP.entity.Proveedor;

public interface ProveedorService {
	Proveedor create(Proveedor p);
	Proveedor update(Proveedor p);
	void delete(Long id);
	Optional<Proveedor> read(Long id);
	List<Proveedor> readAll();
}
