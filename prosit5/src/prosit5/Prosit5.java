package prosit5;

public class Prosit5 {

    public static void main(String[] args) {
        
        Magsin Carrefour=new Magsin(1,"Centre-Ville");
        Magsin Monoprix=new Magsin(2,"Menzah 6");
        
        Caissier c1=new Caissier(1432,"Melek","Aouina",155,12);
        Caissier c2=new Caissier(2789,"Aya","Naser",192,5);
        Vendeur v1=new Vendeur(3458,"Haythem","Centre_Ville",151,11.5f);
        Responsable r1=new Responsable(4785,"Yassine","Ariana",175,350);
        
        Carrefour.ajouterEmployee(c1);
        Carrefour.ajouterEmployee(c2);
        Carrefour.ajouterEmployee(v1);
        Carrefour.ajouterEmployee(r1);
        
        Caissier c3=new Caissier(5785,"Ayham","Sokra",111,9);
        Vendeur v2=new Vendeur(6458,"Ahmed","Centre_Ville",167,21.5f);
        Vendeur v3=new Vendeur(7784,"Nizar","Menzah 9",185,25.2f);
        Vendeur v4=new Vendeur(8745,"Nathir","Menzah 5",146,13.7f);
        Responsable r2=new Responsable(9134,"Karim","Kram",201,400);
        
        Monoprix.ajouterEmployee(c3);
        Monoprix.ajouterEmployee(v2);
        Monoprix.ajouterEmployee(v3);
        Monoprix.ajouterEmployee(r2);
        
        Produit p1 = new Produit(4084,"Chocolat","Said",1.45f);
        Produit p2 = new Produit(1021, "Lait", "Delice");
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.2f);
        
        Carrefour.ajouterProduit(p1);
        Carrefour.ajouterProduit(p2);
        Carrefour.ajouterProduit(p4);
        
        Monoprix.ajouterProduit(p1);
        Monoprix.ajouterProduit(p3);
        Monoprix.ajouterProduit(p4);
        
        Produit P1 = new produitFruit(1254,"Fraise","Mars",12.3f);
        Produit P2 = new produitFruit(1224,"Pastèque","Juin",50f);
        Produit P3 = new produitFruit(7896,"Mandarine","Décembre",25.6f);
        Produit P4 = new produitLegume(8521,"Artichauts","Janvier",14f);
        
        Carrefour.ajouterProduit(P1);
        Carrefour.ajouterProduit(P2);
        Carrefour.ajouterProduit(P3);
        Carrefour.ajouterProduit(P4);
        
        System.out.println(Carrefour.toString());
                
    }
    
}
