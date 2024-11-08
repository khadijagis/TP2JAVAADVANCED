public class Parite {
    static void verifierParite(int x) {
        
        if (x % 2 == 0) {
            System.out.println("Le nombre " + x + " est pair.");
        } else {
            System.out.println("Le nombre " + x + " est impair.");
        }
    }

    public static void main(String[] args) {
        int x =Integer.parseInt(args[0]);
        verifierParite(x);//conventionnominationmethodes

    }
}