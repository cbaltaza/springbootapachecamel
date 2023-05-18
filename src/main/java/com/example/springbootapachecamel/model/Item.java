package com.example.springbootapachecamel.model;

public class Item {
	/**
	 * cantidad
	 */
	private Integer cantidad;
	/**
	 * monto
	 */
	private Float monto;
	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the monto
	 */
	public Float getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Float monto) {
		this.monto = monto;
	}

}
