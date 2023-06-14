public class InstrukcjeWarunkoweIPetle {
    public static void main(String[] args) {
        int liczba = 10;
        int liczba2 = 12;
        boolean warunek = true;

        if (liczba > 5 || liczba2 >= 5) {
            System.out.println("Liczba jest większa od 5.");
        } else if (liczba < 5 && liczba2 <= 10) {
            System.out.println("Liczba jest mniejsza od 5.");
        } else {
            System.out.println("Liczba jest równa 5.");
        } else {
            System.out.println("jeden else za duzo");
        }
    }
}