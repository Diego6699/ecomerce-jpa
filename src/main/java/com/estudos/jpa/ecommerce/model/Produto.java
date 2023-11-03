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
@Table(name = "produto")
public class Produto {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal preco;

}
