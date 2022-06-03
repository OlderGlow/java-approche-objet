package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("Dupont", "Jean", new AdressePostale(4, "rue de la paix", 49100, "Angers"));
        Personne p2 = new Personne("Dupond", "Pierre", new AdressePostale(5, "rue de la saucisse", 49100, "Angers"));
    }
}
