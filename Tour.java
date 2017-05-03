package echec;

public class Tour  extends Piece{

	public Tour(boolean noir, Coordonees c) {
		super(noir, c);
	}

	public boolean deplPossible(Coordonees c){
		if(this.getCoordonnees().abcisse!=c.abcisse && this.getCoordonnees().ordonnee==c.ordonnee || this.getCoordonnees().abcisse==c.abcisse && this.getCoordonnees().ordonnee!=c.ordonnee){
			return true;
		}
		else{
			return false;
		}
	}
}
