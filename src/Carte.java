
public class Carte { protected Case[][] mcase ;
					 protected int sizecase ;
					 protected int Nblig ;
					 protected int Nbcol ;

public Carte(){ Case[][] matrice = new Case[8][8] ;
				this.Nblig = 8 ;
				this.Nbcol = 8 ;
				int i ; int j ;
				/*for (i=0 ; i<8 ; i++)
				{ for (j=0 ; j<8 ; j++)
					 this.mcase[i][j] = new Case(i,j) ;}*/
				this.mcase = matrice ;
				this.sizecase = 10000 ;
}

public Carte(int nblig, int nbcol, int sizecase){ int i , j ;
				Case[][] matrice = new Case[nblig][nbcol] ;
				this.mcase = matrice ;
				this.sizecase = sizecase ;
				this.Nblig = nblig ;
				this.Nbcol = nbcol ;
				/*for (i=0 ; i<nblig ; i++)
				{ for (j=0 ; j<nbcol ; j++)
				this.mcase[i][j] = new Case(i,j) ;
				}*/
				return ;
				
}

public int getNbLignes(){ return this.mcase.length ;}

public int getNbColonnes(){ return this.mcase[0].length ;}

public int getTailleCases(){return this.sizecase ; }

public Case getCase(int lig, int col){
		if (lig >= 0 && lig <= this.mcase.length && col >= 0 && col <= this.mcase[0].length)
				{ return this.mcase[lig][col] ;}
		else { System.out.println("Vous �tes hors limite") ;
			 return null ; }
	
}

public boolean voisinExiste(Case source,Direction sens){ int lig, col ;
				lig = source.getLigne() ;
				col = source.getColonne() ;
	
	   if ( Direction.NORD.equals(sens) && lig-1 >= 0 )
	   { return true ;}
       
	   if (Direction.EST.equals(sens) && col+1 < this.mcase[0].length)
	   { return true ; }
	   
	   if (Direction.OUEST.equals(sens) && col-1 >= 0)
	   { return true ;}
	   
	   if (Direction.SUD.equals(sens) && lig+1 < this.mcase.length)
	   { return true ;}
	   
	   return false ;
	   		
}

public Case getVoisin(Case source, Direction sens){ int lig, col ;
			lig = source.getLigne() ;
			col = source.getColonne();
	   if (voisinExiste(source,sens)){
		   if (Direction.NORD.equals(sens))
		   { return this.mcase[lig-1][col] ; }
	       if (Direction.EST.equals(sens))
	       { return this.mcase[lig][col+1] ;}
	       if (Direction.OUEST.equals(sens))
	       { return this.mcase[lig][col-1] ;}
	       if (Direction.SUD.equals(sens))
	       { return this.mcase[lig+1][col] ;}
	     }
	   return null ;
}


}
