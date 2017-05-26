package echec;

public class Dame extends Piece{

	public Dame(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {

		Fou f= new Fou(this.getEstNoir(),this.getCoordonnees());
		Tour t= new Tour(this.getEstNoir(),this.getCoordonnees());
		
		if(t.deplPossible(c, p) && f.deplPossible(c, p)){
			return true;
		}
		
		return false;
	}
	
		public String toString(){
		if(this.getEstNoir()==true){
			return ("NDam");
		}
		if(this.getEstNoir()==false){
			return ("BDam");
		}
		return null;
	}
}
