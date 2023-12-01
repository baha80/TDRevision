public class Ecole {
    public String nom;
    private Etudiant[] tableauEtudiants;
    private int nombreEtudiants =500;


    public Ecole(String nom, Etudiant[] tableauEtudiants) {
        if (nombreEtudiants <= 500){
            this.nom = nom;
        }
        else{
            System.out.println("vous avez dépassé le nombre d'etudiants autorisés");
        }
        this.tableauEtudiants = tableauEtudiants;
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
public void ajouterEtudiant(Etudiant etudiant) {
    if (recherche_Etudiant(etudiant) != -1) {
        throw new RuntimeException("Etudiant déjà inscrit à l'école");
    }

    if (nombreEtudiants < tableauEtudiants.length) {
        tableauEtudiants[nombreEtudiants++] = etudiant;
    } else {
        // Handle resizing or throw an exception for reaching maximum capacity
        throw new RuntimeException("Capacité maximale d'étudiants atteinte");
    }
}




 











}
