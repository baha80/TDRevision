public class Etudiant {
    protected  int identifiant;
    protected String nom;
    protected String prenom;
    protected float moyenne;

    public Etudiant(int identifiant, String nom, String prenom, float moyenne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }
    //2
    public boolean equals(Object obj) {
        if (obj instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) obj;
            return this.identifiant == etudiant.identifiant;
        }
        return false;
    }
    public String toString() {
        return "Etudiant " + this.identifiant + " : " + this.nom + " " + this.prenom + " (" + this.moyenne + ")";
    }


    public void ajouterUneAbsence() {
        System.out.println("Absence ajoutée");
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public float getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    
}