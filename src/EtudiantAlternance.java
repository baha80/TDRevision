public class EtudiantAlternance extends Etudiant {
    private int salaire; 

    public EtudiantAlternance(int identifiant, String nom, String prenom, float moyenne, int salaire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire = salaire;
    }
    
    public void ajouterUneAbsence() {
salaire = salaire - 50;     }

public String toString() {
        return "Etudiant " + this.identifiant + " : " + this.nom + " " + this.prenom + " (" + this.moyenne + ") " + this.salaire;
    }
    
}













































//baha code 
