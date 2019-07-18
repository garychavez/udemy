package com.app.productos.models.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.productos.models.entity.Producto;
import com.app.productos.models.repository.ProductoRepository;
import com.app.productos.models.service.ProductoService;


@Service
public class ProductoServiceImplement implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	@Transactional
	public Producto save(Producto model) {
		return productoRepository.save(model);
	}

	@Override
	@Transactional
	public Producto update(Producto model) {
		return productoRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		 productoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll(Producto model) {
		return (List<Producto>) productoRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> get(Long id) {
		return productoRepository.findById(id);
		
	}

}
