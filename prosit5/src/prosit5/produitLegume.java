package prosit5;

public class produitLegume extends produitAgricole{
    
    public final String type;
    
    public produitLegume(int id, String libelle, String marque, String saison,float quantite,String type){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.saison=saison;
        this.quantite=quantite;
        this.type="Légume";
    }
    
    public produitLegume(int id, String libelle, String saison,float quantite){
        this.id=id;
        this.libelle=libelle;
        this.saison=saison;
        this.quantite=quantite;
        this.type="Légume";
    }  
}
