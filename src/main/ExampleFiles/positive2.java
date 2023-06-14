public class Klasa1 {
    int a = 3;
    String string = "Ala ma kota";

    public static void main(String[] args) {
        System.out.println("Pierwsza klasa");
    }

    public void funkcja1(boolean a) {
        System.out.println("Funkcja1");
    }

    public static int funkcja2(int a, String b) {
        System.out.println("Funkcja2");
        return 3;
    }
}

class Klasa2 {

    public void funkcja3() {
        System.out.println("Funkcja3");
    }

    public static int funkcja4(int a, String b) {
        System.out.println("Funkcja4");
    }
}