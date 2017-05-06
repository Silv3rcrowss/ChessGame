package echec;

public class Dame extends Piece{

	public Dame(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		// TODO Auto-generated method stub
		return false;
	}
}
