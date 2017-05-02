public class PlateauDeJeu{
	private Piece[] Echequier;
	private static final int NB_CASES=64;
	


	public PlateauDeJeu (){
		this.Echequier=new Piece[NB_CASES];
		this.init();
	}

	public void init(){
		Coordonnees c;
		for(int i=0;i<2;i++){
			for(int j=0;j<8;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Piece(true,c);
			}
		}
		for(int i=7;i>5;i--){
			for (int j=0;j<8 ;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Piece(false,c);
			}	
		}
	}

	public Piece getCase(Coordonnees c){
		return Echequier[c.getIndice()];
	}

	public void setCase(Coordonnees c,Piece p){
		Echequier[c.getIndice()]=p;
		Echequier[p.getCoordonnees().getIndice()]=null;
		Echequier[c.getIndice()].setCoordonnees(c);
	}
}