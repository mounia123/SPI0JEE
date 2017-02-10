package fr.univbrest.dosi.testBusiness;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.FormationInterface;

public class FormationBusinessStub implements FormationInterface {

	private List<Formation> donnee;
	
	public FormationBusinessStub() {
		this.donnee =new ArrayList<Formation>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Formation> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Formation> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return this.donnee;
	}

	@Override
	public Formation findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Formation> S save(S arg0) {
		this.donnee.add(arg0);
		return arg0;
	}

	@Override
	public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {

		return donnee.size();
		
	}

	@Override
	public void delete(Formation formation) {
		// TODO Auto-generated method stub
		
	}

	
}
