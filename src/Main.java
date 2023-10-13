import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Magasin magasin1 = new Magasin(1, "Carrefour", 25);
        Magasin magasin2 = new Magasin(2, "Monoprix", 12);
        Caissier caissier1 = new Caissier(1, "Jean", "Adresse1", 160, 1);
        Vendeur vendeur1 = new Vendeur(2, "Alice", "Adresse2", 160, 15);
        Responsable responsable1 = new Responsable(3, "Paul", "Adresse3", 160, 500);
        Caissier caissier2 = new Caissier(4, "Lucie", "Adresse4", 180, 2);
        Vendeur vendeur2 = new Vendeur(5, "Martin", "Adresse5", 150, 12);
        Vendeur vendeur3 = new Vendeur(6, "Sophie", "Adresse6", 170, 14);
        Responsable responsable2 = new Responsable(7, "Marie", "Adresse7", 200, 600);
        magasin1.addCaissier(caissier1);
        magasin1.addVendeur(vendeur1);
        magasin1.addResponsable(responsable1);
        magasin2.addCaissier(caissier2);
        magasin2.addVendeur(vendeur2);
        magasin2.addVendeur(vendeur3);
        magasin2.addResponsable(responsable2);
        System.out.println("Caractéristiques des employés du magasin 1 :");
        magasin1.afficherCaracteristiquesEmploye(caissier1.id);

        System.out.println("\nCaractéristiques des employés du magasin 2 :");
        magasin2.afficherCaracteristiquesEmploye(vendeur2.id);
        Produit produit1 = new Produit(1, "Lait", "Delice", 2.5f);
        Produit produit2 = new Produit(2, "Pain", "Pain du jour", 1.2f);
        Produit produit3 = new Produit(3, "Yaourt", "Vitalait", 1.8f);

        magasin1.addProduct(produit1);
        magasin1.addProduct(produit2);
        magasin2.addProduct(produit3);
        System.out.println("\nDétails du magasin 1 :");
        magasin1.afficherCaracteristiques();
        System.out.println("\nDétails du magasin 2 :");
        magasin2.afficherCaracteristiques();



        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = "28/09/2023"; // Example date string
        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
            System.out.println("\nDétails du magasin 1 après ajout de produit avec date :");
            magasin1.afficherCaracteristiques();
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
