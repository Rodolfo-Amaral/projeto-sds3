package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vendas")
public class Vendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visitas;
	private Integer negociado;
	private Double qtde;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "id_vendedor")
	private Vendedor vendedor;

	public Vendas() {	
	}

	public Vendas(Long id, Integer visitas, Integer negocioFechado, Double qtde, LocalDate data, Vendedor vendedor) {
		this.id = id;
		this.visitas = visitas;
		this.negociado = negocioFechado;
		this.qtde = qtde;
		this.data = data;
		this.vendedor = vendedor;
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

	public Integer getNegocioFechado() {
		return negociado;
	}

	public void setNegocioFechado(Integer negocioFechado) {
		this.negociado = negocioFechado;
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}
