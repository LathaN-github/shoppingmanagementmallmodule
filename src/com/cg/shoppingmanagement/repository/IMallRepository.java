package com.cg.shoppingmanagement.repository;

import com.cg.shoppingmanagement.entity.Mall;

public interface IMallRepository {
	
	public Mall addMall(Mall mall);
	public Mall updateMall(Mall mall);
	public Mall searchMall(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
