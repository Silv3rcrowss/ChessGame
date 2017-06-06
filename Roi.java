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
	
	public boolean échecEtMat(PlateauDeJeu p){
		return true; // si pour tout les deplacements possible du roi un deplacement d'une pièce adverse y est possible !
					// Et OUI MON GARRRS BOUCLE IMBRIQUE ET C'EST REGLEEE!
	}

	@Override
	public String toString() {
		if(this.getEstNoir())
			return (" \u2654 ");
		else
			return (" \u265A ");
	}
}
