package prosit5;

public class produitFruit extends produitAgricole{
    
    public final String type;
    
    public produitFruit(int id, String libelle, String marque, String saison,float quantite,String type){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.saison=saison;
        this.quantite=quantite;
        this.type="Fruit";
    }
    
    public produitFruit(int id, String libelle, String saison,float quantite){
        this.id=id;
        this.libelle=libelle;
        this.saison=saison;
        this.quantite=quantite;
        this.type="Fruit";
    }  
     
}
