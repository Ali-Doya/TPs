package ma.education.tp1.introduction;

public class Salle {
    public long id;
    public String nom;


    public Salle() {

    }

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle(String nom, long id) {
        this.nom = nom;
        this.id = id;
    }

}