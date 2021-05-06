package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class SucessoVendasDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nomeVendedor;
	private Long visitas;
	private Long negociado;
	
	public SucessoVendasDTO() {
	}

	public SucessoVendasDTO(Vendedor vendedor, Long visitas, Long negociado) {
		nomeVendedor = vendedor.getNome();
		this.visitas = visitas;
		this.negociado = negociado;
	}
	
	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public Long getVisitados() {
		return visitas;
	}
	public void setVisitados(Long visitados) {
		this.visitas = visitados;
	}
	public Long getNegociados() {
		return negociado;
	}
	public void setNegociados(Long negociados) {
		this.negociado = negociados;
	}

}
