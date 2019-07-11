package com.springboot.msl.sbdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.msl.sbdemo.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionController {
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception){
		return new ResponseEntity<Object>("now process in Advice.product will not found!", HttpStatus.NOT_FOUND);
	}
}
