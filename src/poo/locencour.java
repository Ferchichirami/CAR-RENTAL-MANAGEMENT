package poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class locencour {
	private ArrayList<location> tabloc;
	
	
	public locencour() {
		tabloc=new ArrayList<location>(); 
	}
	
	
	
	
	
	
	
	public void ajoutloc(vehicule v,client c) {

		location l=new location();
		l.creerloc(v,c);
		
		if((v.getEtat().equals("disponible"))&&(l.getAvance()>0)){
			tabloc.add(l);
			v.setEtat("loue");
		
		}
		else 
			System.out.println("location n'est pas effectuee.");
		
	}
	
	
	public void afficherlocencour() {
		if(tabloc.size()==0) {
			
			System.out.println("tab de location vide.");
		}
		else 
		{
			
		
		for(int i=0;i<tabloc.size();i++) {
			System.out.println(i+1);
			tabloc.get(i).afiicherloc();
			}
		}
		
		
	}
	
	public void afficherlocC(int cin) {
		boolean trouve=false;
	          if(tabloc.size()>0) {
	        	  
	        	  for(int i=0;i<tabloc.size();i++) {
	      			if(tabloc.get(i).getC().getCin()==cin) {
	      				tabloc.get(i).afiicherloc();
	      				trouve=true;
	      			}
	      			       
	      			}
	        	  
	        	if(trouve==false)  System.out.println("ce client n'a aucun location.");
	        		
	        	  
	          }
	          else  System.out.println("tab de location vide.");
		
		
		
	}
	
	public int containscm (int cin,int matricule) {
		 boolean trouve=false;
		int i=0;
		while((i<tabloc.size())&&(!trouve))
		{ 
			if((tabloc.get(i).getC().getCin()==cin)&&(tabloc.get(i).getV().getMatricule()==matricule)) {
             trouve=true;}
             else 
				i++;			
		
		}
		if(trouve) {
			return i;
		}

		else 
			return -1;
	}
	
	public LocationH supplocation(int cin,int matricule) {
		boolean trouve=false;
		Scanner s=new Scanner(System.in);
		int etat;
		
		   LocationH ah=new LocationH();
		locencour av=new  locencour();
        av.setTabloc(tabloc);
        
	
		if(tabloc.size()>0) {
		 
			   
		
			if(av.containscm(cin, matricule)!=-1) {
				location a=new location();
			
			  a=tabloc.get(av.containscm(cin, matricule));
			  tabloc.remove(av.containscm(cin, matricule));
			  a.getV().setEtat("disponible");
			  
			  LocalDate n=a.getFin();
			  if(LocalDate.now().compareTo(n)>0) {

                  System.out.println("date de retour non respecter (il y a un retard).");
                
         		 Period difference = Period.between(n, LocalDate.now());   
         	        
         		 System.out.print("Duree de retard:\n");   
         	     System.out.printf( "%d jours, %d mois and %d années",difference.getDays(),difference.getMonths(), difference.getYears(),"\n"); 
         	     ah.setAnne(difference.getYears());
         	     ah.setMois(difference.getMonths());
         	     ah.setJours(difference.getDays());
         	     }
			  else {
				    ah.setAnne(0);
	         	    ah.setMois(0);
	                ah.setJours(0);
			  }
         		 ah.setV(a.getV());
        		 ah.setC(a.getC());
        		 ah.setDeb(a.getDeb());
        		 ah.setFin(a.getFin());
        		 ah.setPrix(a.getPrix());
        		 ah.setAvance(a.getAvance());
         	     
         	    
              
			   do {
         	    	 System.out.print("donner l'etat de vehicule (1 si en bon etat 0 si non)."); etat=s.nextInt();
         	     }while((etat!=1)&&(etat!=0));
         	    ah.setEtat(etat);
         	     
			  
			  
			  }
			else if(av.containscm(cin, matricule)==-1) {
				System.out.println("CIN ou matricule non valider!");
			}
			  

			}
			
		else 
			System.out.println("Liste vide!");
		
		
	
		return ah;
			}
		
	

	public ArrayList<location> getTabloc() {
		return tabloc;
	}

	public void setTabloc(ArrayList<location> tabloc) {
		this.tabloc = tabloc;
	}
	
     
}
