package fr.excilys.formation.bowliwood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {
	
	
	//attributs
	
	public String name;
	public static List<Joueur> list;
	

	//constructeur
	public Jeu(String name){
		this.name = name;
		
	}
	

	//méthodes 
	//choix du nombre de joueurs
	public int NombreJoueurs(){
		System.out.println("Choisir le nombre de joueurs (entrer un nombre entier)");
		Scanner scan;
		scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		int nb = Integer.parseInt(nombre);
		System.out.println("Le jeu comportera " +nb+" joueur(s)");
		
		return nb;
	}
	
	//nommer les joueurs
	public void NommerJoueurs(int nb){
		List<Joueur> nomsjoueurs = new ArrayList<>();
		for (int i=0;i<nb;i++){
			System.out.println("Nommer le joueur : " + (i+1));
			Scanner scan;
			scan = new Scanner(System.in);
			String nom = scan.nextLine();
			Joueur joueur = new Joueur(nom);
			nomsjoueurs.add(joueur);
			this.list = nomsjoueurs;
			
		}
	
		return;
	}
	
	
	
	
	
	private void calculerScore(){
		return;
	}
	
	public static void main(String[] args){
		Jeu jeu = new Jeu("bowling");
		
		int nombre = jeu.NombreJoueurs();
		jeu.NommerJoueurs(nombre);
		
		for (int i=0;i<nombre;i++){
			Joueur joueur = list.get(i);
			String nom = joueur.getName();
			System.out.println("Le joueur " + (i+1) +" s'appelle " + nom +"."); 
		}
		
		Joueur joueur1 = list.get(0);
		joueur1.saisirNombreQuilles();
		int quilles = joueur1.verifNombreQuilles();
		
		System.out.println("Nombre de quilles enregistrées: " + quilles); 
			
		return;
	}
	
}
