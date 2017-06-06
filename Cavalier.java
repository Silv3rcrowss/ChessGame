public class Cavalier extends Piece{

	public Cavalier(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		Coordonnees d=this.getCoordonnees();
		return ((Math.abs(c.getAbcisse()-d.getAbcisse())==2 && Math.abs(c.getOrdonnee()-d.getOrdonnee())==1)||
				((Math.abs(c.getOrdonnee()-d.getOrdonnee())==2) && Math.abs(c.getAbcisse()-d.getAbcisse())==1)&& 
				p.getCase(c).getEstNoir()!=this.getEstNoir());
		
	}
	


	public String toString(){
	if(this.getEstNoir())	
		return (" \u2658 ");
	else
		return (" \u265E ");
	}
}
