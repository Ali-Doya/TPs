package ma.education.tp1.introduction;


public class Test {

    public static void main(String[] args) {


        Salle o2 = new Salle("salle informatique");
        Salle o3 = new Salle("Salle des cours", 2);

        System.out.println(o3.id + "" + o3.nom);
    }
}
