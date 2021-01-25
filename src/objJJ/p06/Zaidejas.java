package objJJ.p06;

public class Zaidejas {
    private String name;
    private int pinigai;

    public Zaidejas(String name) {
        this.name = name;
        pinigai = 100;
    }

    public String getName() {
        return name;
    }

    public int getPinigai() {
        return pinigai;
    }

//    public void setPinigai(int pinigai) {
//        this.pinigai = pinigai;
//    }
    // musu pinigai padideja, o zaidejo p pamazeja
    public void perdavimas(Zaidejas p, int pinigai) {
        this.pinigai += pinigai;
        p.pinigai -= pinigai;
    }

}
