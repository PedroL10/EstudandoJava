package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		/*
		Pessoa p1 = new Pessoa(null, "Pedro Luis", "pedro@gmail.com");
		Pessoa p2 = new Pessoa(null, "Loretinha Andrade", "loreta@gmail.com");
		Pessoa p3 = new Pessoa(null, "Jose Antonio", "jose@gmail.com");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*get
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		*/
		
		em.getTransaction().begin();	
		Pessoa p = em.find(Pessoa.class, 6);		
		em.remove(p);
		em.getTransaction().commit();
		
		/*
		em.getTransaction().begin();		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		System.out.println("Pronto");
		
	
	}

}
