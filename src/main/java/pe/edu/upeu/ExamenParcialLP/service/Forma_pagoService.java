package pe.edu.upeu.ExamenParcialLP.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.ExamenParcialLP.entity.Forma_pago;

public interface Forma_pagoService {
	Forma_pago create(Forma_pago f);
	Forma_pago update(Forma_pago f);
	void delete(Long id);
	Optional<Forma_pago> read(Long id);
	List<Forma_pago> readAll();
}
