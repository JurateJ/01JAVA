package objJJ.p04;

public class P04U3 {
    // NEVEIKIA
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int[] w = {5};
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= x; j++) {
                if (i % j == 0 && x == j) {
                        w[y] = i;
                        y++;
                }
        }
        System.out.println(w[0]);
    }

    }
}
