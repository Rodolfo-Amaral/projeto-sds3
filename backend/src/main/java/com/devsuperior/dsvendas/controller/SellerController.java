package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.VendedorDTO;
import com.devsuperior.dsvendas.service.VendedorService;

@RestController
@RequestMapping(value = "/vendedor")
public class SellerController {
	
	@Autowired
	private VendedorService servico;
	
	@GetMapping
	public ResponseEntity<List<VendedorDTO>> findAll() {
		List<VendedorDTO> lista = servico.findAll();
		return ResponseEntity.ok(lista);
	}
}
