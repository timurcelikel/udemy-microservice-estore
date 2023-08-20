package com.udemy.microservices.estore.ProductsService.rest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

	//@Autowired -- IntelliJ warning says use Constructor Injection instead
	//private Environment env;

	private final Environment env;

	public ProductsController(final Environment env) {

		this.env = env;
	}

	@PostMapping
	public String createProduct() {

		return "HTTP POST Handled";
	}

	@GetMapping
	public String getProduct() {

		return "HTTP GET Handled " + env.getProperty("local.server.port");
	}

	@PutMapping
	public String updateProduct() {

		return "HTTP PUT Handled";
	}

	@DeleteMapping
	public String deleteProduct() {

		return "HTTP DELETE Handled";
	}
}
