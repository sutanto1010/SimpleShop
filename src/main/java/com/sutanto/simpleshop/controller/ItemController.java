package com.sutanto.simpleshop.controller;

import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sutanto.simpleshop.model.Item;
import com.sutanto.simpleshop.service.ItemService;

import antlr.collections.List;

@Controller
public class ItemController extends RESTController {
	
	@Autowired
	private ItemService _iItemService;	
	
	@RequestMapping(value="/items", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Item> Index(@RequestParam(value ="Id", required=false, defaultValue="-1") int Id) {
		ArrayList<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setName(Integer.toString(Id));
		items.add(item);
		return items;
	}
	
}
