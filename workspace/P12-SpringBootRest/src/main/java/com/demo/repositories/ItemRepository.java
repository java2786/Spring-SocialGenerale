package com.demo.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.dto.Item;
import com.demo.exceptions.ItemNotFoundException;

@Repository
public class ItemRepository {

	private Map<Integer, Item> db = new HashMap<Integer, Item>();
	private static int counter = 1;
	public ItemRepository() {
		db.put(counter, new Item(counter++, "Mobile", 21000));
		db.put(counter, new Item(counter++, "Laptop", 51000));
		db.put(counter, new Item(counter++, "Bike", 81000));
	}
	
	public Item save(Item item) {
		item.setId(counter);
		db.put(counter++, item);
		return item;
	}
	
	public Item findItem(int id) throws ItemNotFoundException {
		Item item = db.get(id);
		if(item==null) {
			System.out.println("item not found");
			throw new ItemNotFoundException("Item with id "+id+" not found in db");
		}
		return item;
	}
	
	public Map<Integer, Item> findAll() {
		return db;
	}
	
	public boolean removeItem(int id) {
		return false;
	}
	
}
