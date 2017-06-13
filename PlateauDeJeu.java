import java.io.*;
import java.util.*;

public class PlateauDeJeu{
	private Piece[] Echequier;
	private static final int NB_CASES=64;
	public static boolean tourJoueur=false;
	


	public PlateauDeJeu(){
		this.Echequier=new Piece[NB_CASES];
		this.init();
	}
	
	
	public void init(){
		Echequier[0]=new Tour(false,new Coordonnees(0,0));
		Echequier[1]=new Cavalier(false, new Coordonnees(0,1));
		Echequier[2]=new Fou(false, new Coordonnees(0,2));
		Echequier[3]=new Dame(false, new Coordonnees(0,3));
		Echequier[4]=new Roi(false, new Coordonnees(0,4));
		Echequier[5]=new Fou(false, new Coordonnees(0,5));
		Echequier[6]=new Cavalier(false, new Coordonnees(0,6));
		Echequier[7]=new Tour(false,new Coordonnees(0,7));
		Echequier[56]=new Tour(true,new Coordonnees(7,0));
		Echequier[57]=new Cavalier(true, new Coordonnees(7,1));
		Echequier[58]=new Fou(true, new Coordonnees(7,2));
		Echequier[59]=new Dame(true, new Coordonnees(7,3));
		Echequier[60]=new Roi(true, new Coordonnees(7,4));
		Echequier[61]=new Fou(true, new Coordonnees(7,5));
		Echequier[62]=new Cavalier(true, new Coordonnees(7,6));
		Echequier[63]=new Tour(true,new Coordonnees(7,7));
		Coordonnees c;
		for(int i=1;i<2;i++){
			for(int j=0;j<8;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Pion(false,c);
			}
		}
		for(int i=6;i>5;i--){
			for (int j=0;j<8 ;j++){
				c=new Coordonnees(i,j);
				Echequier[c.getIndice()]=new Pion(true,c);
			}	
		}
	}

	public Piece getCase(Coordonnees c){
		if(c.coordonneesValides())
			return Echequier[c.getIndice()];
		return null;
	}

	public void setCase(Coordonnees c,Piece p){
			Echequier[c.getIndice()]=p;
			if(!p.getCoordonnees().equals(c))
				Echequier[p.getCoordonnees().getIndice()]=null;	
			Echequier[c.getIndice()].setCoordonnees(c);
	}
	
	public void deplPiece(Coordonnees c,Piece p){
		if( c.coordonneesValides() && p.deplPossible(c, this)&& (!c.equals(p.getCoordonnees())) && tourJoueur==p.getEstNoir()){
			this.setCase(c,p);
			tourJoueur=!tourJoueur;
		}
		else{
			System.out.println("Vous ne pouvez pasfaire ce deplacement ! Recommencez Sempai :3");
		}
	}
	
	public Piece getRoi(boolean noir){
		for(int i =0;i<8;i++){
			for(int j=0;j<8;j++){
				if(this.getCase(new Coordonnees(i,j))!=null && this.getCase(new Coordonnees(i,j)) instanceof Roi && this.getCase(new Coordonnees(i,j)).getEstNoir()==noir)
					return this.getCase(new Coordonnees(i,j));
			}
		}
		return null;
	}
	
	public boolean echecEtMat(){
		if((((Roi)getRoi(true)).echecRoi(this)&&((Roi)getRoi(true)).cerneRoi(this))||
				(((Roi)getRoi(false)).echecRoi(this) && ((Roi)getRoi(false)).cerneRoi(this)))
			return true;
		return false;
		
	}
	
	public boolean egalitePartie(){
		int nbPiece=0;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(this.getCase(new Coordonnees(i,j))!=null)
					nbPiece++;
			}
		}
		return nbPiece==2;	
	}
	
	public void sauveguarde(){
        BufferedWriter bw=null;
        FileWriter fw=null;
        Piece p;
        try{
            fw=new FileWriter("Sauveguarde");
            bw=new BufferedWriter(fw);
            
            for(int i=0;i<8;i++)
            	for(int j=0;j<8;j++){
            		p=this.getCase(new Coordonnees(i,j));
            		if(p!=null)
            			bw.write(p.getType()+"\t"+p.getEstNoir()+"\t"+(p.getCoordonnees().getAbcisse()+"\t"+p.getCoordonnees().getOrdonnee())+"\n");
            	
            }
            bw.close();
            fw.close();
             
        }
        catch(IOException e){
            System.err.println("Sauveguarde Impossible");
        }
    }
	
	
	
	public void charger(){
        FileReader fr = null;
        try {
            fr = new FileReader("Sauveguarde");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader br=new BufferedReader(fr);
        String line = null;
        StringTokenizer st = null;
        try {
            line = br.readLine();
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String type;
        Piece p=null;
        for(int i=0;i<64;i++)
        	this.Echequier[i]=null;//effacer tout le tableau
        while(line!=null){
            st=new StringTokenizer(line,"\t");
            type=st.nextToken();

            switch(type){
            case "Pion":p=new Pion(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            case "Cavalier":p=new Cavalier(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            case "Tour":p=new Tour(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            case "Roi":p=new Roi(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            case "Dame":p=new Dame(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            case "Fou":p=new Fou(Boolean.getBoolean(st.nextToken()),new Coordonnees(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken(),Integer.parseInt(st.nextToken()))));
            }
            this.setCase(p.getCoordonnees(), p);
            try {
                line=br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             
             
        }
        try {
            br.close();
            fr.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }
	
	public String toString(){
		int i=0;
		int j=0;
		String s;
		s=(" ***  ***  ***  ***  ***  ***  ***  ***\n");
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				Coordonnees c =new Coordonnees(i,j);
				if(this.getCase(c)!=null){
					s=s+("|")+this.getCase(c).toString()+("|");
				}
				else{
					s=s+("|   |");
				}
			}
			s=s+"\n";
			}
			s=s+(" ***  ***  ***  ***  ***  ***  ***  ***\n");
			return s;
	}
}