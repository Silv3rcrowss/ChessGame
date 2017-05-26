public class Cavalier extends Piece{

	public Cavalier(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean deplPossible(Coordonnees c, PlateauDeJeu p) {
		Coordonnees b=new Coordonnees(this.getCoordonnees());
		b.setAbcisse(b.getAbcisse()+1);
		if(c.equals(b.getDiagD(1)) || c.equals(b.getDiagG(1)))
			return true;
		b.setAbcisse(b.getAbcisse()-2);
		if(c.equals(b.getDiagD(-1))|| (c.equals(b.getDiagG(-1))))
			return true;
		b.setAbcisse(b.getAbcisse()+1);
		b.setOrdonnee(b.getOrdonnee()-1);
		if(c.equals(b.getDiagG(1))|| c.equals(b.getDiagD(-1)))
			return true;
		b.setOrdonnee(b.getOrdonnee()-2);
		if(c.equals(b.getDiagD(1))|| c.equals(b.getDiagG(-1)))
			return true;
		return false;
		
		
		
	}
	

	public String toString(){
	if(this.getEstNoir())	
		return ("NCav");
	else
		return ("BCav");
	}
}
