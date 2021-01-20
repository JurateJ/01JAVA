import java.time.LocalDate;

public class MokinysRusiavimui {

    public static void main(String[] args) {

        Mokinys[] mokiniai = {null, null, null, null};
        System.out.println(mokiniai.length);

        Mokinys z1 = new Mokinys();
        z1.mklase = 1;
        z1.firstName = "Jonas";
        z1.lastName = "Jonaitis";
        mokiniai[0] = z1;

        Mokinys z2 = new Mokinys();
        z2.mklase = 2;
        z2.firstName = "Ona";
        z2.lastName = "One";
        mokiniai[1] = z2;

        Mokinys z3 = new Mokinys();
        z3.mklase = 5;
        z3.firstName = "Petras";
        z3.lastName = "Petraitis";
        mokiniai[2] = z3;

        Mokinys z4 = new Mokinys();
        z4.mklase = 1;
        z4.firstName = "Antanas";
        z4.lastName = "Jonaitis";
        mokiniai[3] = z4;

        for (Mokinys z : mokiniai) {
            if (z != null) {
                System.out.println(z.firstName + " " + z.lastName);
            } else {
                System.out.println("Neturime info apie zmogu");
            }
        }
//        int kuris; //  turintis mažiausią reikšmę
//        int t; // sukeitimui
//        for (int i = 0; i < U.length-1; i++) {
//            kuris = i;
//            for (int j = i + 1; j < U.length; j++) {
//                if (U[j] > U[kuris]) kuris = j;
//            }
//            t = U[kuris];
//            U[kuris] = U[i];
//            U[i] = t;
//        }
    }
}
class Mokinys {
    int mklase;
    String firstName;
    String lastName;
}
