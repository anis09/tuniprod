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
    final int MAX_EMPLOYEES = 20;
    int nombreDeCaissiers;
    int nombreDeVendeurs;
    int nombreDeResponsables;

    Magasin() {
        this.category = new Produit[MAX_CAPACITY];
        this.caissiers = new Caissier[MAX_EMPLOYEES];
        this.vendeurs = new Vendeur[MAX_EMPLOYEES];
        this.responsables = new Responsable[MAX_EMPLOYEES];
    }

    Magasin(int id, String adresse, int capacity) {
        this.id = id;
        this.adresse = adresse;
        this.capacity = capacity;
        this.category = new Produit[MAX_CAPACITY];
        this.caissiers = new Caissier[MAX_EMPLOYEES];
        this.vendeurs = new Vendeur[MAX_EMPLOYEES];
        this.responsables = new Responsable[MAX_EMPLOYEES];
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
        return "id: " + this.id + "\n adresse: " + this.adresse + "\n capacite: " + this.capacity;
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

    public boolean addCaissier(Caissier caissier) {
        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            if (this.caissiers[i] == null) {
                this.caissiers[i] = caissier;
                return true;
            }
        }
        return false;
    }

    public boolean addVendeur(Vendeur vendeur) {
        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            if (this.vendeurs[i] == null) {
                this.vendeurs[i] = vendeur;
                return true;
            }
        }
        return false;
    }

    public boolean addResponsable(Responsable responsable) {
        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            if (this.responsables[i] == null) {
                this.responsables[i] = responsable;
                return true;
            }
        }
        return false;
    }
    public void afficherCaracteristiquesEmploye(int employeId) {
        for (Employe employe : caissiers) {
            if (employe != null && employe.id == employeId) {
                System.out.println("Caractéristiques de l'employé :");
                System.out.println("ID : " + employe.id);
                System.out.println("Nom : " + employe.nom);
                System.out.println("Adresse : " + employe.adresse);
                System.out.println("Nombre d'heures : " + employe.nbr_heures);
                if (employe instanceof Caissier) {
                    Caissier caissier = (Caissier) employe;
                    System.out.println("Numéro de caisse : " + caissier.numeroDeCaisse);
                } else if (employe instanceof Vendeur) {
                    Vendeur vendeur = (Vendeur) employe;
                    System.out.println("Taux de vente : " + vendeur.tauxDeVente);
                } else if (employe instanceof Responsable) {
                    Responsable responsable = (Responsable) employe;
                    System.out.println("Prime : " + responsable.prime);
                }
                return;
            }
        }

        System.out.println("Aucun employé avec l'ID " + employeId + " trouvé.");
    }


}
