package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Candidat;



public interface CandidatInterface extends CrudRepository<Candidat,Long> {

	
	

	List<Candidat> findByNom(String nom);

    List<Candidat> findByUniversiteOrigine(String universiteOrigine );	
	
}
