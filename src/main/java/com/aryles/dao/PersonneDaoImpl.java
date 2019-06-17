package com.aryles.dao;

import java.util.ArrayList;
import java.util.List;

import com.aryles.beans.Personne;

public class PersonneDaoImpl implements PersonneDao {

	ArrayList <Personne> listePersonne = new ArrayList <Personne> ();

	@Override
	public void ajouterPersonne(Personne p) {
		p.setId(new Long(listePersonne.size() + 1));

		listePersonne.add(p);

	}

	@Override
	public void supprimerPersonne(Long id) {
		for(Personne p : listePersonne) {
			if (p.getId().equals(id)) {
				listePersonne.remove(p);
				break;
			}
		}
	}

	@Override
	public List<Personne> getAllPersonnes() {

		return listePersonne;
	}

	@Override
	public void updatePersonne(Personne p, String name, String prenom, String adresse, String email, String mobile) {
		p.setNom(name);
		p.setPrenom(prenom);
		p.setAdresse(adresse);
		p.setEmail(email);
		p.setMobile(mobile);

	}


	public void initialisation()
	{
		System.out.println("initialised Aryles");
		ajouterPersonne(new Personne ("TALBINE1","Aryles","montreuil","talbinearyles@gmail.com","0753004647"));
		ajouterPersonne(new Personne ("TALBINE2","Aryles","montreuil","talbinearyles@gmail.com","0753004648"));
		ajouterPersonne(new Personne ("TALBINE3","Aryles","montreuil","talbinearyles@gmail.com","0753004649"));
		ajouterPersonne(new Personne ("TALBINE4","Aryles","montreuil","talbinearyles@gmail.com","0753004650"));

	}
	public Personne getPersonneById(Long id) {
		Personne personne = null;
		for(Personne p: listePersonne){
			if(p.getId().equals(id)){
				personne = p;
				break;
			}
		}
		return personne;
	}


}
