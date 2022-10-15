package prosit4;

public class Prosit4 {
    public static void main(String[] args) {
        
        System.out.println("1)a/******************************************************");
        
        Magsin Carrefour=new Magsin(1,"Centre-Ville");
        
        System.out.println("1)b/******************************************************");
        
        Magsin Monoprix=new Magsin(2,"Menzah 6");
        
        System.out.println("2)********************************************************");
        
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
        
        System.out.println("3)********************************************************");
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(v1.toString());
        System.out.println(r1.toString());
        System.out.println(c3.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        System.out.println(r2.toString());
        
        System.out.println("4)********************************************************");
        
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
        
        System.out.println("5)********************************************************");
        
        System.out.println(Carrefour.toString());
        System.out.println(Monoprix.toString());
        
        System.out.println("6)********************************************************");
        
        System.out.println("Le salaire de c1 est: "+c1.SalaireEmployee()+"DT");
        System.out.println("Le salaire de cé est: "+c2.SalaireEmployee()+"DT");
        System.out.println("Le salaire de v1 est: "+v1.SalaireEmployee()+"DT");
        System.out.println("Le salaire de r1 est: "+r1.SalaireEmployee()+"DT");
        System.out.println("Le salaire de c3 est: "+c3.SalaireEmployee()+"DT");
        System.out.println("Le salaire de v2 est: "+v2.SalaireEmployee()+"DT");
        System.out.println("Le salaire de v3 est: "+v3.SalaireEmployee()+"DT");
        System.out.println("Le salaire de v4 est: "+v4.SalaireEmployee()+"DT");
        System.out.println("Le salaire de r2 est: "+r2.SalaireEmployee()+"DT");
    }
    
}
