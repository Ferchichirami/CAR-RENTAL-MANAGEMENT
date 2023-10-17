package poo;

import java.util.Scanner;

public class vehicule {

	 private int   matricule;
	 private String constructeur;
	 private String marqueCommerciale;
	 private String etat;
	 
	 
	 
	 
    public void copiervehicule(vehicule v) {
    	   matricule=v.matricule;
    	   constructeur=v.constructeur;
    	   marqueCommerciale=v.marqueCommerciale;
    	   etat=v.etat;
    	 	
    	
    }
    public void afficherv() {
   	 
   	 System.out.println("Matricule du vehicule:"+matricule);
    	System.out.println("marque commerciale:"+marqueCommerciale);
   	 System.out.println("Etat du vehicule:"+etat);
   	 
    }
    
    
    public void creerv() {
   	 Scanner sc=new Scanner(System.in);
   	 Scanner s=new Scanner(System.in);
   	 
   	
   		 System.out.println("entrer la Matricule du vehicule:");
   	 this.matricule=s.nextInt();
   	
   	 
   do {
	   System.out.println("entrer le Constructeur du vehicule:");
   	 
   	 this.constructeur=sc.nextLine();
   }while(constructeur.equals(""));
   	 
   	 do {
   		  System.out.println("entrer la Marque commerciale du vehicule:");
   	 this.marqueCommerciale=sc.nextLine();
   	 
   	 }while(marqueCommerciale.equals(""));
   	
   	 
   	 do {
   		  System.out.println("entrer l'Etat du vehicule( disponible ,  Loue  ou en cours de reparation ):");
   	 this.etat=sc.nextLine();
   	 }while((!(etat.equals("disponible")) && !(etat.equals("loue"))&& !(etat.equals("en cours de reparation"))))        ;
   	
   	
   	 
    }
    public void changeretat() {
    	Scanner s=new Scanner(System.in);
	   String newetat;
	   do {
		   System.out.print("entrer l'etat du vehicule( disponible ,  Loue  ou en cours de reparation ):");
		newetat=s.next();
    	etat=newetat;
	   }while((!(etat.equals("disponible")) && !(etat.equals("loue"))&& !(etat.equals("en cours de reparation"))))        ;
		
    	
    }

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getMarqueCommerciale() {
		return marqueCommerciale;
	}

	public void setMarqueCommerciale(String marqueCommerciale) {
		this.marqueCommerciale = marqueCommerciale;
	}

	public String getConstructeur() {
		return constructeur;
	}

	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	 
	 
	 
	
	
}