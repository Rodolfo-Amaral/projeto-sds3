package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.VendedorDTO;
import com.devsuperior.dsvendas.entities.Vendedor;
import com.devsuperior.dsvendas.repositories.RepoVendedor;

@Service
public class VendedorService {
	@Autowired
	private RepoVendedor repositorio;
	
	public List<VendedorDTO> findAll(){
		List<Vendedor> resultado = repositorio.findAll();
		return resultado.stream().map(x -> new VendedorDTO(x)).collect(Collectors.toList());
	}

}
