package semillero.pruebasUnitarias;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;



public class CreacionComicTest {
	/**
	 * Lista inicial de comics
	 */
	ArrayList<ComicDTO> listaComics;
	/**
	 * Lista esperada de comics activos, Servirá para probar el metodo obtenerComicsActivos
	 */
	ArrayList<ComicDTO> listaEsperadaActivos;

	@Before
	public void inicializarPrueba(){

		listaComics = new ArrayList<ComicDTO>();
		listaEsperadaActivos = new ArrayList<ComicDTO>();
		
		//Creando Comics
		ComicDTO comic1=new ComicDTO("Spiderman","Marvel",
				TematicaEnum.AVENTURAS,"Manga",123,new BigDecimal(21400),
				"Lee sin", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 23L);
		
		ComicDTO comic2=new ComicDTO("Spiderman","Marvel",
				TematicaEnum.AVENTURAS,"Manga",123,new BigDecimal(21400),
				"Rocky", false,LocalDate.of(2017, 1, 13),EstadoEnum.ACTIVO, 23L);
		
		ComicDTO comic3=new ComicDTO("IronMan","Marvel",
				TematicaEnum.AVENTURAS,"Manga",143,new BigDecimal(212400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 230L);
		
		ComicDTO comic4=new ComicDTO("Hulk","Marvel",
				TematicaEnum.AVENTURAS,"Manga",128,new BigDecimal(31400),
				"Stan Lee", false,LocalDate.of(2017, 1, 13),EstadoEnum.INACTIVO, 440L);
		
		ComicDTO comic5=new ComicDTO("AntMan","Marvel",
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
		
		// Agregando comics a una lista
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
		
		
		// Agregando comics activos a la lista de comics activos
		listaEsperadaActivos.add(comic1);
		listaEsperadaActivos.add(comic2);
		listaEsperadaActivos.add(comic6);
		listaEsperadaActivos.add(comic8);
		listaEsperadaActivos.add(comic9);
		listaEsperadaActivos.add(comic10);


		
	}

	/**
	 * 
	 * Metodo encargado de obtener los comics activos y retornarlos a una lista
	 * <b>Caso de Uso</b>
	 * @author Andres Camilo Meneses
	 * 
	 * @return
	 */
	private ArrayList<ComicDTO> obtenerComicsActivos() {
		
		// lista donde se agregaran los comics activos
		ArrayList<ComicDTO> lista= new ArrayList<ComicDTO>();
		
		//Recorriendo la lista de comics
		for (ComicDTO comicDTO : listaComics) {
			//filtrando los comics activos
			if(comicDTO.getEstadoEnum().equals(EstadoEnum.ACTIVO)) {
				lista.add(comicDTO);
				// Imprimiendo Comic Activo
				System.out.println("COMIC ACTIVO " + comicDTO.toString());
			};
		}
		// lista resultante de comics activos
		return lista;
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de obtener los comics Inactivos, este metodo genera una excepcion
	 * <b>Caso de Uso</b>
	 * @author Andres Camilo Meneses
	 * 
 	 * @return
	 * @throws Exception
	 */
	private ArrayList<ComicDTO> verificarComicsInactivos() throws Exception {
		ArrayList<ComicDTO> lista= new ArrayList<ComicDTO>();
		
		try {
			for (ComicDTO comicDTO : listaComics) {
				if(comicDTO.getEstadoEnum().equals(EstadoEnum.INACTIVO)) {
					lista.add(comicDTO);
				};
				

			}
				String nombresComicsInactivos = nombresDeComics(lista);
				System.out.println("generando Excepcion");
				// exepcion generada
				throw new Exception("Se ha detectado que de " + listaComics.size() + 
						" comics se encontraron que " + listaEsperadaActivos.size() + "  se encuentran activos y "
						+ lista.size() + " inactivos. Los comics inactivos son:"
						+ nombresComicsInactivos);
				
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return lista;

		
		
		
		
	}
	/**
	 * 
	 * Metodo encargado de retornar los nombres de los comics que estan en una lista
	 * <b>Caso de Uso</b>
	 * @author Andres Camilo Meneses
	 * 
	 * @param lista
	 * @return
	 */
	private String nombresDeComics(ArrayList<ComicDTO> lista) {
		String nombresConcatenados = "";
		for (ComicDTO comicDTO : lista) {
			nombresConcatenados = " " + comicDTO.getNombre() + nombresConcatenados;
		}
		return nombresConcatenados;
	}
	
	/**
	 * 
	 * Metodo encargado de probar la lista que se retorna del metodo obtenerComicsActivos
	 * <b>Caso de Uso</b> Semillero
	 * @author Andres Camilo Meneses
	 *
	 */
	@Test
	public void probarListaDeActivos() {
		System.out.println("Inicio Prueba unitaria probarListaDeActivos");
		ArrayList<ComicDTO> listaResultado = obtenerComicsActivos();
		Assert.assertEquals(listaEsperadaActivos,listaResultado);;
		System.out.println("Fin Prueba unitaria probarListaDeActivos");

		
	}
	/**
	 * 
	 * Metodo encargado de probar el mensaje de excepcion 
	 * <b>Caso de Uso</b>
	 * @author Andres Camilo Meneses
	 * 
	 * @throws Exception
	 */
	@Test
	public void probarListaDeInactivos() throws Exception {
		System.out.println("Inicio Prueba unitaria probarListaDeINACTIVOS");
		try {
			ArrayList<ComicDTO> lista = verificarComicsInactivos();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Se ha detectado que de 10 comics se encontraron que 6  se encuentran activos y 4 inactivos. "
					+ "Los comics inactivos son: SuperMan AntMan Hulk IronMan");
		}
		
	}
	


	
}
