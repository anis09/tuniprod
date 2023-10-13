public class Caissier extends Employe {
    int numeroDeCaisse;
    public Caissier(int id, String nom, String adresse, int nbr_heures,int numeroDeCaissed) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse=numeroDeCaisse;
    }

}