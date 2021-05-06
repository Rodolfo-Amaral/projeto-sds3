package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Vendas;

public class VendasDTO {
	
	private Long id;
	private Integer visitas;
	private Integer negociado;
	private Double qtde;
	private LocalDate data;

	private VendedorDTO vendedor;
	
	public VendasDTO () {
	}

	public VendasDTO(Long id, Integer visitas, Integer negociado, Double qtde, LocalDate data, VendedorDTO vendedor) {
		this.id = id;
		this.visitas = visitas;
		this.negociado = negociado;
		this.qtde = qtde;
		this.data = data;
		this.vendedor = vendedor;
	}
	public VendasDTO(Vendas entity) {
		id = entity.getId();
		visitas = entity.getVisitas();
		negociado = entity.getNegociado();
		qtde = entity.getQtde();
		data = entity.getData();
		vendedor = new VendedorDTO(entity.getVendedor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisitas() {
		return visitas;
	}

	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}

	public Integer getNegociado() {
		return negociado;
	}

	public void setNegociado(Integer negociado) {
		this.negociado = negociado;
	}

	public Double getQtde() {
		return qtde;
	}

	public void setQtde(Double qtde) {
		this.qtde = qtde;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDTO vendedor) {
		this.vendedor = vendedor;
	}
}
