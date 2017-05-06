public abstract class Piece{
	private boolean estNoir;
	private Coordonnees c;

	public Piece(Piece p){
		this(p.getEstNoir(),p.getCoordonnees());
	}

	public Piece(boolean noir,Coordonnees c){
		this.estNoir=noir;
		this.c=new Coordonnees(c);
	}

	public Coordonnees getCoordonnees(){
		return this.c;
	}

	public boolean getEstNoir(){
		return this.estNoir;
	}

	public void setCoordonnees(Coordonnees c){
		this.c=new Coordonnees(c);
	}

	public abstract boolean deplPossible(Coordonnees c,PlateauDeJeu p);

	//passer toutes les pieces en
}