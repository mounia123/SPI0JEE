package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Formation;

public interface FormationInterface extends CrudRepository<Formation, Long> {

	public List<Formation> findByDiplome(String diplome);
	}
