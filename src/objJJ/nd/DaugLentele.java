package objJJ.nd;

public class DaugLentele {

    static void stulpeliai(int c, int d) {
        int a = 1;
        for (int i = 1; i <= 10; ++i) {
            for (int j = c; j <= d; j++) {
                int sandauga = a * j;
                System.out.print(j + "x" + i + "=" + sandauga + "\t");
            }
            System.out.println("  ");
            a++;
        }
    }
    public static void main(String[] args) {
        System.out.println("--Daugybos lentelė--");
        stulpeliai(1,5);
        System.out.println( " ");
        stulpeliai(6,10);
    }
}

//DAUGYBOS LENTELE 1 stulpeliu
//public class DaugLentele {
//
//    public static void main(String[] args) {
//        System.out.println("---Daugybos lentelė---");
//        int a = 1;
//        for (int i = 1; i < 10; ++i) {
//            for (int j = 1; j < 10; j++) {
//                int sandauga = a * j;
//                System.out.println( a + "x" + j + "=" + sandauga);
//            }
//            a++;
//        }
//    }


