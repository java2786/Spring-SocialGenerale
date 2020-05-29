package com.demo.controllers;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.dto.ExceptionMessage;
import com.demo.dto.Item;
import com.demo.exceptions.ItemNotFoundException;
import com.demo.services.ItemService;

//@Controller
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ItemController {
	
	@Autowired
    private RestTemplate restTemplate;

	
	@Autowired
	private ItemService itemService;

	@GetMapping("item-name")
//	@ResponseBody
	public String getItemName() {
		return "mobile";
	}
	
	@GetMapping("my-item/{id}")
//	@ResponseBody
	public String findItemName(@PathVariable int id) {
		// find data in db with id
		System.out.println("Id: "+id);
		return "Laptop";
	}

	@GetMapping("my-item")
	public Item getItem() {
		Item item = new Item();
		item.setId(123);
		item.setName("Smart TV");
		item.setPrice(29999.00);
		
		return item;
	}
	
	
	
	@GetMapping(value="/items/{id}")
	public Item getItemById(@PathVariable int id) throws ItemNotFoundException {
		System.out.println("Finding item with id: "+id);
		return itemService.findItem(id);
	}
	
	@GetMapping(value="/items")
	public Map<Integer, Item> getItems() {
		return itemService.findAll();
	}
	
	@PostMapping(value="/items", consumes= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
		}, produces= {
				MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE
			})
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<ExceptionMessage> handleEx(Exception ex) {
		ExceptionMessage em = new ExceptionMessage();
		em.setMessage(ex.getMessage());
		em.setStatus(404);
		return new ResponseEntity<ExceptionMessage>(em, HttpStatus.NOT_FOUND);
	}
	
	
	
	@GetMapping("/consume-rest")
	public Item resourceItem() {
		System.out.println("Sending request");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity<String>("some data", headers);
		
		 Item item = restTemplate.postForObject("http://localhost:8080/api/items/" + 1, HttpRequest.class, Item.class, entity);
			System.out.println("Data received");
		 System.out.println(item);
		 
		 return item;
	}
	
}
