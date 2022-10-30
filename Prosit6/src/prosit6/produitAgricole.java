package prosit6;

public abstract class produitAgricole extends Produit implements Critere{
  
    float quantite;
    String saison;

    public produitAgricole(int id, String libelle, String marque, float quantite, String saison, float prix) throws PrixNegatifException {
        super(id,libelle,marque,prix);
        this.quantite = quantite;
        this.saison = saison;
    }

    

  
    
    
}

