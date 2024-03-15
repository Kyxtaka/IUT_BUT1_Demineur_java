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
        // a faire
        return 0;
    }

    @Override
    public String toString() {
        // a faire
        return " sfqfqsf "
    }
}
