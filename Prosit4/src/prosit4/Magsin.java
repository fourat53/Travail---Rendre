package prosit4;

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
    
    public boolean comparer(Produit p1, Produit p2){
        return ((p1.id==p2.id)&&(p1.libelle==p2.libelle)&&(p1.prix==p2.prix));
    } 
    
    public void ajouterProduit(Produit p){
        if (this.capacite<50){
            produits[this.capacite]=p;
            this.capacite++;
        }
        else{
            System.out.println("Tableau plein-----");
        }
    }
    
    public void ajouterEmployee(Employee e){
        if (this.nbEmployee<20){
            employees[this.nbEmployee]=e;
            this.nbEmployee++;
        }
        else{
            System.out.println("Tableau plein-----");
        }
    }
    
    public String toString(){
        String str="",ps,es;
        str="Magasin{Identifiant: "+this.id+", Adresse: "+this.adresse+", Capacité: "+this.capacite+", ";
        ps="\n        "+1+"er "+produits[0].toString()+", ";
        for (int i=1;i<this.capacite;i++){
           ps+="\n        "+(i+1)+"éme "+produits[i].toString()+", ";
        }
        es="\n        "+1+"er Employée-"+employees[0].toString()+", "; ;
        for (int i=1;i<this.nbEmployee;i++){
           es+="\n        "+(i+1)+"éme Employée-"+employees[i].toString()+", "; 
        }
        return str+ps+es+"}";
    }
    
}
        
