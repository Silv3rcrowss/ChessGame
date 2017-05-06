package echec;

public class Chevalier extends Piece{

	public Chevalier(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		// TODO Auto-generated method stub
		return false;
	}
}
