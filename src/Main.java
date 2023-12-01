// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      

        Etudiant3eme et1 = new Etudiant3eme(1, "Dupont", "Jean", 12.5f, "Math");
        EtudiantAlternance et2 = new EtudiantAlternance(2, "Dupont", "Jean", 12.5f, 1000);

        System.out.println(et1.equals(et2));

        System.out.println(et1);

        String str = "baha";
        System.out.println(str.equals(et1)); // false
        System.out.println(et1.equals(str)); // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class Etudiant (java.lang.String and Etudiant are in unnamed module of loader 'app')
        
     Ecole e = new Ecole("Ecole1");
     try {
        e.ajouterEtudiant(et2);
    } catch (EtudiantExcep e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        System.out.println(et1);
    }
        
    }
}