package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Avion extends Vehiculo implements AccionesVehiculoInterface{

	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long obtenerPesoMaximoDeCarga() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum v) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
