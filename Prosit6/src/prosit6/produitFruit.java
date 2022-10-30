package prosit6;

public  class produitFruit extends produitAgricole{
    
    public produitFruit( int id, String libelle, String marque, float quantite, String saison, float prix) throws PrixNegatifException {
        super(id,libelle,marque,quantite, saison,prix);
    }

    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
    
}
