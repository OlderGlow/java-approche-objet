package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse = new AdressePostale(1,  "rue de la paix", 75000, "Paris");
        Personne p1 = new Personne("Dupont", "Jean", new AdressePostale(4, "rue de la paix", 49100, "Angers"));
        Personne p2 = new Personne("Yakas", "Patrice");
        p2.setAdresse(adresse);
        p2.getInfo();
    }
}
