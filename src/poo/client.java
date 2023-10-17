package poo;
import java.util.*;
import java.util.Scanner;

public class client {
	private int cin;
	private String nom;
	private String prenom;
	private String adresse;
	
	 
	
	public void copierclient(client c) {
		 cin=c.cin;
		 nom=c.nom;
		 prenom=c.prenom;
		 adresse=c.adresse;}
		
	public void afficherclient() {
		
		System.out.println("Num cin:"+cin);
		System.out.println("Nom:"+nom);
		System.out.println("Prenom:"+prenom);
		System.out.println("Adresse:"+adresse);
		
		
	}
	
	public void creerclient(){
		
		 Scanner s=new Scanner(System.in);
		 Scanner sc=new Scanner(System.in);
		 do {
	   	 System.out.println("entrer le n cin de client(doit conternir 8chiffres) :");
	   	 setCin(s.nextInt());}while( (cin<10000000)|| (cin>99999999));
	   		
	   	  s.nextLine();
	   	  do {
	   		   System.out.println("entrer le nom:");
	   	 nom=sc.nextLine();
	   	  }while(nom.equals(""));
	   	  do {
	   		  	 System.out.println("entrer le prenom :");
	   	 prenom=sc.nextLine();
	   	  }while(prenom.equals(""));
	   	  do {
	   		  	 System.out.println("entrer l'adresse:");
	   	 adresse=sc.nextLine();
	   	  }while(adresse.equals(""));
	   	  
	   	
	   
	   
	   	 
		
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}

}
