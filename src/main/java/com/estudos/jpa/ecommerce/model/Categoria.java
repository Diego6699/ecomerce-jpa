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
@Table
public class Categoria {

	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	
	private Integer categoriaPaiId;
}
