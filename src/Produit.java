public class Produit {
    private int id;
    private String libelle, marque;
    private float prix;
    private String dateExp;
    static int nbrproduits;

    Produit() {
    }

    Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        setPrix(prix);
    }

    Produit(int id, String libelle, String marque, String dateExp) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.dateExp = String.valueOf(dateExp);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for libelle
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Getter and Setter methods for marque
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Price cannot be negative. Setting price to 0.");
            this.prix = 0;
        }
    }


    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }

    void afficher() {
        System.out.println("L'id:" + id);
        System.out.println("Libelle:" + libelle);
        System.out.println("marque:" + marque);
        System.out.println("prix:" + prix);
        System.out.println("date:" + dateExp);
    }
    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id && this.libelle.equals(autreProduit.libelle) && this.prix == autreProduit.prix;
    }
}
