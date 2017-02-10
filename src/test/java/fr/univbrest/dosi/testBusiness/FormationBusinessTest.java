package fr.univbrest.dosi.testBusiness;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBusiness;
import fr.univbrest.dosi.business.FormationBusinessInter;

public class FormationBusinessTest {

	private FormationBusinessInter business;
	private FormationBusinessStub data;

	@Before
	public void init() {
		data = new FormationBusinessStub();
		business = new FormationBusiness(data);

	}

	@Test
	public void count() {
		long resultat = business.count();

		assertThat(resultat).isEqualTo(0L);
	}

//	 @Test
//	 public void recupererFormationParDiplome() {
//	 List<Formation> resultat = business.findByDiplome(diplome);
//	
//	 assertThat(resultat).hasSize(1);
//	 assertThat(resultat.get(0).getPrenom()).isEqualTo("JF");
//	 }
	//
	// @Test
	// public void doitRécupérerUnCandidatParUniversiteOrigine() {
	// List<Candidat> resultat = candidatRepo.findByUniversiteOrigine("Univ 1");
	//
	// assertThat(resultat).hasSize(1);
	// assertThat(resultat.get(0).getNoCandidat()).isEqualTo("453");
	// }

}
