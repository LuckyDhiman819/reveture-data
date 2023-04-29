package com.reature.ems.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.reature.ems.dao.StockImp;

@Aspect
@Component
public class StockAspect {
	
	@Before("execution(* com.reature.ems.dao.Stock+.addStock(..))")
	public void beforeAddStock() {
		
		System.out.println(" ## Inventory recieved the product");
		
	}
	@After("execution(* com.reature.ems.dao.Stock+.removeStock(..))")
	public void afterRemoveStock() {
	
		System.out.println("## Inventory successfully removed unsed/expired products");
	}
	@Before("this(com.reature.ems.dao.Stock)")
	public void removeAgain() {
		
		System.out.println("######################## Inventory successfully removed unsed/expired products");
	}
	
	@After("target(com.reature.ems.dao.StockImp)")
	public void AddStock() {
		
		System.out.println("########################  successfully removed unsed/expired products");
	}
	

}
