package fr.univbrest.dosi.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.AppTestConfig;
import fr.univbrest.dosi.bean.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)
public class FormationRepositoryTest {

	@Autowired
	private FormationInterface FormationRepo;

	@Before
	public void init() {
		Formation Formation1 = new Formation("ki", new Date(), "diplome", "doubleDiplome", new Date(), "nomFormation");
		FormationRepo.save(Formation1);

		// Formation Formation2 = new Formation();
		// FormationRepo.save(Formation2);
	}

	
	@Test
	public void doitRecupererUnFormationParNom() {
		List<Formation> resultat = FormationRepo.findByDiplome("diplome");

		assertThat(resultat).hasSize(1);
		assertThat(resultat.get(0).getNomFormation()).isEqualTo("nomFormation");
	}

	
}
