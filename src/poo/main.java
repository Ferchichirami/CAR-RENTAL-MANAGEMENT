
package poo;
import java.time.Period;
 
import java.time.*;   
import java.util.*;  
import java.time.LocalDate;
import java.util.*;



public class main {

	public static void main (String [] args) {
		
		
	         
	         int choix,choix1;
	         Scanner s=new Scanner(System.in);
	         parc parc=new parc();
	         locencour locationencour=new locencour();
	         locHistorique lh=new locHistorique();
	         ArrayList<client> lclient=new ArrayList<client>();
	         
	         
	         
	         
	         
	         do {
	        	 
	         
	      
	        	 System.out.println("1-Gestion du Parc de l’Agence ");
	        	 System.out.println("2-Gestion Locations  ");
	        	 System.out.println("3-Statistiques  ");
	        	 System.out.println("4-quitter. ");
	        	 choix=s.nextInt();
	        
	         
	         
	         
	         if(choix==1) {
	        	 do {
	        		 
	        	 
	        
		        	 System.out.println("1. Nouvelle acquisition (Ajout d’un véhicule)");
		        	 System.out.println("2. Modification de l’Etat d’un Véhicule ");
		        	 System.out.println("3. Suppression d’un Véhicule ");
		        	 System.out.println("4. Consultation Parc (tous les véhicules)"	);
		        	 System.out.println("5. Liste des véhicules loués");
		        	 System.out.println("6. Liste des véhicules en cours de réparation");
		        	 System.out.println("7. Liste des véhicules disponibles");
		        	 System.out.println("8.retour au menu principale");
		        	 choix1=s.nextInt();
		     
	        	 
	        	 switch (choix1) {
	        	 case 1:
	        		  parc.ajouter();
	        		  break;
	        	 case 2:
	        		  parc.modifieretat();
	        		  break;
	        	 case 3: 
	        		  parc.supprimer();
	        		  break;
	        	 case 4:
	        		  parc.afficher();
	        		  break;
	        	 case 5:
	        		  parc.afficherVL();
	        		  break;
	        	 case 6:
	        		  parc.afficherVECR();
	        		  break;
	        	 case 7:
	        		  parc.afficherVD();
	        		  break;
 
	        	 }  }while(choix1!=8);
	        	 
	         }
	         
	         
	         else if (choix==2) {
	        do {	 
	        	 
		        	 System.out.println("1. Nouvelle Location (Ajout d’une location) ");
		        	 System.out.println("2. Fin de Location (Suppression) ");
		        	 System.out.println("3. Consultation des locations en cours");
		        	 System.out.println("4. Consultation des Véhicules Loués par un client ");
		        	 System.out.println("5.retour au menu principale");
		        	 choix1=s.nextInt();
		        
		         
	        	 
	        	 switch (choix1) {
	        	 case 1:
	        		
	        		
	        	     client l=new client();
	        	      int nec;
	        	     do {
	        	    	     System.out.println("1 pour client existant 2 poir creer un client ");
	        	     nec=s.nextInt(); 
	        	     }while((nec!=1)&&(nec!=2));
	        	
	        	     if(nec==2) {   	 
	        	    	 l.creerclient();
	        	    	 lclient.add(l);
	        	     }
	        		 
	        	     else {  
	        	    	 if(lclient.size()>0) {
	        	    		  for(int i=0;i<lclient.size();i++) {
	        	    		 System.out.println("client"+(i+1)+":");
	        	    		 lclient.get(i).afficherclient();
	        	    	 }
	        	    	 System.out.println("saisir le nbre de client: ");
	        	    	 int nbcl=s.nextInt();	        	    	 
	        	    	 l=lclient.get(nbcl-1);
	        	    	 }
	        	    	 else {
	        	    		 
	        	    	 
	        	    		 l.creerclient();
	        	    	     lclient.add(l);}
	        	    	     
	        	    	 
	        	     }
	        	    	

	        		 System.out.println("entrer une matricule ");
	        		 int matricule=s.nextInt();
	        		 if(parc.chercher(matricule)!=-1)
	        		 locationencour.ajoutloc(parc.getTabvehicule().get(parc.chercher(matricule)), l);
	        		 else 
	        		 System.out.println(" matricule invalide! ");
	        		  break;
	        	 case 2:
	        		 System.out.println("entrer une matricule :");
	        		  matricule=s.nextInt();
	        		 System.out.println("entrer le cin du client: ");
	        		 int cin=s.nextInt();
	        		  if(locationencour.containscm(cin, matricule)!=-1) {
	        			  lh.ajouterLh( locationencour.supplocation(cin, matricule));
	        		  }
	        		  else 
	        			  System.out.println("CIN ou matricule non valide !");
	        		  
	        		  break;
	        	 case 3:
	        		 locationencour.afficherlocencour();
	        		  break;
	        	 case 4:
	        		 System.out.println("entrer le cin du client: ");
	        		 cin=s.nextInt();
	        		 locationencour.afficherlocC(cin);
	        		  break;
	       
 
	        	 }  
		       
		         }while(choix1!=5);
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	         
	         }
	         else if(choix==3) {
	        	 
	        	 
	        	
	        	 do {
		        	 System.out.println("1. Nombre de locations pour une période déterminée ");
		        	 System.out.println("2. Total des revenus pour une période déterminée");
		        	 System.out.println("3. Liste des clients à risque (Retard / mauvais état de véhicules rendus)");
		        	 System.out.println("4.retour au menu principale");
		        	 choix1=s.nextInt();
		        
		        
	        	 
	        	 
	        	 switch (choix1) {
	        	 case 1:
	   
	              lh.locPer();
	 
	        		  break;
	        	 case 2:
	        		 lh.locRev();
	        		  break;
	        	 case 3: 
	        	
	        		 lh.ListeCaRisque();
	        		break;
	        	
 
	        	 }  }while(choix1!=4);
	        	 
	        	 
	         }

	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         }while(choix!=4);
	}   
	
	


	}
