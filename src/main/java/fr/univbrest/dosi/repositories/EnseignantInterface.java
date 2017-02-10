package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Enseignant;

public interface EnseignantInterface extends CrudRepository<Enseignant,String>{
	
	  List<Enseignant> findByNom(String nom);
	

}
