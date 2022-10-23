package prosit5;

public abstract class produitAgricole extends Produit {
    
    public String saison;
    public float quantite;
    
    public produitAgricole(){}
    
    public produitAgricole(int id, String libelle, String marque,float prix, String saison,float quantite){
        super(id,libelle,marque,prix);
        this.saison=saison;
        this.quantite=quantite;
    }
    
    public produitAgricole(int id, String libelle, String saison,float quantite){
        super(id,libelle);
        this.saison=saison;
        this.quantite=quantite;
    }
    
}
