public class MultiplicationDeuxMatrice {
    public static void main(String[] args) {
       int[][] matrice1 = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] matrice2 = { { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        }; 

        int[][] resultat = new int[2][2];

        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice2[0].length; j++) {
                resultat[i][j] = 0;
                for (int k = 0; k < matrice1[0].length; k++) {
                    resultat[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }

        System.out.println("Matrice résultat (2x2) :");
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[0].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
