public class Fou extends Piece{

	public Fou(boolean noir, Coordonnees c) {
		super(noir, c);
		// TODO Auto-generated constructor stub
	}

	public boolean deplPossible(Coordonnees c, PlateauDeJeu p){

		int i=0;
		int j,k;
		boolean flag=true;

		if(this.getCoordonnees().appatienDiagDB(c)){
			i=1;
		}
		
		if(this.getCoordonnees().appatienDiagDH(c)){
			i=2;
		}
		
		if(this.getCoordonnees().appatienDiagGB(c)){
			i=3;
		}
		
		if(this.getCoordonnees().appatienDiagGH(c)){
			i=4;
		}
		
		if(i==0){
			return false;
		}
		
		Coordonnees co=new Coordonnees(this.getCoordonnees());
		
		if(i==1){
			j=c.getAbcisse()+1;
			k=c.getOrdonnee()+1;
			co.setAbcisse(j);
			co.setOrdonnee(k);
			
			while(co!=c){
				co.setAbcisse(j+1);
				co.setOrdonnee(k+1);
				
				if(p.getCase(co)!=null){
					return false;
				}
				}
			if(co==c && p.getCase(c).getEstNoir()==this.getEstNoir()){
				return false;
			}
			return true;
		}
		
		else if(i==2){
			j=c.getAbcisse()-1;
			k=c.getOrdonnee()+1;
			co.setAbcisse(j);
			co.setOrdonnee(k);
			
			while(co!=c && flag){
				co.setAbcisse(j-1);
				co.setOrdonnee(k+1);
				
				if(p.getCase(co)!=null){
					return false;
				}
				}
			if(co==c && p.getCase(c).getEstNoir()==this.getEstNoir()){
				return false;
			}
			return true;
		}
		
		else if(i==3){
			j=c.getAbcisse()+1;
			k=c.getOrdonnee()-1;
			co.setAbcisse(j);
			co.setOrdonnee(k);
			
			while(co!=c && flag){
				co.setAbcisse(j+1);
				co.setOrdonnee(k-1);
				
				if(p.getCase(co)!=null){
					return false;
				}
				}
			if(co==c && p.getCase(c).getEstNoir()==this.getEstNoir()){
				return false;
			}
			return true;
		}
		
		else if(i==4){
			j=c.getAbcisse()-1;
			k=c.getOrdonnee()-1;
			co.setAbcisse(j);
			co.setOrdonnee(k);
			
			while(co!=c && flag){
				co.setAbcisse(j-1);
				co.setOrdonnee(k-1);
				
				if(p.getCase(co)!=null){
					return false;
				}
				}
			if(co==c && p.getCase(c).getEstNoir()==this.getEstNoir()){
				return false;
			}
			return true;
		}

		return false;
	}
}