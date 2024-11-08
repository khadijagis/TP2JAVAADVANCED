public class Multiplication {
    
    
        public static void afficherTable(int n) {
            int i = 1;
            while (i <= 10) {
                System.out.println(n + " x " + i + " = " + (n * i));
                i++;
            }
        }
    
        public static void main(String[] args) {
            if (args.length > 0) { // Vérification de la présence d'un argument
                int n = Integer.parseInt(args[0]);
                afficherTable(n);
            } else {
                System.out.println("Veuillez fournir un nombre en argument.");
            }
        }
    }
    

