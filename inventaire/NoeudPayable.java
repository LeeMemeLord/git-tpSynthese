package inventaire;

import payables.Payable;

public class NoeudPayable {
    public Payable peyable;
    private NoeudPayable suivant;


    public NoeudPayable(Payable payable, NoeudPayable suivant){
        this.peyable = payable;
        this.suivant =suivant;
    }

    public NoeudPayable getNoeudSuivant() {
        return suivant;
    }

    public void setNoeudSuivant(NoeudPayable suivant) {
        this.suivant = suivant;
    }
}
