
public class Drone extends Robot { public static int vol_max = 10000 ;
								   public static double remplissage = 30*60 ;
    
	public Drone(Case C){
		super(C) ;
		this.setVolumeEau();
		this.setVitesse(C.nature);
	}
								   
	public void setVolumeEau()
	{  this.voleau = vol_max ; }
    
	public void seDeplacer(Case endroit){ this.position = endroit ; } 
	
	public void setVitesse(NatureTerrain typeterrain){ this.vitesse = 150 ; }
	
	public void setTpsRempli(){ this.t_remp = remplissage ; }

	public void remplirReservoir(Carte C){ 	
	if (NatureTerrain.EAU.equals(this.position.nature))
	  { this.setVolumeEau() ;}
	return ;
	}
}
