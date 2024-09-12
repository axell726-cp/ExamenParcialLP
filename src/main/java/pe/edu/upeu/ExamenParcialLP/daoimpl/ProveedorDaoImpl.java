package pe.edu.upeu.ExamenParcialLP.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.ExamenParcialLP.dao.ProveedorDao;
import pe.edu.upeu.ExamenParcialLP.entity.Proveedor;
import pe.edu.upeu.ExamenParcialLP.repository.ProveedorRepository;

@Component
public class ProveedorDaoImpl implements ProveedorDao{

	@Autowired
	private ProveedorRepository proveedorRepository;
	@Override
	public Proveedor create(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(p);
	}

	@Override
	public Proveedor update(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorRepository.deleteById(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}

}
