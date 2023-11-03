package com.estudos.jpa.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "item_pedido")
public class ItemPedido {
	
	private Integer id;
	
	private Integer pedidoId;
	
	private Integer produtoId;
	
	private BigDecimal precoProduto;
	
	private Integer quantidade;

}
