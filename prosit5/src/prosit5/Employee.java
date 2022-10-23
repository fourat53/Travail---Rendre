package prosit5;

public abstract class Employee {
    int id;
    String nom;
    String adresse;
    int nbr_heures;
    
    public Employee(int id, String nom,String adresse,int nbr_heures){
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        this.nbr_heures=nbr_heures;
    }
    
    @Override
    public String toString(){
        return "Identifiant: "+id+", Adresse: "+adresse+", Nom: "+nom+"Nombre d'heures: "+nbr_heures;
    }
    
    public abstract float SalaireEmployee();
}
