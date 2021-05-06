package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SomaVendasDTO;
import com.devsuperior.dsvendas.dto.SucessoVendasDTO;
import com.devsuperior.dsvendas.dto.VendasDTO;
import com.devsuperior.dsvendas.service.VendasService;

@RestController
@RequestMapping(value = "/vendas")
public class SaleController {
	
	@Autowired
	private VendasService servico;
	
	@GetMapping
	public ResponseEntity<Page<VendasDTO>> findAll(Pageable pageable) {
		Page<VendasDTO> lista = servico.findAll(pageable);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value = "/soma-por-vendedor")
	public ResponseEntity<List<SomaVendasDTO>> qtdeAgrupadaVendedor() {
		List<SomaVendasDTO> lista = servico.qtdeAgrupadaVendedor();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value = "/sucesso-por-vendedor")
	public ResponseEntity<List<SucessoVendasDTO>> sucessoAgrupadoVendedor() {
		List<SucessoVendasDTO> lista = servico.sucessoAgrupadoVendedor();
		return ResponseEntity.ok(lista);
	}
}
