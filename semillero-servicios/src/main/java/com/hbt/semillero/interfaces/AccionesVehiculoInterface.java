package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;

public interface AccionesVehiculoInterface {
	public abstract int obtenerVelocidadMaxima();
	public abstract Long obtenerPesoMaximoDeCarga();
	public abstract boolean determinarTipoVehiculo(TipoVehiculoEnum v) throws Exception;
	
}
