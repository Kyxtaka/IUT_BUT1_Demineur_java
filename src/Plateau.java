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
        for (int i = 0;i<this.nbLignes; i++) {
            List<CaseIntelligente> ligneCasesIntelligentes = new ArrayList<>();
            for (int k = 0;k<this.nbColonnes; k++) {
                ligneCasesIntelligentes.add(new CaseIntelligente());
            }
            this.lePlateau.add(ligneCasesIntelligentes);
        }

    }

    private void rendLesCasesIntelligentes() {
        for (int i = 0; i < this.lePlateau.size(); i++) {
            for (int k = 0; k < this.lePlateau.get(i).size(); k++) {
                CaseIntelligente caseActuelle =  this.lePlateau.get(i).get(k);
                //ajout case en haut
                if ( --i >= 0) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(--i).get(k));
                }
                //ajout case en bas
                if (++i <= this.getNbLignes()-1) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(++i).get(k));
                }
                // ajoute case a gauche
                if (--k >= 0) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(i).get(--k));
                }
                //ajoute case a droite
                if (++k <= this.getNbColonnes()-1) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(i).get(++k));
                }
                // ajoute la case diagonale : en haut a gauche 
                if (--i >= 0 && --k >= 0) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(--i).get(--k));
                }
                // ajoute la case diagonale : en bas a gauche 
                if (++i <= this.getNbLignes()-1 && --k >= 0) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(++i).get(--k));
                }
                // ajoute la case diagonale : en haut a droite 
                if (--i >= 0 && ++k <= this.getNbColonnes()-1) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(--i).get(++k));
                }
                // ajoute la case diagonale : en bas a droite 
                if (++i <= this.getNbLignes()-1 && ++k <= this.getNbColonnes()-1) {
                    caseActuelle.ajouteVoisine(this.lePlateau.get(++i).get(--k));
                }
            }
        }
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
        return this.nbLignes;
    }

    public int getNbColonnes() {
        return this.nbColonnes;
    }

    public int getNbTotalBombes() {
        return this.nbBombes;
    }

    public int getNbCasesMarquees() {
        int nbCasesMarquees = 0;
        for (List<CaseIntelligente> row: this.lePlateau) {
            for (CaseIntelligente uneCase: row) {
                if (uneCase.estMarquee()) nbCasesMarquees++;
            }
        }
        return nbCasesMarquees;
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
