package cl.tswoo.adoptatubadbunny.service;

import java.util.List;

import cl.tswoo.adoptatubadbunny.model.Conejo;

public interface ConejoService {
	
	List <Conejo> listAll();
	void save(Conejo conejo);
	void delete(int id);
	Conejo getById(int id);
	
	
	
	

}
