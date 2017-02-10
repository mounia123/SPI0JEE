package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.FormationInterface;

@Component
public class FormationBusiness implements FormationBusinessInter {

	// on cree un lien avec la couche DAO et on interagie avec ,by the methods
	// dans l'interface
	

	private FormationInterface depotFormation;
	
	@Autowired
	public FormationBusiness(FormationInterface depot ) {
		this.depotFormation =depot;
	}
	/* (non-Javadoc)
	 * @see fr.unibrest.dosi.business.FormationBusinessInter#findByDiplome(java.lang.String)
	 */
	
	public List<Formation> findByDiplome(String diplome) {
		return this.depotFormation.findByDiplome(diplome);
	}

	/* (non-Javadoc)
	 * @see fr.unibrest.dosi.business.FormationBusinessInter#count()
	 */
	@Override
	public long count() {
		return this.depotFormation.count();
	}

	/* (non-Javadoc)
	 * @see fr.unibrest.dosi.business.FormationBusinessInter#delete(fr.univbrest.dosi.bean.Formation)
	 */
	@Override
	public void delete(Formation formation) {
		this.depotFormation.delete(formation);
	}

	/* (non-Javadoc)
	 * @see fr.unibrest.dosi.business.FormationBusinessInter#save(fr.univbrest.dosi.bean.Formation)
	 */
	@Override
	public void save(Formation formation) {
		this.depotFormation.save(formation);
	}

	public Iterable<Formation> findAll(){
		return this.depotFormation.findAll();
		
	}
}
