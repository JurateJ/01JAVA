package objJJ.intro;

public class Mokinas {

    public String name;  //null default
    public int level;   //0  default
    public String address;  //null default

    public Mokinas(String name) {
        this.name = name;
        this.level = 1;    // galima ir nurodyt this, bet nera
    }
    public Mokinas(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public Mokinas() {
        name="X";
        address= "Babtai";
    }
}
