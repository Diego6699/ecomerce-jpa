package com.estudos.jpa.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "pedido")
public class Pedido {
	@Id
	private Integer id;

	private LocalDateTime dataPedido;

	private LocalDateTime dataConclusao;

	private Integer notaFiscalId;

	private BigDecimal total;

	private StatusPedido status;

}
