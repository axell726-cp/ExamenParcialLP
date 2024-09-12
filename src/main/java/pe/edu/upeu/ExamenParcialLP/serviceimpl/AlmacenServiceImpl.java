package pe.edu.upeu.ExamenParcialLP.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ExamenParcialLP.dao.AlmacenDao;
import pe.edu.upeu.ExamenParcialLP.entity.Almacen;
import pe.edu.upeu.ExamenParcialLP.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService{

	@Autowired
	private AlmacenDao almacenDao;
	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return almacenDao.create(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return almacenDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenDao.delete(id);
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return almacenDao.read(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenDao.readAll();
	}

}
