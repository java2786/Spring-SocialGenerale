package com.demo.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.Item;
import com.demo.exceptions.ItemNotFoundException;
import com.demo.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;

	public Item findItem(int id) throws ItemNotFoundException {
		return itemRepository.findItem(id);
	}

	public Map<Integer, Item> findAll() {
		return itemRepository.findAll();
	}

	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}

}
