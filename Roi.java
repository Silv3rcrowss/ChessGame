public class Roi extends Piece{

	public Roi(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}


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
	
	public boolean echecRoi(PlateauDeJeu p){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(p.getCase(new Coordonnees(i,j)).getEstNoir()!=this.getEstNoir() && p.getCase(new Coordonnees(i,j)).deplPossible(new Coordonnees(this.getCoordonnees()), p)){
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean dangerRoi(PlateauDeJeu p){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(this.deplPossible(new Coordonnees(i,j), p)){
					for(int x=0;x<8;x++){
						for(int y=0;y<8;y++){
							if(p.getCase(new Coordonnees(x,y))!=null && !p.getCase(new Coordonnees(x,y)).deplPossible(new Coordonnees(i,j), p));
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	
	public boolean échecEtMat(PlateauDeJeu p){
		return true;
	}
	


	public String toString() {
		if(this.getEstNoir())
			return (" \u2654 ");
		else
			return (" \u265A ");
	}
}
