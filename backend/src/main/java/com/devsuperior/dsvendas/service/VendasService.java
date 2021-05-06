package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.VendasDTO;
import com.devsuperior.dsvendas.entities.Vendas;
import com.devsuperior.dsvendas.repositories.RepoVendas;
import com.devsuperior.dsvendas.repositories.RepoVendedor;

@Service
public class VendasService {
	@Autowired
	private RepoVendas repositorio;
	
	private RepoVendedor repovendedor;
	
	@Transactional(readOnly = true)
	public Page<VendasDTO> findAll(Pageable pageable){
		repovendedor.findAll();
		Page<Vendas> resultado = repositorio.findAll(pageable);
		return resultado.map(x -> new VendasDTO(x));
	}

}
