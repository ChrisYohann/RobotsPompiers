import java.awt.Color;

import ihm.*;


public class Simulateur implements Simulable {
	
	private int nbLignes ;
	private int nbColonnes ;
	private IGSimulateur ihm ;
	private long date = 0 ;
	private Carte map ;
	
		
	public Simulateur(int lig,int col,Carte map){
			this.setNbLignes(lig) ;
			this.setNbColonnes(col) ;
			this.map = map ;
			this.ihm = new IGSimulateur(lig,col,this) ;
			dessine();
	}
	
	public void setNbLignes(int nbLignes){
		if (nbLignes<=0) return ;
		this.nbLignes = nbLignes ;
	}
	
	public void setNbColonnes(int nbColonnes){
		if (nbColonnes<=0) return ;
		this.nbColonnes = nbColonnes ;
	}
	
	public void next(){
		date++;
		System.out.println("TODO: avancer la simulation \"d'un pas de temps\": " + date);
		System.out.println("  => Petit test classique");
		dessine();
	}
	public void restart() {
		System.out.println("TODO: remettre le simulateur dans son état initial");
		date = 0;
		dessine();
	    // mettre a jour l'affichage
	}
	
	public void draw_case(Case endroit){ int lig,col ;
		lig = endroit.poscolonne ;
		col = endroit.posligne ;
		NatureTerrain nature = endroit.nature ;
		
		if(NatureTerrain.EAU.equals(nature))
		try{ ihm.paintBox(lig, col, Color.CYAN); }
		catch (MapIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		if(NatureTerrain.FORET.equals(nature))
			try{ ihm.paintBox(lig, col, Color.GREEN); 
			ihm.paintImage(lig, col, "images/foret.png", 0.8, 0.8)	;}
			catch (MapIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		
		if(NatureTerrain.ROCHE.equals(nature))
			try{ ihm.paintBox(lig, col, Color.GRAY); 
			ihm.paintImage(lig, col, "images/stone.png", 0.8, 0.8) ;}
			catch (MapIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		
		if(NatureTerrain.TERRAIN_LIBRE.equals(nature))
			try{ ihm.paintBox(lig, col, Color.white);
			//ihm.paintImage(lig, col, "images/road.png", 0.8, 0.8) ;
			}
			catch (MapIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		
		if(NatureTerrain.HABITAT.equals(nature))
			try{ ihm.paintImage(lig, col, "images/habitat.png", 0.8, 0.8); }
			catch (MapIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		
		return ;
		
	}
	
	private void dessine(){ int i,j ;
	int dimx = this.map.mcase.length ;
	int dimy = this.map.mcase[0].length ;
	
	for (i=0 ; i<dimx ; i++)
	{ for (j=0 ; j<dimy ; j++)
			draw_case(this.map.mcase[i][j]);
	}
	
     return ;		
	}
	

}
