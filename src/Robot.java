
public abstract class Robot { protected Case position ;
							  protected int voleau ; /*Volume d'eau encore disponible*/
							  protected int vitesse ;
							  protected double t_remp ;
							  
public Robot(Case C){
		this.position = C ;
}
							  
public void setPosition(Case position){ this.position = position ;}

public Case getPosition(){ return this.position ;}

public int getVolumeEau(){ return this.voleau ; }

public void deverserEau(int vol){
	this.voleau = voleau - vol ;
}

public double getVitesse(){
	return this.vitesse ; 
}

public String toString(){
	return "Type de Robot : "+this.getClass().getName()+"  Position :("+this.position.posligne+this.position.poscolonne+")" ;
}

/*Certaines méthodes sont définies abstraites : C'est normal car elle va être redéfinie par chacun des Robots*/

public abstract void setTpsRempli();

public abstract void setVolumeEau();

public abstract void setVitesse(NatureTerrain typeterrain);

public abstract void seDeplacer(Case endroit);

public abstract void remplirReservoir(Carte C);

}
