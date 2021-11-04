package com.hbt.semillero.rest;

import java.math.BigDecimal;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.hbt.semillero.entidad.Comic;



@Path("/SemilleroJPQLRest")
public class PQLRest {

	@PersistenceContext
	private EntityManager em;
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public String obtenerComic(){
		Comic comic = null;
		
		try {
			/*
			 * comic= em.find(Comic.class, 24L);
			 * 
			 * String consultaComic = "SELECT c FROM Comic c WHERE c.id=24";
			 * 
			 * javax.persistence.Query q = em.createQuery(consultaComic); comic = (Comic)
			 * q.getSingleResult();
			 * 
			 * String consultaConParamentro = "SELECT c FROM Comic c WHERE c.id = :idComic";
			 * Query q2 = em.createQuery(consultaConParamentro);
			 * 
			 * q2.setParameter("idComic", 24L); comic = (Comic) q.getSingleResult();
			 */
			
			Comic comicS = new Comic();
			
			comicS.setNombre("Superman");
			comicS.setEditorial("DC");
			comicS.setColeccion("230");
			comicS.setNumeroPaginas(20);
			comicS.setPrecio(new BigDecimal(2000000));
			comicS.setCantidad(3234L);
			
			
			em.persist(comicS);
			
			 String consultaComic = "SELECT c FROM Comic c WHERE c.nombre= :nombreComic";		  
			 javax.persistence.Query q = em.createQuery(consultaComic); 
			 q.setParameter("nombreComic", "Superman");
			 comicS = (Comic) q.getSingleResult();
			  
			 
			 comicS.setPrecio(new BigDecimal(600000));
			 comicS.setCantidad(9L);
			 em.merge(comicS);
			
			 
			 em.remove(comicS);
			return "HOLIS";
			
		} catch (Exception e) {
			System.out.println("IMPRIMIENDO");
			return "HOLIS";
		}
		
	}
	
}
