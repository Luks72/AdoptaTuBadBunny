package cl.tswoo.adoptatubadbunny.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tswoo.adoptatubadbunny.model.Conejo;
import cl.tswoo.adoptatubadbunny.repository.ConejoRepository;

@Service
public class ConejoServiceImplementation implements ConejoService {
	
	@Autowired
	private ConejoRepository repository;

	@Override
	public List<Conejo> listAll() {
		return repository.findAll();
	}

	@Override
	public void save(Conejo conejo) {
		repository.save(conejo);

	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);

	}

	@Override
	public Conejo getById(int id) {
		return repository.getOne(id);
	}
	
	public Conejo getByName(String nombre) {
		return repository.getByName(nombre, null);
	}

}
