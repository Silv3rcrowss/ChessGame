package echec;

public class Tour  extends Piece{

	public Tour(boolean noir, Coordonees c) {
		super(noir, c);
	}

	public boolean deplPossible(Coordonees c){
		if(this.getCoordonnees().getAbcisse!=c.abcisse && this.getCoordonnees()/getOrdonnee==c.ordonnee || this.getCoordonnees().getAbcisse==c.abcisse && this.getCoordonnees().getOrdonnee!=c.ordonnee){
			return true;
		}
		else{
			return false;
		}
	}
}
