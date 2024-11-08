public class SommeNombre {
    
        static int calculerSomme(int nbr) {
            int somme = 0;
            for (int i = 1; i <= nbr; i++) {
                somme += i;
            }
            return somme;
        }
    
        
        
        public static void main(String[] args){
            int nbr = Integer.parseInt(args[0]);
            int sum = calculerSomme(nbr);
            System.out.println("La somme des nombres de 1 à "+nbr+" est : "+sum );
    
    }
    }
    
    

