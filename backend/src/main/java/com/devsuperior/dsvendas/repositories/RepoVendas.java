package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.SomaVendasDTO;
import com.devsuperior.dsvendas.dto.SucessoVendasDTO;
import com.devsuperior.dsvendas.entities.Vendas;

public interface RepoVendas extends JpaRepository<Vendas, Long>{
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SomaVendasDTO(obj.vendedor, SUM(obj.qtde)) "
			+ " FROM Vendas AS obj GROUP BY obj.vendedor")
	List<SomaVendasDTO> qtdeAgrupadaVendedor();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SucessoVendasDTO(obj.vendedor, SUM(obj.visitas), SUM(obj.negociado)) "
			+ " FROM Vendas AS obj GROUP BY obj.vendedor")
	List<SucessoVendasDTO> sucessoAgrupadoVendedor();

}
