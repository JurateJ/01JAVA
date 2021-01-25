package objJJ.p06.mokykla;

class Mokytojas extends Bendri {
    private String dalykas;
    private int kabinetas;
    // private Tvarkarastis mokyttvarkarastis;   nerasom, cia sudetingesnis objektas

    public Mokytojas() {
        System.out.println("Mokytojaas()");
    }


    //get + set

    public String getDalykas() {
        return dalykas;
    }
    public void setDalykas(String dalykas) {
        this.dalykas = dalykas;
    }

    public int getKabinetas() {
        return kabinetas;
    }

    public void setKabinetas(int kabinetas) {
        this.kabinetas = kabinetas;
    }
}
