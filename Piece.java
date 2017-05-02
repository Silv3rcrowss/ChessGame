public abstract Piece{
	private boolean estNoir;
	private Coordonnees c;

	public Piece(Piece p){
		this(p.getEstNoir(),p.getCoordonnees());
	}

	public Piece(boolean noir,boolean sud,Coordonnees c){
		this.estNoir=noir;
		this.c=new Coordonnees(c);
	}

	public Coordonnees getCoordonnees(){
		return this.c;
	}

	public getEstNoir(){
		return this.estNoir;
	}

	public void setCoordonnes(Coordonnees c){
		this.c=new Coordonnees(c);
	}

	public abstract deplPossible(){
		
	}

	//passer toutes les pieces en
}