package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBusiness;
import fr.univbrest.dosi.business.FormationBusinessInter;

@RestController
@RequestMapping("/formation")
public class FormationController {
		    
		private  FormationBusiness business;
	    
		@Autowired
		public FormationController(FormationBusiness business) {
			this.business = business;
		}
		
		@RequestMapping(method=RequestMethod.GET)
		public Iterable<Formation> recupererToutesLesFormation(){
			return business.findAll();
		}


		@RequestMapping(value="/{diplome}", method=RequestMethod.GET)
		public List<Formation> findByDiplome(@PathVariable("diplome") String diplome) {
			
			return business.findByDiplome(diplome);
		}

//		@RequestMapping("/{findByDiplome}")
//		public List<Formation> findByDiplome(
//				@PathVariable("diplome") String diplome) {
//			List<Formation> form = business.findByDiplome(diplome);
//			return form;
//		}
//
//		@RequestMapping("/{save}")
//		public void save(@PathVariable("formation") Formation formation) {
//			Formation form = business.save(formation);
//		}
		
//		@RequestMapping("/{delete}")
//		public void delete(@PathVariable("formation") Long id){
//			Formation form =formationRepository.delete(id);
//			
//		}
	}

