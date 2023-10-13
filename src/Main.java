import  java.util.Date;
import java.text.SimpleDateFormat ;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "Lait", "Delice");
        Produit p3 = new Produit(2510, "yaourt", "vitalait");
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.2f);
        Magasin Aziza =new Magasin(123,"Sousse",5);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = "28/09/2023"; // Example date string
        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        Produit p5 = new Produit(3879, "channel", "esprit",dateString);
        Aziza.addProduct(p5);
        Aziza.afficherCaracteristiques();
        int totalProducts = Aziza.getTotalNumberOfProducts();
        System.out.println("Total number of products: " + totalProducts);
        /*p1.afficher();
        System.out.println("*****************");
        p2.afficher();
        System.out.println("*****************");
        p3.afficher();
        System.out.println("*****************");
        p4.afficher();
        System.out.println("*****************");
        p5.afficher();*/

    }


}