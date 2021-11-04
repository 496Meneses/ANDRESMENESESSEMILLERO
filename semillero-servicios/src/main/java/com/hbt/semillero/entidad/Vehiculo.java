package com.hbt.semillero.entidad;

import java.math.BigDecimal;

import com.hbt.semillero.enums.TipoVehiculoEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina la representacion
 * de las caracteristicas en comun de un vehiculo
 * <b>Caso de Uso:<b> Semillero 2021
 * @author Andres Camilo Meneses Ortega
 * @version 1.0
 */
public class Vehiculo {

	private String color;
	private TipoVehiculoEnum tipo;
	private int numeroLlantas;
	private boolean requiereLicencia;
	private BigDecimal precio;
	
	
	
	


	public TipoVehiculoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculoEnum tipo) {
		this.tipo = tipo;
	}
	public int getNumeroLlantas() {
		return numeroLlantas;
	}
	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}
	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}
	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Camilo
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Camilo
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", tipo=" + tipo + ", numeroLlantas=" + numeroLlantas
				+ ", requiereLicencia=" + requiereLicencia + ", precio=" + precio + "]";
	}
	
	
	
}
