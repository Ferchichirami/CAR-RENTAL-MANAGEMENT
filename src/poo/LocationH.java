package poo;

import java.time.LocalDate;

public class LocationH  extends location{

	
	private int anne;
	private int mois;
	private int jours;
	private int etat;
	
	
	
	public void afiicherloch() {
		
		 super.getC().afficherclient();
		 super.getV().afficherv();
		 System.out.println( super.getDeb());
		 System.out.println(super.getFin());
		 System.out.print("Duree de retard:\n");   
 	     System.out.println( jours+ " jours"+mois +" mois et "+anne +" années"); 
		 if(etat==0)
			 System.out.println("voiture n'est pas en bon etat!");  
		 else 
			 System.out.println("voiture est en bon etat!");  
			 
	     
	}
	
	public boolean retard() {
		boolean trouve;
		if((anne==0)&&(mois==0)&&(jours==0))
			trouve=false;
		else 
		     trouve=true;
 	     
			
		return trouve;
		
			
		
		
		
	}
	public boolean bonetat() {
		boolean trouve;
		if(etat==0)
			trouve=false;  
		 else 
			 trouve=true;	
		
		return trouve;
		
	}
	
	
	
	
	
	public int getAnne() {
		return anne;
	}
	public void setAnne(int anne) {
		this.anne = anne;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getJours() {
		return jours;
	}
	public void setJours(int jours) {
		this.jours = jours;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	

}
