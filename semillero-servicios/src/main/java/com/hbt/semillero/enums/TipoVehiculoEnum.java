package com.hbt.semillero.enums;

public enum TipoVehiculoEnum {
	TERRESTRE("Terrestre",1),
	ACUATICO("Acuatico",2);
	
	private String tipo;
	private int id;
	
	TipoVehiculoEnum(String tipo, int id){
		this.tipo=tipo;
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public int getid() {
		return id;
	}
}
