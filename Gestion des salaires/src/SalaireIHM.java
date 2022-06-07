import fr.diginamic.gestionsalaire.entite.*;

public class SalaireIHM {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("2","rue de la paix", "75000", "Paris");
        Contact contact = new Contact("0650287234", "dem@gmail.com");
        Employe arthur = new Employe("PINHEIRO", "Adrien", "1972515217212", adresse, contact,"S871212", Metier.TECHNICIEN);
        if(arthur.getMetier() == Metier.CADRE) {
            Cadre cadre = new Cadre(250);
            double salaireBrut = cadre.calculerSalaireBrut();
            double salaireNet = cadre.calculerSalaireNet();
            arthur.setSalaire(cadre);
        } else if(arthur.getMetier() == Metier.COMMERCIAL) {
            Commercial commercial = new Commercial(5000000);
            double salaireBrut = commercial.calculerSalaireBrut();
            double salaireNet = commercial.calculerSalaireNet();
            arthur.setSalaire(commercial);
        } else if (arthur.getMetier() == Metier.TECHNICIEN) {
            Technicien technicien = new Technicien(100, 10);
            double salaireBrut = technicien.calculerSalaireBrut();
            double salaireNet = technicien.calculerSalaireNet();
            arthur.setSalaire(technicien);
        }
        System.out.println("Employé : " + arthur.getNom().toUpperCase() + " " + arthur.getPrenom());
        System.out.println("Matricule : " + arthur.getMatricule());
        System.out.println("Métier : " + arthur.getMetier());
        System.out.println(arthur.getSalaire());
        System.out.println("Numéro de sécurité sociale : " + arthur.getNumSecuriteSociale());
        System.out.println("Adresse : " + arthur.getAdresse().getNumeroRue() + " " + arthur.getAdresse().getRue() + " " + arthur.getAdresse().getCodePostal() + " " + arthur.getAdresse().getVille());
        System.out.println("Contact : " + arthur.getContact().getNumeroTelephone() + " - " + arthur.getContact().getEmail());
    }
}
