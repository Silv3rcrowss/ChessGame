public class Pion extends Piece{
	private boolean aBouge=false;
	private boolean estAuSud;

	public Pion(boolean noir,boolean estAuSud, Coordonnes c,){
		super(noir,c);
		this.estAuSud=estAuSud;
	}

	public boolean deplPossible(Coordonnes c){
		if(!aBouge && c.getOrdonnee()<=(this.getOrdonnee()+2 && 
			c.getAbcisse==this.getAbcisse && estAuSud){
			aBouge=true;
			return true;
		}
		else if()
	}

}