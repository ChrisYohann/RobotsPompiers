
import java.io.FileNotFoundException;

public class TestLecteurDonnees {

	public static void main(String[] args) {
		
		Carte carte=new Carte();
		int[][] tab_incen=new int[8][8];
		Robot[][] tab_robot= new Robot[8][8];
		if (args.length < 1) {
			System.out.println("Syntaxe: java TestLecteurDonnees <nomDeFichier>");
			System.exit(1);
		}
		
		try {
			LecteurDonnees.lire(args[0],carte,tab_incen,tab_robot);
			
		} catch (FileNotFoundException e) {
			System.out.println("fichier " + args[0] + " inconnu ou illisible");
		} catch (ExceptionFormatDonnees e) {
			System.out.println("\n\t**format du fichier " + args[0] + " invalide: " + e.getMessage());
		}
		
		int i,j;
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				if(tab_robot[i][j]!=null){
				System.out.println(tab_robot[i][j]);

				}
			}
		}
		
	}
	


}
 
