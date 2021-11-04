/**
 * Comic.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.hbt.semillero.enums.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <b>Descripción:<b> Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."COMIC"
 * 
 * @author ccastano
 * @version
 */
@Entity
@Table(name = "COMIC")
public class Comic implements Serializable {

	/**
	 * Atributo que determina el identificador unico del comic
	 */
	@Column(name="SCID")
	private Long id;
	
	/**
	 * Atributo que determina el nombre o titulo del comic o revista grafica
	 */
	@Column(name="SCNOMBRE")
	private String nombre;
	
	/**
	 * Atributo que determina la empresa editorial que publico el comic
	 */
	@Column(name="SCEDITORIAL")
	private String editorial;
	
	/**
	 * Atributo que determina si el comic es de tipo AVENTURAS, BELICO, HUMORISTICO, DEPORTIVO, FANTASTICO, CIENCIA_FICCION, HISTORICO, HORROR
	 */
	@Column(name="SCTEMATICA")
	@Enumerated(value = EnumType.STRING)
	private TematicaEnum tematicaEnum;
	
	/**
	 * Atributo que determina el conjunto de publicaciones de la que el comic es parte
	 */
	@Column(name="SCCOLECCION")
	private String coleccion;
	
	/**
	 * Atributo que determina la Cantidad de las paginas que contiene el comic
	 */
	@Column(name="SCNUMEROPAGINAS")
	private Integer numeroPaginas;
	
	/**
	 * Atributo que determina el valor en pesos del comic
	 */
	@Column(name="SCPRECIO")
	private BigDecimal precio;
	
	/**
	 * Atributo que determina el Autor u autores del comic
	 */
	@Column(name="SCAUTORES")
	private String autores;
	
	/**
	 * Atributo que determina si el comic es a color o no, campo de tipo booleano solo acepta 1 o 0
	 */
	@Column(name="SCCOLOR")
	private Boolean color;
	
	/**
	 * Atributo que determina la Fecha de inicio de la venta del comic
	 */
	@Column(name="SCFECHA_VENTA")
	private LocalDate fechaVenta;	
	
	/**
	 * Atributo que determina si el comic tiene existencia para la venta o no
	 */
	@Column(name="SCESTADO")
	@Enumerated(value = EnumType.STRING)
	private EstadoEnum estadoEnum;
	
	/**
	 * Atributo que determina la Cantidad de comics en inventario disponibles para la venta
	 */
	@Column(name="SCCANTIDAD")
	private Long cantidad;

	/**
	 * Constructor de la clase.
	 */
	public Comic() {

	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * 
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "COMIC_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SCID_GENERATOR")
	@Column(name = "SCID")
	public Long getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * 
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * 
	 * @return El nombre asociado a la clase
	 */
	@Column(name = "SCNOMBRE")
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * 
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * 
	 * @return El editorial asociado a la clase
	 */
	@Column(name = "SCEDITORIAL")
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * 
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tematica
	 * 
	 * @return El tematica asociado a la clase
	 */
	@Column(name = "SCTEMATICA")
	@Enumerated(value = EnumType.STRING)
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tematica
	 * 
	 * @param tematica El nuevo tematica a modificar.
	 */
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * 
	 * @return El coleccion asociado a la clase
	 */
	@Column(name = "SCCOLECCION")
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo coleccion
	 * 
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroPaginas
	 * 
	 * @return El numeroPaginas asociado a la clase
	 */
	@Column(name = "SCNUMEROPAGINAS")
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroPaginas
	 * 
	 * @param numeroPaginas El nuevo numeroPaginas a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * 
	 * @return El precio asociado a la clase
	 */
	@Column(name = "SCPRECIO")
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * 
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * 
	 * @return El autores asociado a la clase
	 */
	@Column(name = "SCAUTORES")
	public String getAutores() {
		return autores;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * 
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * 
	 * @return El color asociado a la clase
	 */
	@Column(name = "SCCOLOR")
	public Boolean getColor() {
		return color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * 
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * 
	 * @return El fechaVenta asociado a la clase
	 */
	@Column(name = "SCFECHA_VENTA")
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * 
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * 
	 * @return El estado asociado a la clase
	 */
	@Column(name = "SCESTADO")
	@Enumerated(value = EnumType.STRING)
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * 
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * 
	 * @return El cantidad asociado a la clase
	 */
	@Column(name = "SCCANTIDAD")
	public Long getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * 
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @see java.lang.Object#toString() Metodo que permite asociar al objeto un
	 *      texto representativo
	 */
	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematica=" + tematicaEnum
				+ ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + ", autores="
				+ autores + ", color=" + color + ", fechaVenta=" + fechaVenta + ", estado=" + estadoEnum + ", cantidad="
				+ cantidad + "]";
	}


	
}
