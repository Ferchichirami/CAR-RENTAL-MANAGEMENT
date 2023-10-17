package poo;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class location {

	private vehicule v;
	private client c;
	private LocalDate deb;
	private LocalDate  fin;
	private int prix;
	private int avance;
	
	
	public void copierloc(location l) {
		v=l.v;
		c=l.c;
		
		 deb=l.deb;
		  fin=l.fin;
		 prix=l.prix;
		 avance=l.avance;
		
	}
	public void afiicherloc() {
		
		v.afficherv();
		c.afficherclient();
		System.out.println("Date de debut de location:"+deb);
		System.out.println("Date de fin de location:"+fin);
		System.out.println("Prix de location:"+prix);
		System.out.println("Le montant d'avance:"+avance);
		
		
	}
	
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	public void creerloc(vehicule ve,client cl) {
		int  a,a1,b,b1,cc1,cc;
		Scanner s=new Scanner(System.in);
		
		
	   	 v=ve;
	   	 c=cl;
	   	 
	   	 
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
	   		
	   		
	   		
	   		
	   		
	   
	   	
	   	 this.deb= LocalDate.of(a, b, cc);  
	    
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
	   	
	   	}
	   	
	   	
	   	}
	   	
	   	
	   	
	   	
	   	   	 this.fin= LocalDate.of(a1, b1, cc1); 
	   
	   	 System.out.println("entrer l prix:");
	   	 prix=s.nextInt();
	   	 System.out.println("entrer l'avance:");
	   	 avance=s.nextInt();
	   	 
	
		
	}

	public LocalDate getDeb() {
		return deb;
	}
	public void setDeb(LocalDate deb) {
		this.deb = deb;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getAvance() {
		return avance;
	}

	public vehicule getV() {
		return v;
	}
	public void setV(vehicule v) {
		this.v = v;
	}
	public client getC() {
		return c;
	}
	public void setC(client c) {
		this.c = c;
	}
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	
	
	
}
