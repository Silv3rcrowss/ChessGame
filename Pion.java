public class Pion extends Piece{
	private boolean aBouge=false;

	public Pion(boolean noir, Coordonnees c){
		super(noir,c);
	}

	public boolean deplPossible(Coordonnees c,PlateauDeJeu p){
		Coordonnees b=this.getCoordonnees();
		if(c.coordonneesValides()){
			if(this.getEstNoir()){
				if((c.getAbcisse()<=(b.getAbcisse()-2)|| c.getAbcisse()<=b.getAbcisse()-1) && c.getOrdonnee()==b.getOrdonnee() && p.getCase(c)==null){
					if(!aBouge || c.getAbcisse()==(b.getAbcisse()-1)){
						aBouge=true;
						return true;
					}
					return false;
				}
				else if(c.equals(b.getDiagD(1)) || c.equals(b.getDiagG(1))&& p.getCase(c)!=null && p.getCase(c).getEstNoir()!=this.getEstNoir()){
					return true;
				}
				else
					return false;
			}
			else {
				if((c.getAbcisse()>=(b.getAbcisse()+2)|| c.getAbcisse()<=b.getAbcisse()-1)&& c.getOrdonnee()==b.getOrdonnee()&& p.getCase(c)==null){
					if(!aBouge || c.getAbcisse()==b.getAbcisse()+1){
						aBouge=true;
						return true;
					}
					else
						return false;
				}
				else if(c.equals(b.getDiagD(-1)) || c.equals(b.getDiagG(-1))&& p.getCase(c)!=null && p.getCase(c).getEstNoir()!=this.getEstNoir())
					return true;
				else
					return false;
			
				}
		}
		return false;
	}
	

	public String toString(){
		if(this.getEstNoir())
			return (" \u2659 ");
		else
			return (" \u265f ");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Pion";
	}


}