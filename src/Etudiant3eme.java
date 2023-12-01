public class Etudiant3eme extends Etudiant {
    private String branche; 

    public Etudiant3eme(int identifiant, String nom, 
    String prenom, float moyenne, String branch) {
        super(identifiant, nom, prenom, moyenne);
        this.branche = branche;
    }

    public void ajouterUneAbsence() {
        moyenne = moyenne - 0.5f;
    }
   
}
