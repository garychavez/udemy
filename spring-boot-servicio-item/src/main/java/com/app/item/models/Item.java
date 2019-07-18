package com.app.item.models;

public class Item{
 private Producto producto;
 private Integer cantidad;
 
 // constructores
public Item() {}


public Item(Producto producto, int cantidad) {
	this.producto = producto;
	this.cantidad = cantidad;
}


//Getters and Setters
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
 
 
public Double getTotal() {
	return producto.getPrecio() *  cantidad.doubleValue();
}
}
