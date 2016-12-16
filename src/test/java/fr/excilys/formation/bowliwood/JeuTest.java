package fr.excilys.formation.bowliwood;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class JeuTest {


	
	@Test
	public void saisieToTest(){
		int n;
		Joueur joueur = new Joueur("nom");
		ByteArrayInputStream in = new ByteArrayInputStream("2\n".getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		n=joueur.saisirNombreQuilles(10,sc);
		assertEquals(n,2);
		sc.close();
	
	}
	@Test
	public void calculTest(){
		
		int n;
		ArrayList<Integer> list= new ArrayList();
		for (int i=0; i<20; i++){
		list.add(1);
		}
		Joueur joueur= new Joueur ("nom");
		n= joueur.calculerScore(list);
		assertEquals(n,20);
		
	}
	}

