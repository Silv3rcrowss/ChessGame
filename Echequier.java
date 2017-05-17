
public class Echequier {

	public static void main(String[] args) {
		PlateauDeJeu p=new PlateauDeJeu();
		Pion x=new Pion(false, false, new Coordonnees(0,0));
		p.setCase(new Coordonnees(0,1) , x);
		System.out.println(p);
		Coordonnees c=new Coordonnees(1,1);
		p.setCase(c, x);
		System.out.println(p);
		c.setCoordonnees(3, 1);
		p.deplPiece(c, x);
		System.out.println(p);
		
	}

}
