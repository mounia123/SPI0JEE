package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;

public interface FormationBusinessInter {

	public abstract List<Formation> findByDiplome(String diplome);

	public abstract long count();

	public abstract void delete(Formation formation);

	public abstract void save(Formation formation);
	

}