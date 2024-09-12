package pe.edu.upeu.ExamenParcialLP.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ExamenParcialLP.dao.Forma_pagoDao;
import pe.edu.upeu.ExamenParcialLP.entity.Forma_pago;
import pe.edu.upeu.ExamenParcialLP.service.Forma_pagoService;

@Service
public class Forma_pagoServiceImpl implements Forma_pagoService{

	@Autowired
	private Forma_pagoDao forma_pagoDao;
	@Override
	public Forma_pago create(Forma_pago f) {
		// TODO Auto-generated method stub
		return forma_pagoDao.create(f);
	}

	@Override
	public Forma_pago update(Forma_pago f) {
		// TODO Auto-generated method stub
		return forma_pagoDao.update(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoDao.delete(id);
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoDao.read(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoDao.readAll();
	}

}
