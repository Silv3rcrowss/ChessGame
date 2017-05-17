public class Coordonnees{
	private int abcisse;
	private int ordonnee;/*peut etre entre 0 et 7*/

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
	
	public void setCoordonnees(int i,int j){
		this.setAbcisse(i);
		this.setOrdonnee(j);
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
	
	public boolean coordonneesValides(){
		if(this.abcisse >=0 && this.abcisse<=7 && this.ordonnee>=0 && this.ordonnee<=7)
			return true;
		return false;
	}

	public Coordonnees getDiagD(int x){
		Coordonnees c = new Coordonnees(this.getAbcisse()-x,this.getOrdonnee()+x);
		return c;
	}
	
	public Coordonnees getDiagG(int x){
		Coordonnees c=new Coordonnees(this.getAbcisse()-x,this.getOrdonnee()-x);
		return c;
	}
	

	public boolean equals(Object o){
		if(o instanceof Coordonnees)
			return (this.abcisse==((Coordonnees) o).getAbcisse()&& this.ordonnee==((Coordonnees) o).getOrdonnee());
		return false;
}	
}
