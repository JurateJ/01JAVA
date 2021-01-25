package objJJ.p06.mokykla;

class Bendri {

    private String vardas;
    private String pavarde;
    private String ak;
    private String telef;
    private String emailas;
    private Adresas adresas;

    public Bendri() {
        System.out.println("Bendri()");
    }

    //get + set

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getEmailas() {
        return emailas;
    }

    public void setEmailas(String emailas) {
        this.emailas = emailas;
    }

    public Adresas getAdresas() {
        return adresas;
    }

    public void setAdresas(Adresas adresas) {
        this.adresas = adresas;
    }
}
