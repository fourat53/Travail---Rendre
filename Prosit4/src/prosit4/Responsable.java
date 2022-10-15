package prosit4;

public class Responsable extends Employee{
    int prime;
    
    public Responsable(int id,String adresse,String nom,int nbr_heures,int prime){
        super(id,adresse,nom,nbr_heures);
        this.prime=prime;
    }
    
    @Override
    public String toString(){
        return "Responsable{"+super.toString()+", Prime: "+prime+"}";
    }
    
    @Override
    public float SalaireEmployee(){
        float salaire=prime;
        if (nbr_heures>160){
            salaire=160*10+(nbr_heures-160)*(10*(100+20)/100);
        }
        else{
            salaire=nbr_heures*10;
        }
        return salaire;
    }
}
