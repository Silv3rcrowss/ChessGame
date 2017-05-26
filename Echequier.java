
public class Echequier {

	public static void main(String[] args) {
		PlateauDeJeu p=new PlateauDeJeu();
		Pion x=new Pion(false, false, new Coordonnees(0,0));
		p.setCase(new Coordonnees(0,1) , x);
		Pion y=new Pion(true,true,new Coordonnees(0,0));
		p.setCase(new Coordonnees(5,2),y);
		System.out.println(p);
		Coordonnees c=new Coordonnees(1,1);
		p.setCase(c, x);
		System.out.println(p);
		c.setCoordonnees(2, 2);
		p.deplPiece(c, x);
		p.deplPiece(new Coordonnees(4,2),y);
		p.deplPiece(new Coordonnees(2,2),y);
		System.out.println(p);
		Fou f=new Fou(true,new Coordonnees(6,2));
				
	
	}

}
