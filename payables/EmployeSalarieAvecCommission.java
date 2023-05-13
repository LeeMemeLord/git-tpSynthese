//
// TODO 01-- Ajoutez tout le code nécessaire pour coder la classe au complet coder la classe au completen vous basant sur le diagramme UML
//         ainsi que la gestion des erreurs possibles si nécessaire
//
package payables;
public class EmployeSalarieAvecCommission extends EmployeSalarie implements Commission{
    private double tauxCommission;
    private double venteBrutes;


    public EmployeSalarieAvecCommission(int ID,String nom,String nas,double salaireHebdomadaire,double tauxCommission, double venteBrutes, String memo){
        super(ID,nom,nas,salaireHebdomadaire,memo);
        this.tauxCommission =tauxCommission;
        this.venteBrutes = venteBrutes;
    }
    @Override
    public double getTauxCommission() {
        return this.tauxCommission;
    }

    @Override
    public double getVentesBrutes() {
        return this.venteBrutes;
    }

    public void setTauxCommission(double tauxCommission) {
        if(tauxCommission >= 0.0)
            this.tauxCommission = tauxCommission;
        else
            throw new IllegalArgumentException("Le taux de commission doit etre >= 0.0");
    }

    public void setVentesBrutes(double venteBrutes) {
        if(venteBrutes >= 0.0)
            this.venteBrutes = venteBrutes;
        else
            throw new IllegalArgumentException("une vente brute doit etre >= 0.0");
    }

    @Override
    public double getMontantCommission(double ventesBrutes) {
        return ventesBrutes * (tauxCommission/100);
    }

    @Override
    public double getMontantPaiement(){
        double salaireHebdomadaire = getSalaireHebdomadaire();
        double montantCommission = getMontantCommission(getVentesBrutes());
        return salaireHebdomadaire + montantCommission ;
    }
}
