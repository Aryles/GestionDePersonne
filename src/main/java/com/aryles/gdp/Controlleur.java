package com.aryles.gdp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aryles.beans.Personne;
import com.aryles.metier.metierPersonneI;

@Controller
public class Controlleur {

	@Autowired
	metierPersonneI services;

	//index

	@RequestMapping(value = "/index")
	public String index(Model model)
	{
		model.addAttribute("listeDesPersonne", services.getAllPersonnes());

		return "Pages";
	} 
	@RequestMapping(value = "/")
	public String home(Model model)
	{
		//model.addAttribute("listeDesPersonne", services.getAllPersonnes());

		return "home";
	} 
	@RequestMapping(value="/ajouter")
	public String add(Model model,Personne p){

		//Produit p = new Produit(nom, description, prix);
		services.ajouterPersonne(p);
		model.addAttribute("listeDesPersonne", services.getAllPersonnes());

		return "Pages";
	}
	@RequestMapping(value="/delete")
	public String dell(Model model,@RequestParam Long id){

		//Produit p = new Produit(nom, description, prix);
		services.supprimerPersonne(id);
		model.addAttribute("listeDesPersonne", services.getAllPersonnes());

		return "Pages";
	}

	@RequestMapping(value="/update") public String update(Model model,@RequestParam Long id,@RequestParam String nom,@RequestParam String prenom,@RequestParam String adresse,@RequestParam String email,@RequestParam String mobile 
		){
		Personne p= services.getPersonneById(id);
		try {
			services.updatePersonne(p,nom, prenom , adresse, email,mobile );

		} catch (IllegalStateException e) {
			model.addAttribute("listeDesPersonne", services.getAllPersonnes());

		}
		
		return "Pages"; }

	
	@RequestMapping(value="/Forms") public String redi(Model model,@RequestParam Long id){
		 Personne p = services.getPersonneById(id);
	
		//services.updatePersonne(p,lNom, lPrenom, lAdresse , lEmail, lMobil);
		//model.addAttribute("listeDesPersonne", services.getAllPersonnes());

			model.addAttribute("idLast", id);

		return "Forms"; }
	
	

	@RequestMapping(value="/search")
	public String search(Model model,@RequestParam(value ="id") Long id){

		List<Personne> liste = new ArrayList<Personne>();
		liste.add(services.getPersonneById(id));
		model.addAttribute("listeDesPersonne", liste);
		model.addAttribute("id", id);

		return "Pages";
	}


}
