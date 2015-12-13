package com.sutanto.simpleshop.service;

import com.sutanto.simpleshop.model.*;
import com.sutanto.simpleshop.repository.*;
import java.util.*;

public interface ItemService {
	void Add(Item item);
	void Delete(Item item);
	Item Get(int itemId);
	Set<Item> Search(String keyword);
}
