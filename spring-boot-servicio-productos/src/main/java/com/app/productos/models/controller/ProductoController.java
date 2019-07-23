package com.app.productos.models.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.productos.models.entity.Producto;
import com.app.productos.models.service.ProductoService;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
	@Autowired
private ProductoService productoService;

	@PostMapping("/Save")
	public Producto save(@RequestBody Producto producto) {
		return productoService.save(producto);
		
	}
	
	@PutMapping("/Update")
	public Producto update(@RequestBody Producto producto ) {
		return productoService.update(producto) ;
		
	}
	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		productoService.delete(id);
	}
	
	@GetMapping("/ver/{id}")
	public  Optional<Producto> get(@PathVariable("id") Long id) {
		return productoService.get(id);
	}
	
	@GetMapping("/listar")
	public List<Producto> findAll(){
		return productoService.findAll(null);
		
	}
}
