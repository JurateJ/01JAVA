package objJJ.p05;

import objJJ.intro.Mokinas;   // tik sita irasius galima nenaudot pilno kelio

public class U1 {
    public static void main(String[] args) {
        System.out.println( U1.class.getName() );

//        Mokinas[] mokiniai = new Mokinas[] {
//                new Mokinas(),
//                new Mokinas( "Jurgis", 3 ),
//                new Mokinas( "Ona"),
////                new Mokinas( "J", 1),
//                new Mokinas( "Antanas"),
//                new Mokinas( "Maryte", 2)
//        };
////        for (Mokinas m : mokiniai) {
////            System.out.println(m.name + " " + m.level + " " + m.address) ;
////        }
//        mokiniai[0].name="Zose";
//        mokiniai[0].level=3;

        Mokinas[] mokiniai = readFromDB();

        System.out.println("----Pradiniai duomenys------");
        print(mokiniai);
        // surusiuoti pagal klase
        for (int i=0; i<mokiniai.length-1; i++) {
            for (int j=i+1; j<mokiniai.length; j++) {

//                if (mokiniai[i].level > mokiniai[j].level) {
//                    Mokinas tmp = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = tmp;
//                }
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    Mokinas tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }
        }
//        for (Mokinas m : mokiniai) {
//            System.out.println(m.name + " " + m.level + " " + m.address) ;
//        }
        System.out.println("----Surusiuota pagal klase------");
        print(mokiniai);
    }
    static void print(Mokinas[] mokiniai) {
        for (Mokinas m : mokiniai) {
            System.out.println(m.getName() + " " + m.getLevel()) ;
        }
    }
    static int compare(Mokinas m1, Mokinas m2) {
        if (m1.getLevel() < m2.getLevel()) return -1;
        if (m1.getLevel() > m2.getLevel()) return 1;
        // jei abieju klases lygios
        return m1.getName().compareTo(m2.getName());
    }
    // fja nuskaitys is DB ir grazins mokiniu masyva
    static Mokinas [] readFromDB () {
        Mokinas[] mokiniai = new Mokinas[] {
//                new Mokinas(),
                new Mokinas( "Jurgis", "Juragaitis", 3 ),
                new Mokinas( "Ona", "Onaite"),
//                new Mokinas( "J", 1),
                new Mokinas( "Antanas", "Antanaitis"),
                new Mokinas( "Maryte", "Marytaite" ,2)
        };
//        mokiniai[0].setName(null); //"Zose";
//        mokiniai[0].setLevel(0);



        return mokiniai;

    }
}
