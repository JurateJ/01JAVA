package objJJ.jj;

public class MokinysRusiavimui {

    public static void main(String[] args) {

        objJJ.jj.Mokinys[] mokiniai = {null, null, null, null};
        System.out.println(mokiniai.length);

        objJJ.jj.Mokinys z1 = new objJJ.jj.Mokinys();
        z1.mklase = 1;
        z1.firstName = "Jonas";
        z1.lastName = "Jonaitis";
        mokiniai[0] = z1;

        objJJ.jj.Mokinys z2 = new objJJ.jj.Mokinys();
        z2.mklase = 2;
        z2.firstName = "Ona";
        z2.lastName = "One";
        mokiniai[1] = z2;

        objJJ.jj.Mokinys z3 = new objJJ.jj.Mokinys();
        z3.mklase = 5;
        z3.firstName = "Petras";
        z3.lastName = "Petraitis";
        mokiniai[2] = z3;

        objJJ.jj.Mokinys z4 = new objJJ.jj.Mokinys();
        z4.mklase = 1;
        z4.firstName = "Antanas";
        z4.lastName = "Jonaitis";
        mokiniai[3] = z4;

        for (objJJ.jj.Mokinys z : mokiniai) {
            if (z != null) {
                System.out.println(z.firstName + " " + z.lastName);
            } else {
                System.out.println("Neturime info apie zmogu");
            }
        }
    }
}
class Mokinys {
    int mklase;
    String firstName;
    String lastName;
}
