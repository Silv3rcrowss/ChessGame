public class Coordonees{
	private int abcisse;
	private int ordonnee;//peut etre entre 0 et 7

	public Coordonees(){
		this(0,0);
	}

	public Coordonees(int i,int j){
		abcisse=i;
		ordonnee=j;
	}

	public Coordonees(Coordonees c){
		this(c.getAbcisse(),c.getOrdonnee());
	}

	public setAbcisse(int x){
		this.abcisse=x;
	}

	public setOrdonnee(int x){
		this.ordonnee=x;
	}
	public getAbcisse(){
		return this.abcisse;
	}

	public getOrdonnee(){
		return this.ordonnee;
	}

	public int getIndice(){
		return abcisse*8+ordonnee;
	}

	public getDiagD(int x){
		c=new Coordonees(this.getAbcisse(),this.getOrdonnee());

	}
}