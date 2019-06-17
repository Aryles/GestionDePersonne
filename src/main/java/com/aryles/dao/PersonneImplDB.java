package com.aryles.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.aryles.beans.Personne;
import com.aryles.util.HibernateUtil;

public class PersonneImplDB implements PersonneDao  {

	@Override
	public void ajouterPersonne(Personne p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerPersonne(Long id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p = session.load(Personne.class, id);
		session.delete(p);
		session.getTransaction().commit();

	}

	@Override
	public List<Personne> getAllPersonnes() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		List list= session.createQuery("from Personne").list();
		return list;
	}

	@Override
	public void updatePersonne(Personne p, String name, String prenom, String adresse, String email, String mobile) {
		Session session =  HibernateUtil.getSessionFactory().openSession();
		Long IdP = p.getId();
		session.beginTransaction();

				Personne p1 = session.load(Personne.class, IdP);
				p1.setNom(name);
				p1.setPrenom(prenom);
				p1.setAdresse(adresse);
				p1.setEmail(email);
				p1.setMobile(mobile);
				session.update(p1);
		
		session.update(p1);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Personne getPersonneById(Long id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p = session.load(Personne.class, id);
		return p;
	}

}
