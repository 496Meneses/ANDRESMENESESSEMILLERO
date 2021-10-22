package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class OperacionesAritmeticasTest {
	
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure();
	}
	
	private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@Test
	public void validarResultadoSumaExitoso() {
		log.info("Inicio suma ----------------------------");

		int n1 = 300;
		int n2 = 150;
		int result = 450;

		try {
			if(result != (n1 + n2)){
				log.info("Se generó un error");
				throw new Exception("La suma ha fallado");
			}
			
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(),"La suma ha fallado");
		}
		Assert.assertEquals(result, n1 + n2);
		
		log.info("Finaliza suma -------------------------");

	}

@Test
public void validarResultadoSumaFallido() {
	log.info("Inicio suma ----------------------------");

	int n1 = 300;
	int n2 = 150;
	int result = 455;

	try {
		if(result != (n1 + n2)){
			log.info("Se generó un error");
			throw new Exception("La suma ha fallado");
		}
		else {
			Assert.assertEquals(result, n1 + n2);
				
		}
		
	} catch (Exception e) {
		Assert.assertEquals(e.getMessage(),"La suma ha fallado");
	}

	log.info("Finaliza suma -------------------------");

}

}

//EJECUTAR TEST
//mvn test -Dmaven.test.skip=false
