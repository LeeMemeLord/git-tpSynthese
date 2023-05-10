package payables;

public class Facture extends Payable {
	private final String numeroPiece;
	private String descriptionPiece;
	private int quantite;
	private double prixParItem;

	public Facture(int id, String numero, String description, int nombre, double prix, String memo) {
		super(id, memo);
		categorie = Categorie.Facture;
		numeroPiece = numero;
		descriptionPiece = description;
		setQuantite(nombre);
		setPrixParItem(prix);
	}

	public String getNumeroPiece() {
		return numeroPiece;
	}

	public String getDescriptionPiece() {
		return descriptionPiece;
	}

	public void setDescriptionPiece(String description) {
		descriptionPiece = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int nombre) {
		if (nombre >= 0)
			quantite = nombre;
		else
			throw new IllegalArgumentException("La quantité doit être >= 0");
	}

	public double getPrixParItem() {
		return prixParItem;
	}



	//
	// TODO 05-- Ajoutez les méthodes nécessaires en vous basant sur le diagramme UML
	//  		que la gestion des erreurs possibles si nécessaire.
	//
	@Override
	public double getMontantPaiement() {
		return quantite * prixParItem;
	}


	public void setPrixParItem(double prixParItem0){
		this.prixParItem = prixParItem0;
	}

	@Override
	public String toString() {
		return "Facture{" +
				"numeroPiece='" + numeroPiece + '\'' +
				", descriptionPiece='" + descriptionPiece + '\'' +
				", quantite=" + quantite +
				", prixParItem=" + prixParItem +
				", categorie=" + categorie +
				", echeanceJours=" + echeanceJours +
				", memo='" + memo + '\'' +
				'}';
	}

	public String toStringAffichage() {
		String affichage = "";
		return affichage;
	}
	public String toStringSauvegarde() {
		String info = String.format("ID [%3d] Numéro [%15s] Description [%25s] Nombre [%3d] Prix [%10.2f] Mémo [%15s] Catégorie [%20s]",
				this.getID(), this.numeroPiece, this.getDescriptionPiece(), this.getQuantite(), this.getPrixParItem(), this.getMemo(), this.getCategorieString());
		return info;
	}
}
