package com.app.item.serviceImplement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.item.models.Item;
import com.app.item.models.Producto;
import com.app.item.service.ItemService;

@Service
public class ItemServiceImplwement implements ItemService {
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findAll() {
		List<Producto> productos= Arrays.asList(clienteRest.getForObject("http://localhost:8001/swagger-ui.html#/producto-controller/findAllUsingGET", Producto[].class));
		return productos.stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
Map<String , String> pathVariable = new HashMap<String , String>();
pathVariable.put("id",id.toString() )	;
Producto producto= clienteRest.getForObject("http://localhost:8001/swagger-ui.html#/producto-controller/getUsingGET", Producto.class,pathVariable);

		return new Item(producto,cantidad);
	}

}
