package echec;

public class Roi extends Piece{

	public Roi(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		// TODO Auto-generated method stub
		return false;
	}
}
