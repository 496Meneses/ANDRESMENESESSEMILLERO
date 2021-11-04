package com.hbt.semillero.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConsultarTamañoNombreDTO extends ResultadoDTO{
	private static final long serialVersionUID = 1L;
	
	private List<String> nombres;
	
	public ConsultarTamañoNombreDTO() {
		nombres = new ArrayList<String>();
	}

	public List<String> getNombres() {
		return nombres;
	}

	public void setNombres(List<String> nombres) {
		this.nombres = nombres;
	}
	
}
