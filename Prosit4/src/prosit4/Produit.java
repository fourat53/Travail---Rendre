package prosit4;

public class Produit {

     public int id;
     public String libelle, marque;
     public float prix;

    public Produit() {
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
    
    void afficher() {

        System.out.println("Identifiant: " + this.id + "\nLibellé: " + this.libelle + "\nMarque: " + marque + "\nPrix: " + this.prix);
    }

    @Override
    public String toString() {
        return "Produit{Identifant: " + this.id + ", Libellé: " + this.libelle + ", Marque: " + marque + ", Prix: " + this.prix+"}";
    }
    public boolean comparer(Produit p2){
        return ((this.id==p2.id)&&(this.libelle==p2.libelle)&&(this.prix==p2.prix));
    }
}
