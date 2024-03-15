import java.util.List;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{

    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<List<CaseIntelligente>> lePlateau;

    public Plateau(int nbLignes,int nbColonnes,int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = 0;
        this.nbBombes = 0;
    }

    private void creerLesCasesVides() {
        this.lePlateau = new ArrayList<>();
        for (int i;i<this.nbLignes; i++) {
            List<CaseIntelligente> ligneCasesIntelligentes = new ArrayList<>();
            for (int k;k<this.nbColonnes; k++) {
                ligneCasesIntelligentes.add(new CaseIntelligente());
            }
            this.lePlateau.add(ligneCasesIntelligentes);
        }

    }

    private void rendLesCasesIntelligentes() {
        // a faire 
        // rend les cases intelligente
    }

    protected void poseDesBombesAleatoirement(){
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }

    public int getNbLignes() {
        // a faire
        return 0;
    }

    public int getNbColonnes() {
        //A faire
        return 0;
    }

    public int getNbTotalBombes() {
        //A faire
        return 0;
    }

    public int getNbCasesMarquees() {
        // A faire
        return 0;
    }
    
    public CaseIntelligente getCase(int numLigne,int numColonne) {
        //A faire
        return new CaseIntelligente();
    } 

    public void poseBombe(int x, int y) {

    }

    public void reset() {

    }
 
}
