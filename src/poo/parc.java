package poo;

import java.util.ArrayList;
import java.util.Scanner;

import poo.vehicule;

public class parc {
	private ArrayList<vehicule> tabvehicule; 
	 
	public parc() {
		tabvehicule=new ArrayList<vehicule>();
		
		}
	public void afficher() {
		if(tabvehicule.size()>0) {
			
		
		for(int i=0;i<tabvehicule.size();i++)
			(tabvehicule.get(i)).afficherv();}
		else  System.out.println("parc vide!");
		
	}
	public void afficherVL() {
		if(tabvehicule.size()>0) {
			
		
		for(int i=0;i<tabvehicule.size();i++) {
			if(tabvehicule.get(i).getEtat().equals("loue"))
			(tabvehicule.get(i)).afficherv();
		}}
		else  System.out.println("pas de vehicule loué");
			
		
	}
	public void afficherVECR() {
		if(tabvehicule.size()>0) {
			
		
		for(int i=0;i<tabvehicule.size();i++) {
			if(tabvehicule.get(i).getEtat().equals("en cours de reparation"))
			(tabvehicule.get(i)).afficherv();
		}}
		else  System.out.println("pas de vehicule en en cours de reparation ");
		
	}
	public void afficherVD() {
		if(tabvehicule.size()>0) {
			
		
		for(int i=0;i<tabvehicule.size();i++) {
			if(tabvehicule.get(i).getEtat().equals("disponible"))
			(tabvehicule.get(i)).afficherv();
		}}
		else  System.out.println("pas de vehicule disponible ");
		
	}
	
	public int  chercher(int mat) {
		 boolean trouve=false;
			int i=0;
			if(tabvehicule.size()>0) {
				
			
			while((i<tabvehicule.size())&&(!trouve))
			{ 
				if(mat==tabvehicule.get(i).getMatricule()) {
	             trouve=true;}
	             else 
					i++;			
			
			}
			if(trouve)
		return i;
			else 
				return -1;
			}
			else 
				return-1;
			
			

		
		
	}
	public boolean exisits(int mat) {
		boolean trouve=false;
		if(tabvehicule.size()>0) {
		for(int i=0;i<tabvehicule.size();i++) {
			if(tabvehicule.get(i).getMatricule()==mat)
				trouve=true;}}
		return trouve;
	}
	
	public void ajouter() {
		vehicule a=new vehicule();
		parc par=new parc();
		par.setTabvehicule(tabvehicule);
		
		a.creerv();
		if(par.exisits(a.getMatricule())==false)
		tabvehicule.add(a);	
		else 
			System.out.println("Matricule existante!");
	}
	
	public void supprimer() {
		Scanner s=new Scanner(System.in);
		int mat,i=0;
		boolean trouve=false;
		
		if(tabvehicule.size()!=0) {
		System.out.println("entrer la matricule de vehicule a supprimer:");
		mat=s.nextInt();
		
		while( (i<tabvehicule.size())&&(!trouve) ) { 
			if(tabvehicule.get(i).getMatricule()==mat) {
				tabvehicule.remove(i);
				trouve=true;}
			else 
				i++;
		
	} if(trouve==false)   System.out.println(" vehicule inexistant!");                       }
		
		else System.out.print("parc vide!");
 
}
	public ArrayList<vehicule> getTabvehicule() {
		return tabvehicule;
	}
	public void setTabvehicule(ArrayList<vehicule> tabvehicule) {
		this.tabvehicule = tabvehicule;
	}
	
	
	public void modifieretat() {
		Scanner s=new Scanner(System.in);
		int mat,i=0;
		boolean trouve=false;
		if(tabvehicule.size()!=0) {
		System.out.println("entrer la matricule de vehicule pour changer l'etat:");
		mat=s.nextInt();
		
			
		
		while( (i<tabvehicule.size())&&(!trouve) ) { 
			if(tabvehicule.get(i).getMatricule()==mat) {
				
			
			tabvehicule.get(i).changeretat();
			trouve=true;}
			else 
				i++;}
		
		if(trouve==false) System.out.println("Matricule invalide");
	}
		else System.out.print("parc de vehicule vide!");

}
	
	}
