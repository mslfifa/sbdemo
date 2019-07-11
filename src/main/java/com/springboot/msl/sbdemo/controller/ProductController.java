package com.springboot.msl.sbdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.msl.sbdemo.exception.ProductNotFoundException;
import com.springboot.msl.sbdemo.model.Product;

@RestController
public class ProductController {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	private static Map<String, Product> productRepo = new HashMap<>();
	static {
		Product plant = new Product(1256l,"plant","air-fast01");
		
		Product car = new Product(2432l,"car","mentre-2019");

		productRepo.put(""+plant.getPid(), plant);
		productRepo.put(""+car.getPid(), car);
	}
	
	@RequestMapping(value="/createProducts")
	public ResponseEntity<Object> createProduct(/* @RequestBody Product product */){
		ResponseEntity<Object> entity = new ResponseEntity<Object>(new Product(12568l,"car","t101"),HttpStatus.OK);
		return entity ;
	}
	
	@RequestMapping(value="/updateProduct/{id}",method=RequestMethod.GET)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") Long id){
		throw new ProductNotFoundException();
	}
	
	@RequestMapping("/hello")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/uploadProduct")
	public String uploadProduct() {
		return "uploadProduct";
	}
	
	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	}
	@RequestMapping(value = "/product/upload",method=RequestMethod.POST,consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String upload(@RequestParam("file") MultipartFile file,@RequestParam("productName") String productName) {
		log.debug("request parameter productName:{} | fileName:{} | fileSize:{}",productName,file.getOriginalFilename(),file.getSize());
		return "ok";
	}

}
