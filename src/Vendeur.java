public class Vendeur extends Employe {
    int tauxDeVente;
    public Vendeur(int id, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente=tauxDeVente;
    }



}