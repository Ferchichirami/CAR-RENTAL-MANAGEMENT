package poo;

import java.util.ArrayList;
import java.time.*;   
import java.util.*; 

public class locHistorique {
private ArrayList<LocationH> tablocH;
	
	
	public locHistorique() {
		tablocH=new ArrayList<LocationH>(); 
		
	
	}
	public void afficherlocH() {
		if(tablocH.size()==0) {
			
			System.out.println("tab de location vide.");
		}
		else 
		{
			
		
		for(int i=0;i<tablocH.size();i++) {
			
			tablocH.get(i).afiicherloch();
			}
		}
		
		
	}
	
	public void retardEtat(int i) {

		tablocH.get(i).afiicherloc();

		
	}
	
	public void ajouterLh(LocationH a) {

		tablocH.add(a);
	
		
	}
	
	public LocationH get (int i) {
		return tablocH.get(i);
		
		
	}
public void locPer() {
	boolean trouve=false;
	int i=0;
	LocalDate dd1,dd2;
	locHistorique l=new locHistorique();
	LocationH lH=new LocationH();
    Scanner s=new Scanner(System.in);
	l.setTablocH(tablocH);
	int nbloc=0;
	
	
	
	int a,b,cc,a1,b1,cc1;
	LocalDate deb,fin;
  	 
  	 System.out.println("entrer la date de debut");
  	 do {
  	System.out.println("anne:");
  	a=s.nextInt();}while((a<1000)||(a>9999));
  	do {
  		
  		System.out.println("mois:");
  		b=s.nextInt();
  		
  	}while((b<1 )|| (b>12));
  	
  	if((b==2)) {
  		
  
  	do {
  		System.out.println("jour");
  	    cc=s.nextInt();
  		
  	}while((cc<1 )||  (cc>28));	}
  	else if((b==4)|| (b==6 ) ||(b==11 )|| (b==9 ) ){
  		do {
	   		System.out.println("jour");
	   	    cc=s.nextInt();
	   		
	   	}while((cc<1 )|| (cc>30));	}
  	else  {
  		System.out.println("jour");
  	    cc=s.nextInt();
  		
  	}while((cc<1 )||  (cc>31));
  		

   	deb= LocalDate.of(a, b, cc);  
   	
   	
    
	 System.out.println("entrer la date de fin:");
   	 do {
  	System.out.println("anne:");
   	a1=s.nextInt();}while(((a1<1000)||(a1>9999))||(a1<a ));
   	 
   	 
   	 
   	 if(a1==a) {
   		  	do {
   		System.out.println("mois:");
   		b1=s.nextInt();
   		
   	}while(((b1<1 )|| (b1>12))||(b1<b ));
   	
   	 }
   	 else 
   		do {
	   		System.out.println("mois:");
	   		b1=s.nextInt();
	   		
	   	}while((b1<1 )|| (b1>12)); 
   	 
   	 
   	 
  
   	
   	
   	
   	
   	
   	
   	if((b1==b)&&(a1==a)){  
   		
   		if((b1==2)) {

   	do {
   		System.out.println("jour");
   	    cc1=s.nextInt();
   		
   	}while(((cc1<1 )||  (cc1>28))||(cc1<cc ));	}
   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
   		do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while(((cc1<1 )|| (cc1>30))||(cc1<cc ));	}
   	else  {
   		do {
   			
   		
   
   		System.out.println("jour");
   	    cc1=s.nextInt();
   		
   	}while(((cc1<1 )||  (cc1>31))||(cc1<cc ));
   	}
   	}
   	
   	
   	else {
   			   	
   	if((b1==2)) {
   		
   
   	do {
   		System.out.println("jour");
   	    cc1=s.nextInt();
   		
   	}while((cc1<1 )||  (cc1>28));	}
   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
   		do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while((cc1<1 )|| (cc1>30));	}
   	else  {
   		do {
   		System.out.println("jour");
   	    cc1=s.nextInt();
   		
   	}while((cc1<1 )||  (cc1>31));
   	
   	}}
   	
   	
   	
   	   	fin= LocalDate.of(a1, b1, cc1); 
   	   	
	if(tablocH.size()>0) {
		while(i<tablocH.size()) {
			
		      dd1=l.get(i).getDeb();
		      dd2=l.get(i).getFin();
			if(((dd1.compareTo(deb))>0)&&((dd2.compareTo(fin))<0)) {
				trouve=true;
				lH=l.get(i);
		             lH.afiicherloc();
		             nbloc++;
		}
			 i++;
		
		}
		if(trouve==false)  System.out.println("pas de location disponible dans cette periode");
		else   System.out.println("nombre de location  dans cette periode"+deb+" "+fin+ ":"+nbloc);
	}
		
	
	else System.out.println("Liste de historique vide!");
		
		
		
	}


public void locRev() {
	boolean trouve=false;
	int i=0;
	LocalDate dd1,dd2;
	locHistorique l=new locHistorique();
	LocationH lH=new LocationH();
    Scanner s=new Scanner(System.in);
    int rev=0;
	l.setTablocH(tablocH);
	
	
	
	if(tablocH.size()>0) {
		int a,b,cc,a1,b1,cc1;
		LocalDate deb,fin;
	  	 
	  	 System.out.println("entrer la date de debut");
	  	 do {
	  	System.out.println("anne:");
	  	a=s.nextInt();}while((a<1000)||(a>9999));
	  	do {
	  		
	  		System.out.println("mois:");
	  		b=s.nextInt();
	  		
	  	}while((b<1 )|| (b>12));
	  	
	  	if((b==2)) {
	  		
	  
	  	do {
	  		System.out.println("jour");
	  	    cc=s.nextInt();
	  		
	  	}while((cc<1 )||  (cc>28));	}
	  	else if((b==4)|| (b==6 ) ||(b==11 )|| (b==9 ) ){
	  		do {
		   		System.out.println("jour");
		   	    cc=s.nextInt();
		   		
		   	}while((cc<1 )|| (cc>30));	}
	  	else  {
	  		System.out.println("jour");
	  	    cc=s.nextInt();
	  		
	  	}while((cc<1 )||  (cc>31));
	  		

	   	deb= LocalDate.of(a, b, cc);  
	   	
	   	
	    
		 System.out.println("entrer la date de fin:");
	   	 do {
	  	System.out.println("anne:");
	   	a1=s.nextInt();}while(((a1<1000)||(a1>9999))||(a1<a ));
	   	 
	   	 
	   	 
	   	 if(a1==a) {
	   		  	do {
	   		System.out.println("mois:");
	   		b1=s.nextInt();
	   		
	   	}while(((b1<1 )|| (b1>12))||(b1<b ));
	   	
	   	 }
	   	 else 
	   		do {
		   		System.out.println("mois:");
		   		b1=s.nextInt();
		   		
		   	}while((b1<1 )|| (b1>12)); 
	   	 
	   	 
	   	 
	  
	   	
	   	
	   	
	   	
	   	
	   	
	   	if((b1==b)&&(a1==a)){  
	   		
	   		if((b1==2)) {

	   	do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while(((cc1<1 )||  (cc1>28))||(cc1<cc ));	}
	   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc1=s.nextInt();
		   		
		   	}while(((cc1<1 )|| (cc1>30))||(cc1<cc ));	}
	   	else  {
	   		do {
	   			
	   		
	   
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while(((cc1<1 )||  (cc1>31))||(cc1<cc ));
	   	}
	   	}
	   	
	   	
	   	else {
	   			   	
	   	if((b1==2)) {
	   		
	   
	   	do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while((cc1<1 )||  (cc1>28));	}
	   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc1=s.nextInt();
		   		
		   	}while((cc1<1 )|| (cc1>30));	}
	   	else  {
	   		do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while((cc1<1 )||  (cc1>31));
	   	
	   	}}
	   	
	   	
	   	
	   	   	fin= LocalDate.of(a1, b1, cc1); 
   	   	
	
		while(i<tablocH.size()) {
			
		      dd1=l.get(i).getDeb();
		      dd2=l.get(i).getFin();
			if(((dd1.compareTo(deb))>0)&&((dd2.compareTo(fin))<0)) {
				trouve=true;
				lH=l.get(i);
		             rev+=lH.getAvance();
		             rev+=lH.getPrix();
		}
			 i++;
		
		}
		if(trouve==true)  System.out.println("Total des revenus pour la période"+deb+"  "+fin+":"+rev+"TND.");
		if(trouve==false)  System.out.println("pas de location disponible dans cette periode");
	}
		
	
	else System.out.println("Liste de historique vide!");
		
		
		
	}

public void ListeCaRisque() {
	boolean trouve=false;
	locHistorique l=new locHistorique();
	l.setTablocH(tablocH);

	if(tablocH.size()>0) {
		for(int i=0;i<tablocH.size();i++) {
			if((l.get(i).bonetat()==false)||(l.get(i).retard()==true)) {
				
				trouve=true;
				System.out.println("----------------------");
				tablocH.get(i).getC().afficherclient();
				//tablocH.get(i).afiicherloch();//
			}
				
		}
	

	
	if(trouve==false)  System.out.println("pas de retard/voiture en mauvais etat.");
}
	

		
	
else System.out.println("Liste de historique vide!");
	
}



public ArrayList<LocationH> getTablocH() {
	return tablocH;
}


public void setTablocH(ArrayList<LocationH> tablocH) {
	this.tablocH = tablocH;
}
	
	
	
}
