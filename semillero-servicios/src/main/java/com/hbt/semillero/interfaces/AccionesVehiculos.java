package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;

public abstract class AccionesVehiculos {
	public abstract int obtenerVelocidadMaxima();
	public abstract Long obtenerPesoMaximoDeCarga();
	public abstract boolean determinarTipoVehiculo(TipoVehiculoEnum v) throws Exception;
	
}
