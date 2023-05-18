/**
 * 
 */
package com.example.springbootapachecamel.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.springbootapachecamel.model.Item;
import com.example.springbootapachecamel.service.ItemsServices;

/**
 * @author BalMen
 *
 */
@Service
public class ItemsServicesImpl implements ItemsServices {
	@Override
	public List<Item> findAll(int itemId) {
		
		Random random = new Random();
        float randomFloat = random.nextFloat();
        
		Item ls = new Item();
		ls.setCantidad( itemId );
		ls.setMonto(randomFloat );
		List<Item> lsItem = new ArrayList<Item>();
		lsItem.add(ls);
		return lsItem ;
	}

}
