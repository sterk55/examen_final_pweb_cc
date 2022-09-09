package com.example.repositorios.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compra_pasaje")
public class CompraPasaje implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "copa_id")
	private Integer id;
	
	@Column(name = "copa_numero")
	private Integer numero;
	
	@Column(name = "copa_fecha_compra")
	private LocalDateTime fechaCompra;
	
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer asientosComprados;
	
	@Column(name = "copa_numero_tarjeta")
	private Integer numeroTarjeta;
	
	@Column(name = "copa_estado")
	private String estado;
}
