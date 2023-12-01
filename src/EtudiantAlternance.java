public class EtudiantAlternance extends Etudiant {
    private int salaire; 

    public EtudiantAlternance(int identifiant, String nom, String prenom, float moyenne, int salaire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire = salaire;
    }
    
    public void ajouterUneAbsence() {
salaire = salaire - 50;     }

public String toString() {
    return "Etudaint "+super.toString()+"salaire"+this.salaire;
    
}


//getters 
public int getSalaire() {
    return salaire;
}

}













































//baha code 
