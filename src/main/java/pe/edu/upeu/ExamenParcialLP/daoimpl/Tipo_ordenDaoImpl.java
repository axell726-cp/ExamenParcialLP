package pe.edu.upeu.ExamenParcialLP.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.ExamenParcialLP.dao.Tipo_ordenDao;
import pe.edu.upeu.ExamenParcialLP.entity.Tipo_orden;
import pe.edu.upeu.ExamenParcialLP.repository.Tipo_ordenRepository;

@Component
public class Tipo_ordenDaoImpl implements Tipo_ordenDao{

	@Autowired
	private Tipo_ordenRepository tipo_ordenRepository;
	@Override
	public Tipo_orden create(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(t);
	}

	@Override
	public Tipo_orden update(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_ordenRepository.deleteById(id);
	}

	@Override
	public Optional<Tipo_orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findById(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findAll();
	}

}
