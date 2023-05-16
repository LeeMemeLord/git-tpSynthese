package inventaire;

import payables.Payable;

public class NoeudPayable extends Payable{
    public Payable payable;
    private NoeudPayable suivant;


    public NoeudPayable(Payable payable, NoeudPayable suivant){
        super(payable.getID());
        this.payable = payable;
        this.suivant =suivant;
    }

    public NoeudPayable getNoeudSuivant() {
        return suivant;
    }

    public void setNoeudSuivant(NoeudPayable suivant) {
        this.suivant = suivant;
    }

    @Override
    public double getMontantPaiement() {
        return payable.getMontantPaiement();
    }

    @Override
    public String toStringSauvegarde() {
        return null;
    }
}
