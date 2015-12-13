package com.sutanto.simpleshop.repository;

import org.hibernate.SessionFactory;
import com.sutanto.simpleshop.model.*;

public class BaseRepository {
	public SessionFactory sessionFactory = SingletonHibernateFactory.Instance();
}
