package fr.univbrest.dosi.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.AppTestConfig;
import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.bean.Enseignant;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)

public class EnseignantRepositoryTest {


	@Autowired
	private EnseignantInterface enseignantrep;
	 
	@Before
	    public void init(){
		 
		 Enseignant Enseignant1 = new Enseignant(1L, "ko", "mp", "ik", "lomp", "lp", "mk", "pg", "pl", "of", "gd", "pw", "ms");
		 enseignantrep.save(Enseignant1);

//	        Enseignant Enseignant2 = new Enseignant();
//	        enseignantrep.save(Enseignant2);
		 
	 }
	  @Test
	    public void doitrecupererEnseignantParNom() {
	        List<Enseignant> resultat = enseignantrep.findByNom("mk");

	        assertThat(resultat).hasSize(1);
	        assertThat(resultat.get(0).getPrenom()).isEqualTo("pl");
	    }
	
	
	
}
