package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
 
import javax.persistence.TypedQuery;



import utility.EntityManagerUtility;
import model.makale_gs;

public class makale_gsDAOimpl implements makale_gsDAO{
	
	private EntityManager entityManager;
	 
	
	public makale_gsDAOimpl() {
		  EntityManagerFactory entityManagerFactory = EntityManagerUtility.getEntityManagerFactory();
		  entityManager = entityManagerFactory.createEntityManager();
		  
	}

	
	
	
	@Override
	public makale_gs insert(makale_gs makale) {
		entityManager.getTransaction().begin();
		entityManager.persist(makale);
		entityManager.getTransaction().commit();
		return makale;
	}

	@Override
	public makale_gs find(int id) {
		return entityManager.find(makale_gs.class, id);
		 
	}

	@Override
	public List<makale_gs> findAllkonu() {
		TypedQuery<makale_gs> query = entityManager.createQuery("Select e from Makale_gs e", makale_gs.class);
		return query.getResultList();
	}

	@Override
	public void remove(int id) {
		makale_gs makale = find(id);
		if (makale != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(makale);
			entityManager.getTransaction().commit();
		
	}

	}
}
