package com.app.productos.models.service;

import java.util.List;
import java.util.Optional;

import com.app.productos.models.entity.Producto;

public interface ProductoService {

	Producto save(Producto model);
	Producto update(Producto model );
	void delete(Long id);
	Optional<Producto> get(Long id);
	List<Producto> findAll(Producto model);
  
}
