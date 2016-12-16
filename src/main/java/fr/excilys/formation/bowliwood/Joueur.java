package fr.excilys.formation.bowliwood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joueur {
	
	public String name;
	public int quilles;
	public ArrayList<Integer> score;
	public int it;
	
	
	public Joueur(String name){
		this.name = name;
		this.it = 20;
	}

	public String getName(){
		return this.name;
	}
	
	public int saisirNombreQuilles(int quillesrestantes, Scanner scan){
		
		int nombre = 15;
		
		do {
			System.out.println("Saisir le nombre de quilles tombées: ");
			String quilles = scan.nextLine();
			nombre = Integer.parseInt(quilles);
		} while ((nombre>10) || (nombre <0) &&(nombre <= quillesrestantes));
		
		
		this.quilles = nombre;
		return nombre;
	}
	
	public int verifNombreQuilles(int quillesrestantes,Scanner scan){
		int nombre=0;
		System.out.println("Confirmer le nombre de quilles :");
		
		do {
		
			String quilles = scan.nextLine();
			nombre = Integer.parseInt(quilles);
		} while ((nombre>10) || (nombre <0) && (nombre <= quillesrestantes));
		
		
		return nombre;
	}
	
	
	
	public int calculerScore(List<Integer> list){
		
		int total = 0;
		boolean test=false;
		
		for(int i=-1;i<(it-1);i++){
			i++;
			//cas strike
			if (list.get(i)==10){
				total = total + 10 + list.get(i+2) + list.get(i+3);
				test=true;
			}
			//cas spare
			if ((list.get(i)+list.get(i+1)==10) && (test==false)){
				total = total + 10 + list.get(i+1);
			}
			//ni spare ni strike
			else {
				total = total + list.get(i)+list.get(i+1);
			}
		}
		
		// bug du calcul, il y a toujours 10 points de trop
		;
		return total;
	}
}
