public class Tour extends Piece{

	public Tour(boolean noir, Coordonnees c) {
		super(noir, c);
	}

	public boolean deplPossible(Coordonnees c,PlateauDeJeu j){

		if(this.getCoordonnees().getAbcisse()!=c.getAbcisse() && this.getCoordonnees().getOrdonnee()==c.getOrdonnee() || this.getCoordonnees().getAbcisse()==c.getAbcisse() && this.getCoordonnees().getOrdonnee()!=c.getOrdonnee()){
			if(j.getCase(c)==null){
				return true;
			}
			
			else if(j.getCase(c)!=null){
				if(j.getCase(c).getEstNoir()==this.getEstNoir()){
					return false;
				}
				else{
					return true;
				}
			}
		}
		else{
			return false;
		}
		
	}
}