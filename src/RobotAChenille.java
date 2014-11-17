
public class RobotAChenille extends Robot {
							public static int vol_max = 2000 ;
							public static double remplissage = 5*60 ;

public RobotAChenille(Case C){
		super(C) ;
		this.setVolumeEau();
		this.setVitesse(C.nature);
}

public void setVolumeEau()
{  this.voleau = vol_max ; }

public void seDeplacer(Case endroit){     
	if ( NatureTerrain.EAU.equals(endroit.nature) || NatureTerrain.ROCHE.equals(endroit.nature) )
	return ;
	this.position = endroit ;
	this.setVitesse(endroit.nature);
	return ;}


public void setVitesse(NatureTerrain typeterrain){ if ( NatureTerrain.FORET.equals(typeterrain))
{ this.vitesse = 30 ; return ; }
		this.vitesse = 60 ; }

public void setTpsRempli(){ this.t_remp = remplissage ; }

public void remplirReservoir(Carte C){ 
	if(C.voisinExiste(this.position,Direction.NORD))
	{ if( NatureTerrain.EAU.equals(C.getVoisin(this.position,Direction.NORD).nature))
			{ this.setVolumeEau(); return ;}
	}
	
	if(C.voisinExiste(this.position,Direction.SUD))
	{ if( NatureTerrain.EAU.equals(C.getVoisin(this.position,Direction.SUD).nature))
			{ this.setVolumeEau(); return ;}
	}
	
	
	if(C.voisinExiste(this.position,Direction.EST))
	{ if( NatureTerrain.EAU.equals(C.getVoisin(this.position,Direction.EST).nature))
			{ this.setVolumeEau(); return ;}
	}
	
	if(C.voisinExiste(this.position,Direction.OUEST))
	{ if( NatureTerrain.EAU.equals(C.getVoisin(this.position,Direction.OUEST).nature))
			{ this.setVolumeEau(); return ;}
	}
	
	return ;
	}
	
}
