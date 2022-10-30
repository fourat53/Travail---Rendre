package prosit6;

public class produitLegume extends produitAgricole {

    String[] mois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre", "Janvier"};

    public produitLegume(int id, String libelle, String marque, float quantite, String saison, float prix) throws PrixNegatifException {
        super(id,libelle,marque,quantite,saison,prix);
    }

    @Override
    public boolean estFrais(String saison) {
        int indexOfSaison = 0;
        for (int i = 0; i < mois.length - 1; i++) {
            if (mois[i].equals(this.saison)) {
                indexOfSaison = i;
            }
        }
        if (saison.equals(mois[indexOfSaison]) || saison.equals(mois[indexOfSaison + 1])) {
            return true;
        }
        return false;

    }

}

