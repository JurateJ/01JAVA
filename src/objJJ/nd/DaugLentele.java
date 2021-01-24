package objJJ.nd;

public class DaugLentele {

    public static void main(String[] args) {
        System.out.println("---Daugybos lentelė---");
        int a = 1;
        for (int i = 1; i < 11; ++i) {
            for (int j = 1; j < 6; j++) {
                int sandauga = a * j;
                System.out.print( j + "x" + i + "=" + sandauga + " ");
            }
            System.out.println( " ");
            a++;
        }

    }

}


//DAUG LENTELE 1 stulpeliu
//public class DaugLentele {
//
//    public static void main(String[] args) {
//        System.out.println("---Daugybos lentelė---");
//        int a = 1;
//        for (int i = 1; i < 10; ++i) {
//
//            for (int j = 1; j < 10; j++) {
//                int sandauga = a * j;
//                System.out.println( a + "x" + j + "=" + sandauga);
//            }
//            a++;
//        }
//    }


