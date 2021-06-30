package br.com.alura.springdata.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.alura.springdata.modelo.Cargo;

public class JpaExemplo {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public JpaExemplo() {
		emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}
	
	
	
	public void save(Cargo cargo) {
		em.getTransaction().begin();
		em.persist(cargo);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Cargo> findByAll() {
		    Query query = em.createQuery("SELECT e FROM Professor e");
		    return (List<Cargo>) query.getResultList();
	}
	
	public Cargo findById(Long id) {
		em.getTransaction().begin();
		Cargo cargo =em.find(Cargo.class, id);
		em.getTransaction().commit();
		em.close();
		return cargo;
	}
	
	public void deleteById(Long id) {
		Cargo cargo =em.find(Cargo.class, id);
		em.getTransaction().begin();
		em.remove(cargo);
		em.getTransaction().commit();
		em.close();
	}
}
