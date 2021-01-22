package objJJ.intro;

public class Rusiavimas {
    // NEBAIGTAS   - nuo didz iki maziausio,
    public static void main(String[] args) {
        int[] m = { -10, 0, 2, 9, -5};
        int[] m2 = m;
        int x = m[0];
        int k = 0;
        for (int i = 1; i < m.length; ++i) {
            if (x<m[i]) {
                x = m[i];
                System.out.println(x);
                m2[k] = m[i];
                k++;
            }
        }

    }
}

