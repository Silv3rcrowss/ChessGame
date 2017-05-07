package echec;

public class Dame extends Piece{

	public Dame(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		boolean flag;
		Fou f= new Fou(this.getEstNoir(),this.getCoordonnees());
		Tour t= new Tour(this.getEstNoir(),this.getCoordonnees());
		
		flag=t.deplPossible(c, p);
		if(flag){
			flag=f.deplPossible(c, p);
		}
		else{
			return false;
		}
		
		return flag;
	}
}
