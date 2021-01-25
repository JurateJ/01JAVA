package objJJ.p06;

public class Zaidimas {
    public static void main(String[] args) {
        Zaidejas a = new Zaidejas("A");
        Zaidejas b = new Zaidejas("B");
        System.out.println(a.getName() + " " + a.getPinigai());
        System.out.println(b.getName() + " " + b.getPinigai());
        a.perdavimas(b, 33);
//         B sumoka A 33 eu
//        a.setPinigai(a.getPinigai() + 33);
//        b.setPinigai(b.getPinigai() - 33);
        System.out.println(a.getName() + " " + a.getPinigai());
        System.out.println(b.getName() + " " + b.getPinigai());
    }
}
