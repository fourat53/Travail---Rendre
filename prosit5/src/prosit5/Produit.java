package prosit5;

public class Produit {

     public int id;
     public String libelle, marque;
     public float prix;

    public Produit() {}
    
    public Produit(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    
    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if (this.prix>=0){        
            this.prix = prix;
        }
    }
    
    public String getLibelle (){
        return this.libelle;
    }
    
    public float getPrix (){
        return this.prix;
    }
    
    @Override
    public String toString() {
        return "Produit{Identifant: " + this.id + ", Libellé: " + this.libelle + ", Marque: " + marque + ", Prix: " + this.prix+"}";
    }
    public boolean comparer(Produit p2){
        return ((this.id==p2.id)&&(this.libelle.equals(p2.libelle))&&(this.prix==p2.prix));
    }
    
    public String determinerTypeProduit(Produit p){
        if (p instanceof produitFruit){
            return "Fruit";
        }else if (p instanceof produitLegume){
            return "Légume";
        }else{
            return "Autre";
        }
    }
    
}
