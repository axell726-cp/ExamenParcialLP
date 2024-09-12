package pe.edu.upeu.ExamenParcialLP.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ExamenParcialLP.dao.OrdenDao;
import pe.edu.upeu.ExamenParcialLP.entity.Orden;
import pe.edu.upeu.ExamenParcialLP.service.OrdenService;


@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	private OrdenDao ordenDao;
	@Override
	public Orden create(Orden o) {
		// TODO Auto-generated method stub
		return ordenDao.create(o);
	}

	@Override
	public Orden update(Orden o) {
		// TODO Auto-generated method stub
		return ordenDao.update(o);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenDao.delete(id);
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return ordenDao.read(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return ordenDao.readAll();
	}

}
