package com.cg.shoppingmanagement.repository;

import javax.persistence.EntityManager;
import com.cg.shoppingmanagement.entity.Mall;

public class MallRepositoryImpl implements IMallRepository{

	//step1 : start JPA lifecylce
	private EntityManager entityManager;
	public MallRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	//create operation repository/DAO
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}
	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}
	@Override
	public Mall searchMall(int id) {
		Mall mall = entityManager.find(Mall.class, id);
		return mall;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
}
	
	
	


