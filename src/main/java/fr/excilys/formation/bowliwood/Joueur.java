package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Joueur {
	
	public String name;
	public int score;
	
	public Joueur(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	
	public int saisirNombreQuilles(){
		
		int nombre = 15;
		
		do {
			System.out.println("Saisir le nombre de quilles tombées: ");
			Scanner scan;
			scan = new Scanner(System.in);
			String quilles = scan.nextLine();
			nombre = Integer.parseInt(quilles);
		} while ((nombre>10) || (nombre <0));
		
		return nombre;
	}
	
	public int verifNombreQuilles(){
		int n=0;
		System.out.println("Confirmer le nombre de quilles :");
		n=saisirNombreQuilles();
		
		return n;
	}
}
