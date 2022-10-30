package prosit6;

public class Magsin {
    
    int id;
    String adresse;
    int capacite;
    Produit[] produits;
    private int nbEmployee;
    Employee[] employees;
    
    public Magsin(){}
    
    public Magsin(int id, String adresse){
        this.id=id;
        this.adresse=adresse;
        this.capacite=0;
        this.produits=new Produit[50];
        this.nbEmployee=0;
        this.employees=new Employee[20];
    }
    
    public Magsin comparer(Magsin m) {
        if (this.capacite >= m.capacite) {
            return this;
        } else {
            return m;
        }
    }
    
    public void ajouterEmployee(Employee e){
        if (this.nbEmployee<20){
            employees[this.nbEmployee]=e;
            this.nbEmployee++;
        }
        else{
            System.out.println("Tableau d'employées plein-----");
        }
    }
    
    @Override
    public String toString(){
        String str,ps,es;
        str="";
        str="Magasin{Identifiant: "+this.id+", Adresse: "+this.adresse+", Capacité: "+this.capacite+", ";
        ps="\n        "+1+"er "+produits[0].toString()+", ";
        for (int i=1;i<this.capacite;i++){
           ps+="\n        "+(i+1)+"éme "+produits[i].toString()+", ";
        }
        es="\n        "+1+"er Employée-"+employees[0].toString()+", "; 
        for (int i=1;i<this.nbEmployee;i++){
           es+="\n        "+(i+1)+"éme Employée-"+employees[i].toString()+", "; 
        }
        return str+ps+es+"}";
    }
    
    public boolean chercher(Produit p) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }
      
    public void ajouterProduit(Produit p) throws MagasinPleinException {
        if (this.capacite == 50) {
            throw (new MagasinPleinException("Tableau de produits plein------"));
        } else {
            if (this.chercher(p)) {
                System.out.println("Produit Existant");
            } else {
                this.produits[capacite] = p;
                this.capacite++; 
                System.out.println("Produit Ajouté");
            }
        }

    }
    
     public float calculStock(Produit p){
        float quantiteTotale=0;
        for (int i=0;i<this.capacite;i++){
            if (p instanceof produitFruit){
                if (produits[i].id==p.id){
                    quantiteTotale+=((produitFruit) produits[i]).quantite;
                }
            }
        }return quantiteTotale;
     }
     
     public float calculStock() {
        float total = 0;
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].determinerTypeProduit().equals("Fruit")) {
                total += ((produitFruit) this.produits[i]).quantite;
            }
        }

        return total;
    }
}
        
