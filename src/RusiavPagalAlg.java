public class RusiavPagalAlg {

    public static void main(String[] args) {
        int[] U = { -10, 0, 2, 9, -5};
        int kuris; //  turintis mažiausią reikšmę
        int t; // sukeitimui
        for (int i = 0; i < U.length-1; i++) {
            kuris = i;
            for (int j = i + 1; j < U.length; j++) {
                if (U[j] > U[kuris]) kuris = j;
                }
            t = U[kuris];
            U[kuris] = U[i];
            U[i] = t;
        }
        System.out.println(U[0]);
    }
}


