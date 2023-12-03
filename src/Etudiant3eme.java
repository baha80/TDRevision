public class Etudiant3eme extends Etudiant {
    private String branche; 

    public Etudiant3eme(int identifiant, String nom, 
    String prenom, float moyenne, String branch) {
        super(identifiant, nom, prenom, moyenne);
        //this.branche = branche;
    }

    //getter 
    public String getBranche() {
        return branche;
    }

    public void ajouterUneAbsence() {
        moyenne = moyenne - 0.5f;
    }
   public String toString() {
       return "Etudiant "+super.toString()+"branche"+this.branche;
       
   }
}
