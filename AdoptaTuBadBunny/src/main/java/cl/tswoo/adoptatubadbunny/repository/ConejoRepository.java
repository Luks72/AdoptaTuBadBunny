package cl.tswoo.adoptatubadbunny.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.tswoo.adoptatubadbunny.model.Conejo;

@Repository
public interface ConejoRepository extends JpaRepository<Conejo, Integer> {
	
	public Conejo getByName(String nombre, Pageable pageable);
	
	

}
