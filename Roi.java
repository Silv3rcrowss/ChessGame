package echec;

public class Roi extends Piece{

	public Roi(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		int j= this.getCoordonnees().getAbcisse();
		int i= this.getCoordonnees().getOrdonnee();
		Coordonnees co = new Coordonnees();
		
		if(c.equals(co.setCoordonnees(i+1, j)) || c.equals(co.setCoordonnees(i+1, j+1))
		|| c.equals(co.setCoordonnees(i+1, j-1)) || c.equals(co.setCoordonnees(i-1, j-1))
		|| c.equals(co.setCoordonnees(i, j-1)) || c.equals(co.setCoordonnees(i, j+1))
		|| c.equals(co.setCoordonnees(i-1, j+1)) || c.equals(co.setCoordonnees(i-1, j))){
			return true;
		}
		return false;
	}
	
	public String toString(){
		if(this.getEstNoir())
			return ("NRoi");
		else
			return ("BRoi");
	}
}
