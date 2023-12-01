public abstract class Etudiant {
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
if (obj == null) return false;
        if (obj == this) return true;
        if( obj.getClass() != this.getClass()) return false;

        Etudiant et = (Etudiant) obj;
        if (et.identifiant == this.identifiant && et.nom == this.nom ) {
             
            return true;
        }return false;
        // if (obj instanceof Etudiant) {
        //     Etudiant etudiant = (Etudiant) obj;
        //     return this.identifiant == etudiant.identifiant;
        // }
        // return false;
    }

    public String toString() {
        return "Etudiant " + this.identifiant + " : " + this.nom + " " + this.prenom + " (" + this.moyenne + ")";
    }


    public abstract void ajouterUneAbsence();
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