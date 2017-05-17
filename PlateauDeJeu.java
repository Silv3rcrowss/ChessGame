public class PlateauDeJeu{
	private Piece[] Echequier;
	private static final int NB_CASES=64;
	


	public PlateauDeJeu(){
		this.Echequier=new Piece[NB_CASES];
		//this.init();
	}
	public void init(){
		Coordonnees c;
		for(int i=0;i<2;i++){
			for(int j=0;j<8;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Pion(false,false,c);
			}
		}
		for(int i=7;i>5;i--){
			for (int j=0;j<8 ;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Pion(true,true,c);
			}	
		}
	}

	public Piece getCase(Coordonnees c){
		if(c.coordonneesValides())
			return Echequier[c.getIndice()];
		return null;
	}

	public void setCase(Coordonnees c,Piece p){
			Echequier[c.getIndice()]=p;
			Echequier[p.getCoordonnees().getIndice()]=null;
			Echequier[c.getIndice()].setCoordonnees(c);
	}
	
	public void deplPiece(Coordonnees c,Piece p){
		if( c.coordonneesValides() && p.deplPossible(c, this)&& (!c.equals(p.getCoordonnees())))
			this.setCase(c,p);
	}
	
	
	public String toString(){
		int i=0;
		int j=0;
		String s;
		s=(" ****  ****  ****  ****  ****  ****  ****  ****\n");
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				Coordonnees c =new Coordonnees(i,j);
				if(this.getCase(c)!=null){
					s=s+("|Pion|");
				}
				else{
					s=s+("|    |");
				}
			}
			s=s+"\n";
			}
			s=s+(" ****  ****  ****  ****  ****  ****  ****  ****\n");
			return s;
	}
}