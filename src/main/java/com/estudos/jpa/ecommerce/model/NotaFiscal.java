package com.estudos.jpa.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private Integer pedidoId;
	
	private Integer produtoId;
	
	private BigDecimal precoproduto;
	
	private Integer quantidade;

}
