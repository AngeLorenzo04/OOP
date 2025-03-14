package esempio_classi;

public class Main {
    public static void main(String[] args) {
        Patient p = new Patient(80.7, 23, "marco");
        Patient p1 = new Patient(60.7, 14, "anna");
        System.out.println("age p : " + p.age);
        p1.walk();
    }
}
