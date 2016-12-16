package fr.excilys.formation.bowliwood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jeu {
	
	
	//attributs
	
	public String name;
	public static List<Joueur> list;
	public List<Integer> scores;

	//constructeur
	public Jeu(String name){
		this.name = name;
		
	}
	

	//méthodes 
	//choix du nombre de joueurs
	public int NombreJoueurs(Scanner scan){
		System.out.println("Choisir le nombre de joueurs (entrer un nombre entier)");
		String nombre = scan.nextLine();
		int nb = Integer.parseInt(nombre);
		System.out.println("Le jeu comportera " +nb+" joueur(s)");
		
		return nb;
	}
	
	//nommer les joueurs
	public void NommerJoueurs(int nb, Scanner scan){
		List<Joueur> nomsjoueurs = new ArrayList<>();
		for (int i=0;i<nb;i++){
			System.out.println("Nommer le joueur : " + (i+1));
			String nom = scan.nextLine();
			Joueur joueur = new Joueur(nom);
			nomsjoueurs.add(joueur);
			this.list = nomsjoueurs;
			
		}
	
		return;
	}
	
	
	
	
	
	
	
	public static void main(String[] args){
		Jeu jeu = new Jeu("bowling");
		Scanner scan;
		scan = new Scanner(System.in);
		
		int nombre = jeu.NombreJoueurs(scan);
		jeu.NommerJoueurs(nombre,scan);
		
		for (int i=0;i<nombre;i++){
			Joueur joueur = list.get(i);
			String nom = joueur.getName();
			System.out.println("Le joueur " + (i+1) +" s'appelle " + nom +"."); 
			ArrayList<Integer> score = new ArrayList<>();
			joueur.score = score;
		}
		
	
		
		for (int i=0;i<10;i++){
			for (int j=0;j<nombre;j++){
				Joueur currentJoueur = list.get(j);
				currentJoueur.saisirNombreQuilles(10,scan);
				Integer nb1 = new Integer(currentJoueur.verifNombreQuilles(10,scan));
				currentJoueur.score.add(nb1);
				int reste = 10 - nb1;
				if (nb1 != 10){
					
					currentJoueur.saisirNombreQuilles(reste,scan);
					Integer nb2 = new Integer(currentJoueur.verifNombreQuilles(reste,scan));
					currentJoueur.score.add(nb2);
				}
				else {
					currentJoueur.score.add(0);
				}
			}
		}
		
		for (int k=0;k<nombre;k++){
			Joueur currentJoueur = list.get(k);
			int a = currentJoueur.calculerScore(currentJoueur.score);
			System.out.println("Le score du joueur "+(k+1)+"est de : "+a);
		}
		
		scan.close();
		return;
		
	}
	
}
