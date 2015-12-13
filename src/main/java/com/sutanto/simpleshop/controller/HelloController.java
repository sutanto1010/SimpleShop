package com.sutanto.simpleshop.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import com.sutanto.simpleshop.model.*;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sutanto.*;
@Controller
public class HelloController {
	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
			
		Item item = new Item();
		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
		model.addAttribute("greeting", item.getId());
		return "hello";
	}
}
