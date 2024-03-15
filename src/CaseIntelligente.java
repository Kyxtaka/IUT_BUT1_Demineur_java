import java.util.List;
import java.util.ArrayList;

public class CaseIntelligente extends Case {

    private List<Case> lesVoisines;
    
    public CaseIntelligente() {
        super();
        this.lesVoisines = new ArrayList();
    }

    public void ajouteVoisine(Case uneCase) {
        this.lesVoisines.add(uneCase)
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
        return "Les Cases voisine"+" "this.lesVoisines;
    }
}
