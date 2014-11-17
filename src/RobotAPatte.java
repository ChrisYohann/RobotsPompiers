
public class RobotAPatte extends Robot {  
	public static int vol_max = Integer.MAX_VALUE ;
	public static double remplissage = 10*60 ;

public RobotAPatte(Case C){
	super(C) ;
	this.setVolumeEau();
	this.setVitesse(C.nature);
}	

public void setVolumeEau()
{  this.voleau = vol_max ; }

public void seDeplacer(Case endroit){     
if ( NatureTerrain.EAU.equals(endroit.nature) )
{return ;}
this.position = endroit ;
this.setVitesse(endroit.nature);
return ; }

public void deverserEau(int vol){ return ; }

public void setVitesse(NatureTerrain typeterrain){ this.vitesse = 30 ;
if (NatureTerrain.ROCHE.equals(typeterrain))
	this.vitesse = 10 ;
	return ;
	}

public void setTpsRempli(){ this.t_remp = remplissage ; }

public void remplirReservoir(Carte C){ return ;
}

	
	

}
