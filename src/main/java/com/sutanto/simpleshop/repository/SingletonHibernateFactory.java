package com.sutanto.simpleshop.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class SingletonHibernateFactory {
	private static SessionFactory _instance;
	
	private static void Init(){
		_instance = new Configuration()
				.configure()
				.buildSessionFactory();
	}
	
	private SingletonHibernateFactory(){
		
	}
	
	public static SessionFactory Instance() {
		if(_instance==null){
			Init();
		}
		
		return _instance;
	}
}
