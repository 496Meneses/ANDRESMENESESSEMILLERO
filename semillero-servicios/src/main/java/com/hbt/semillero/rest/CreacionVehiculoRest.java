package com.hbt.semillero.rest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Vehiculo;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;
import com.hbt.semillero.enums.TipoVehiculoEnum;

public class CreacionVehiculoRest {

	public static void main(String[] args) {
		ArrayList<ComicDTO> listaComics = new ArrayList<ComicDTO>();
		ComicDTO comic1=new ComicDTO("Spiderman","Marvel",
				TematicaEnum.AVENTURAS,"Manga",123,new BigDecimal(21400),
				"Lee sin", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 23L);
		
		ComicDTO comic2=new ComicDTO("Spiderman","Marvel",
				TematicaEnum.AVENTURAS,"Manga",123,new BigDecimal(21400),
				"Rocky", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 23L);
		
		ComicDTO comic3=new ComicDTO("Iron Man","Marvel",
				TematicaEnum.AVENTURAS,"Manga",143,new BigDecimal(212400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 230L);
		
		ComicDTO comic4=new ComicDTO("Hulk","Marvel",
				TematicaEnum.AVENTURAS,"Manga",128,new BigDecimal(31400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 440L);
		
		ComicDTO comic5=new ComicDTO("Ant Man","Marvel",
				TematicaEnum.AVENTURAS,"Manga",120,new BigDecimal(53400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 310L);
		
		ComicDTO comic6=new ComicDTO("Batman","Marvel",
				TematicaEnum.AVENTURAS,"Manga",13,new BigDecimal(53200),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 320L);
		
		ComicDTO comic7=new ComicDTO("SuperMan","Marvel",
				TematicaEnum.AVENTURAS,"Manga",11,new BigDecimal(2500),
				"Dragon Garow Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 200L);
		
		ComicDTO comic8=new ComicDTO("Ultron","Marvel",
				TematicaEnum.AVENTURAS,"Manga",234,new BigDecimal(3400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 54L);
		
		ComicDTO comic9=new ComicDTO("Deadpool","Marvel",
				TematicaEnum.AVENTURAS,"Manga",542,new BigDecimal(200),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 340L);
		
		ComicDTO comic10=new ComicDTO("Chica Marvel","Marvel",
				TematicaEnum.AVENTURAS,"Manga",431,new BigDecimal(4200),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 100L);
		
		
		ArrayList<ComicDTO> listaEsperada = new ArrayList<ComicDTO>();
		listaEsperada.add(comic1);
		listaEsperada.add(comic2);
		listaEsperada.add(comic6);
		listaEsperada.add(comic8);
		listaEsperada.add(comic9);
		listaEsperada.add(comic10);
		listaComics.add(comic1);
		listaComics.add(comic2);
		listaComics.add(comic3);
		listaComics.add(comic4);
		listaComics.add(comic5);
		listaComics.add(comic6);
		listaComics.add(comic7);
		listaComics.add(comic8);
		listaComics.add(comic9);
		listaComics.add(comic10);
		
		ArrayList<ComicDTO> lista= new ArrayList<ComicDTO>();

		if(listaComics.size()==0) {
			System.out.println("Hola");
		}
		
		for (ComicDTO comicDTO : listaComics) {
			if(comicDTO.getEstadoEnum().equals(EstadoEnum.ACTIVO)) {
				lista.add(comicDTO);
				System.out.println("ENTRO");
			}else{
				System.out.println("NO");
			};
		}
		
		
	}

}
