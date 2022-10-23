package prosit5;

public class produitLaitier extends Produit {
    
    public String saison;
    
     public produitLaitier(){}
    
    public produitLaitier(int id, String libelle, String marque,float prix, String saison){
        super(id,libelle,marque,prix);
        this.saison=saison;
    }
}
