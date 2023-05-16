package inventaire;
import exceptions.*;
import payables.*;

public class GestionnaireInventaire {
    private BaseDonnees baseDonnees;
    //
    // TODO 07-- Ajoutez tout le code nécessaire en vous basant sur le diagramme UML
    //         ainsi que la gestion des erreurs possibles si nécessaire
    //
    public GestionnaireInventaire(){
        baseDonnees = new BaseDonnees();
    }
    public void ajouterPayable(Payable payable) throws ExceptionPayableExisteDeja{
        baseDonnees.inserer(payable);
    }
    public void retirerPayable(int ID) throws ExceptionPayableIntrouvable{
        baseDonnees.enlever(ID);
    }
    public Payable getPayable(int ID) throws ExceptionPayableIntrouvable {
        Payable payable = baseDonnees.trouverParID(ID);
        if (payable != null)
            return payable;
        else
            throw new ExceptionPayableIntrouvable(ID);
    }

    public Payable[] getTableauPayables() {
        return baseDonnees.getTableauPayables();
    }

    public void augmenterEcheancePayable(int ID) throws ExceptionPayableIntrouvable {
        Payable payable = baseDonnees.trouverParID(ID);
        if (payable != null) {
            payable.augmenterEcheance(1);
        } else {
            throw new ExceptionPayableIntrouvable(ID);
        }
    }

    public void diminuerEcheancePayable(int ID) throws ExceptionPayableIntrouvable, ExceptionEcheanceInsuffisante {
        Payable payable = baseDonnees.trouverParID(ID);
        if (payable != null) {
            payable.diminuerEcheance(1);
        } else {
            throw new ExceptionPayableIntrouvable(ID);
        }
    }
}
