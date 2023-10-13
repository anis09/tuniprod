public class Magasin {
    int id;
    String adresse;
    int capacity;
    Produit[] category;
    final int MAX_CAPACITY = 50;
    int nombreDeProduits;
    Caissier[] caissiers;
    Vendeur[] vendeurs;
    Responsable[] responsables;

    Magasin() {
        this.category = new Produit[MAX_CAPACITY];
    }

    Magasin(int id, String adresse, int capacity) {
        this.id = id;
        this.adresse = adresse;
        this.capacity = capacity;
        this.category = new Produit[MAX_CAPACITY];
    }

    boolean addProduct(Produit p) {
        for (int i = 0; i < this.capacity; i++) {
            if (this.category[i] == null) {
                this.category[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.capacity; i++) {
            if (this.category[i] != null) {
                str += this.category[i].getLibelle() + this.category[i].getPrix();
            }
        }
        return "id :" + this.id + "\n adresse" + this.adresse + "\n capacite" + this.capacity;
    }

    public void afficherCaracteristiques() {
        System.out.println("ID du magasin : " + this.id);
        System.out.println("Adresse du magasin : " + this.adresse);
        System.out.println("Capacité du magasin : " + this.capacity);
        System.out.println("Liste des produits du magasin :");

        for (int i = 0; i < this.capacity; i++) {
            if (this.category[i] != null) {
                System.out.println("Nom du produit : " + this.category[i].getMarque());
                System.out.println("Prix du produit : " + this.category[i].getPrix());
            }
        }
    }
    public int getTotalNumberOfProducts() {
        int total = 0;
        for (int i = 0; i < this.capacity; i++) {
            if (this.category[i] != null) {
                total++;
            }
        }
        return total;
    }
    public boolean chercherProduit(Produit produit) {
        for (int i = 0; i < nombreDeProduits; i++) {
            if (category[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }
}
