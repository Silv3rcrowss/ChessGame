public class Tour extends Piece{

	public Tour(boolean noir, Coordonnees c) {
		super(noir, c);
	}

	public boolean deplPossible(Coordonnees c, PlateauDeJeu p){

		int i=0;
		boolean flag=true;

		if(this.getCoordonnees().getAbcisse()!=c.getAbcisse() && this.getCoordonnees().getOrdonnee()==c.getOrdonnee()){
			
			while(i<c.getAbcisse() || flag){
				if(p.getCase(new Coordonnees(c.getOrdonnee(),i))==null){
					i++;
				}
				else{
					flag=false;
				}
			}
			if(i==c.getAbcisse() && p.getCase(c)!=null){
				if(p.getCase(c).getEstNoir()==this.getEstNoir()){
					return false;
				}
				return true;
			}
			return flag;
		}
		
		if(this.getCoordonnees().getAbcisse()==c.getAbcisse() && this.getCoordonnees().getOrdonnee()!=c.getOrdonnee()){
			
			while(i<c.getOrdonnee() || flag){
				if(p.getCase(new Coordonnees(i,c.getAbcisse()))==null){
					i++;
				}
				else{
					flag=false;
				}
			}
			if(i==c.getOrdonnee() && p.getCase(c)!=null){
				if(p.getCase(c).getEstNoir()==this.getEstNoir()){
					return false;
				}
				return true;
			}
			return flag;
		}
		return false;
	}
}