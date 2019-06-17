package com.aryles.metier;

import java.util.List;

import com.aryles.beans.Personne;
import com.aryles.dao.PersonneDao;

public class metierPersonneImpl implements metierPersonneI {

	private PersonneDao dao;

	@Override
	public void ajouterPersonne(Personne p) {
		dao.ajouterPersonne(p);		
	}

	@Override
	public void supprimerPersonne(Long id) {
		dao.supprimerPersonne(id);		
	}

	public void setDao(PersonneDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Personne> getAllPersonnes() {

		return dao.getAllPersonnes();
	}

	public PersonneDao getDao() {
		return dao;
	}

	@Override
	public void updatePersonne(Personne p, String name, String prenom, String adresse, String email, String mobile) {
		dao.updatePersonne(p, name, prenom, adresse, email, mobile);		
	}
	public Personne getPersonneById(Long id) {
		return dao.getPersonneById(id);
		 
	}

}

