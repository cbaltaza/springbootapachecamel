package com.example.springbootapachecamel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	/**
	 * cantidad
	 */
	private Integer cantidad;
	/**
	 * monto
	 */
	private Float monto;

}
