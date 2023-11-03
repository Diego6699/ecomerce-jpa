package com.estudos.jpa.ecommerce.model;

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
@Table(name="pagamento_boleto")
public class PagamentoBoleto {

	@Id
	@EqualsAndHashCode.Include
	private Integer id;

	private Integer pedidoId;

	private StatusPagamento status;

	private String codigoBarras;

}
