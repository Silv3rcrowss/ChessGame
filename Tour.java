package echec;

public class Tour extends Piece{

	public Tour(boolean noir, Coordonees c) {
		super(noir, c);
	}

	public boolean deplPossible(PlateauDeJeu j,Coordonees c){

		if(this.getCoordonnees().getAbcisse()!=c.abcisse && this.getCoordonnees().getOrdonnee()==c.ordonnee || this.getCoordonnees().getAbcisse()==c.abcisse && this.getCoordonnees().getOrdonnee()!=c.ordonnee){
			if(j.getCase(c)==null){
				return true;
			}
			
			else if(j.getCase(c)!=null){
				if(j.getCase(c).estNoir==this.estNoir){
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
