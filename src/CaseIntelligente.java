import java.util.List;
import java.util.ArrayList;

public class CaseIntelligente extends Case {

    private List<Case> lesVoisines;
    
    public CaseIntelligente() {
        super();
        this.lesVoisines = new ArrayList();
    }

    public void ajouteVoisine(Case uneCase) {
        this.lesVoisines.add(uneCase);
    }

    public int nombreBombesVoisines() {
        int compteur = 0;
        for (Case voisine: this.lesVoisines) {
            if (voisine.contientUneBombe()) {
                compteur++;
            }
        }
        return compteur;
    }

    @Override
    public String toString() {
        if (this.estMarquee() == false && this.estDecouverte() == false) {
            return " ";
        } 
        else if (this.estMarquee()) {
            return "?";
        }
        else {
            if (this.contientUneBombe()) return "@";
            else {
                int nbBombes = 0;
                for (Case uneCase: this.lesVoisines) {
                    if (uneCase.contientUneBombe()) nbBombes++;
                }
                return ""+nbBombes;
            }
        }
    }
}
