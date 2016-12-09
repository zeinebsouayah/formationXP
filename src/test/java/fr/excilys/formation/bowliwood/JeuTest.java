package fr.excilys.formation.bowliwood;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class JeuTest {

	@Test
	public void NomJeuTest(){
		Jeu test = new Jeu("coucou");
		/*if (test.name == "coucou"){
		}
		else {
			fail();
		}*/
		assertEquals(test.name,"coucou");
	}
	
	
	
}
