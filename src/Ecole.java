public class Ecole {
    public String nom;
    private Etudiant[] tableauEtudiants;
   // private final int nombreEtudiants =500;
    public int comp = 0;


    public Ecole(String nom) {
        
            this.nom = nom;
        
    }
//13
 
// public void ajouterEtudiant(Etudiant etudiant) {
//     if (nombreEtudiants <= 500){
//         tableauEtudiants[nombreEtudiants] = etudiant;
//         nombreEtudiants++;
//     }
//     else{
//         System.out.println("vous avez dépassé le nombre d'etudiants autorisés");
//     }
  

// }
//14
public int recherche_Etudiant (Etudiant e){
    for (int i = 0; i < tableauEtudiants.length; i++) {
        if (tableauEtudiants[i].equals(e)) {
            return i;
        }
    }
    return -1;
}
//implémenter la méthode ajouterEtudiant() qui permet d’affecter un étudiant à l’école sachant que l’étudiant peut s’inscrire qu’une fois à l’école,
public void ajouterEtudiant(Etudiant etudiant) throws EtudiantExcep {
    if (recherche_Etudiant(etudiant) != -1) {
        throw new RuntimeException("Etudiant déjà inscrit à l'école");
    }

    if (comp < tableauEtudiants.length) {
        tableauEtudiants[comp] = etudiant;
        comp++;
    }else {
        throw new EtudiantExcep("Nombre d'étudiants dépassé");
    }
}

    public float getMoyenneDes3A() {
        float moyenne = 0;
        int nombreEtudiants = 0;
        for (int i = 0; i < comp; i++) {
            if (tableauEtudiants[i] instanceof Etudiant3eme && ((Etudiant3eme) tableauEtudiants[i]).getBranche().equals("Math")) {
                moyenne += tableauEtudiants[i].getMoyenne();
                nombreEtudiants++;
            }
        }
        return moyenne / nombreEtudiants;
    }


    //moyenne slaire 
    public float getMoyenneSalaireAlternance() {
        float moyenne = 0;
        int nombreEtudiants = 0;
        for (int i = 0; i < comp; i++) {
            if (tableauEtudiants[i] instanceof EtudiantAlternance) {
                moyenne += ((EtudiantAlternance) tableauEtudiants[i]).getSalaire();
                nombreEtudiants++;
            }
        }
        return moyenne / nombreEtudiants;
    }

    public String toString() {
        String str = "Ecole " + this.nom + " :\n";
        for (int i = 0; i < comp; i++) {
            str += tableauEtudiants[i] + "\n";
        }
        return str;
    }
    public boolean supprimer (Etudiant etd){
        boolean trouve = false;
        for (int i = 0; i < tableauEtudiants.length; i++) {
            if (tableauEtudiants[i].equals(etd)) {
                trouve = true;
                for (int j = i; j < tableauEtudiants.length-1; j++) {
                    tableauEtudiants[j] = tableauEtudiants[j+1];
                }
                comp--;
            }
        }
        return trouve;
        
    }
    public void changerEcole(Etudiant etd, Ecole e) throws EtudiantExcep {
        e.ajouterEtudiant(etd);
        this.supprimer(etd);
}




}











