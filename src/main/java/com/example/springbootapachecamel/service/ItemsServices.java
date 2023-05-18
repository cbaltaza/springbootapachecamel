package com.example.springbootapachecamel.service;

import java.util.List;

import com.example.springbootapachecamel.model.Item;

public interface ItemsServices {
	/**
	 * Service
	 * @param itemId 
	 * @return
	 */
	List<Item> findAll(int itemId);
}
