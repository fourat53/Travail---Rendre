package prosit5;

public class Caissier extends Employee {
    int numeroDeCaisse;  
    
    public Caissier(int id,String adresse,String nom,int nbr_heures,int numeroDeCaisse){
        super(id,adresse,nom,nbr_heures);
        this.numeroDeCaisse=numeroDeCaisse;
    }
    
    @Override
    public String toString(){
        return "Caissier{"+super.toString()+", Numero de Caisse: "+numeroDeCaisse+"}";
    }
    
    @Override
    public float SalaireEmployee(){
        float salaire;
        if (nbr_heures>180){
            salaire=180*5+(nbr_heures-180)*(5*(100+15)/100);
        }
        else{
            salaire=nbr_heures*5;
        }
        return salaire;
    }
}
