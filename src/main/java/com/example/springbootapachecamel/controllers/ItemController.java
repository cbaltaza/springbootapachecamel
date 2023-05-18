/**
 * 
 */
package com.example.springbootapachecamel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapachecamel.model.Item;
import com.example.springbootapachecamel.service.ItemsServices;

/**
 * @author BalMen
 *
 */
//@RestController
public class ItemController {

	@Autowired
	private ItemsServices itemsServices;
	
	 //  @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }
	//   @GetMapping("/{id}")
	   public List<Item> buscarItem(@PathVariable("id") int itemId) {
	        return itemsServices.findAll(itemId);
	    }
}
