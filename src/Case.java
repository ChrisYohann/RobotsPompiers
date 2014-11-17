
public class Case { protected int posligne ;
					protected int poscolonne ;
					protected NatureTerrain nature ;
					
public Case(int ligne,int colonne){
	this.setLigne(ligne) ;
	this.setColonne(colonne) ;
	return ;
}
					
public void setLigne(int i){ this.posligne = i ;}

public void setColonne(int j){this.poscolonne = j ;}

public void setNatureTerrain(NatureTerrain nature)
{ this.nature = nature ; }
					   
public int getLigne(){ return this.posligne ;}

public int getColonne(){ return this.poscolonne ;}

public NatureTerrain getNature(){return this.nature ;}

}
