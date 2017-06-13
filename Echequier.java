import java.util.*;

public class Echequier {

	public static void main(String[] args) {
		PlateauDeJeu p=new PlateauDeJeu();
		/*Pion x=new Pion(false, false, new Coordonnees(0,0));
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
		Fou f=new Fou(true,new Coordonnees(5,3));
		p.setCase(new Coordonnees(2,2),f);
		System.out.println(p);
		Cavalier cav=new Cavalier(true, new Coordonnees(0,0));
		p.setCase(new Coordonnees(5,5), cav);
		p.deplPiece(new Coordonnees(3,4),cav);
		System.out.println(p);
		p.deplPiece(new Coordonnees(1,6),cav);*/
		int i,j;
		Scanner input=new Scanner(System.in);
		System.out.println(p);
		System.out.println("1000 pour arrêter le jeu\n100 Pour Charger Une Partie");
		do{
			System.out.println("Saisir Ligne de Départ");
			i=input.nextInt();
			System.out.println("Saisir Colonne de Départ");
			j=input.nextInt();
			if(i==100 || j==100)
				p.charger();
			Coordonnees dep=new Coordonnees(i,j);
			System.out.println("Saisir Ligne d'Arrivée");
			i=input.nextInt();
			System.out.println("Saisir Colonne d'Arrivée");
			j=input.nextInt();
			Coordonnees arr=new Coordonnees(i, j);
			p.deplPiece(arr, p.getCase(dep));
			System.out.println(p);
			p.sauveguarde();
		}while(/*!p.echecEtMat()||*/ (i==1000 || j==1000) || !p.egalitePartie());
		
		if(i==1000 || j==1000){
			System.out.println("Partie Arrêté");
		}
		else if(p.egalitePartie()){
			System.out.println("Partie Terminée ! Egalité !"); 
		}
		else if(p.tourJoueur){
			System.out.println("Partie Terminée ! Gagnant: Joueur 1");
		}
		else
			System.out.println("Partie Terminée ! Gagnant Joueur 2");
	}

}
