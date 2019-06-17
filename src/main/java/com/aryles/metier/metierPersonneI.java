package com.aryles.metier;

import java.util.List;

import com.aryles.beans.Personne;

public interface metierPersonneI {
	public void ajouterPersonne(Personne p);
	public void supprimerPersonne(Long id);
	public List<Personne> getAllPersonnes();
	public void updatePersonne(Personne p, String name, String prenom, String adresse, String email, String mobile);
	public Personne getPersonneById(Long id);
	
}
