package com.devsuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SomaVendasDTO;
import com.devsuperior.dsvendas.dto.SucessoVendasDTO;
import com.devsuperior.dsvendas.dto.VendasDTO;
import com.devsuperior.dsvendas.entities.Vendas;
import com.devsuperior.dsvendas.repositories.RepoVendas;
import com.devsuperior.dsvendas.repositories.RepoVendedor;

@Service
public class VendasService {
	@Autowired
	private RepoVendas repositorio;
	
	@Autowired
	private RepoVendedor repoVendedor;
	
	@Transactional(readOnly = true)
	public Page<VendasDTO> findAll(Pageable pageable){
		repoVendedor.findAll();
		Page<Vendas> resultado = repositorio.findAll(pageable);
		return resultado.map(x -> new VendasDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SomaVendasDTO> qtdeAgrupadaVendedor(){
		return repositorio.qtdeAgrupadaVendedor();
	}
	
	@Transactional(readOnly = true)
	public List<SucessoVendasDTO> sucessoAgrupadoVendedor(){
		return repositorio.sucessoAgrupadoVendedor();
	}
}
