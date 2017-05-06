public class Coordonnees{
	private int abcisse;
	private int ordonnee;//peut etre entre 0 et 7

	public Coordonnees(){
		this(0,0);
	}

	public Coordonnees(int i,int j){
		abcisse=i;
		ordonnee=j;
	}

	public Coordonnees(Coordonnees c){
		this(c.getAbcisse(),c.getOrdonnee());
	}

	

	public void setAbcisse(int x){
		this.abcisse=x;
	}

	public void setOrdonnee(int x){
		this.ordonnee=x;
	}
	public int getAbcisse(){
		return this.abcisse;
	}

	public int getOrdonnee(){
		return this.ordonnee;
	}

	public int getIndice(){
		return abcisse*8+ordonnee;
	}

	public Coordonnees getDiagD(int x){
		Coordonnees c = new Coordonnees(this.getAbcisse()-x,this.getOrdonnee()+x);
		return c;
	}
	
	public Coordonnees getDiagG(int x){
		Coordonnees c=new Coordonnees(this.getAbcisse()-x,this.getOrdonnee()-x);
		return c;
	}


	public boolean equals(Coordonnees c){
		if(this.abcisse==c.getAbcisse()&& this.ordonnee==c.getOrdonnee())
			return true;
}	
}
