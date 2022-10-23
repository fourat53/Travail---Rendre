package prosit5;

public class Vendeur extends Employee{
    float tauxDeVent;
    public Vendeur(int id,String adresse,String nom,int nbr_heures,float tauxDeVent){
        super(id,adresse,nom,nbr_heures);
        this.tauxDeVent=tauxDeVent;
    }
    
    @Override
    public String toString(){
        return "Vendeur{"+super.toString()+", Taux de Vente"+tauxDeVent+"}";
    }
    
    @Override
    public float SalaireEmployee(){
        return 450*(100+tauxDeVent)/100;
    }
}
