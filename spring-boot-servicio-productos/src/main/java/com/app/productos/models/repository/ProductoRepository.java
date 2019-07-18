package com.app.productos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.productos.models.entity.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
