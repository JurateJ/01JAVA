package objJJ.intro;

public class Mokinas {

//    private String name;  //null default
    private String firstName;
    private String lastName;
    private int level;   //0  default
    private String address;  //null default

    public Mokinas(String firstName, String lastName) {
        getName(firstName, lastName);
        this.level = 1;    // galima ir nurodyt this, bet nera
    }
    public Mokinas(String firstName, String lastName, int level) {
        this(firstName, lastName);
//        if (name == null || name.length() <= 1) {
//            throw new IllegalArgumentException("Neteisngas vardas");
//        }
    }
    //Geteriai ir seteriai
//    public String getName() {
//        return name;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() <=1) {
            throw new IllegalArgumentException("Neteisngas vardas");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() <=1) {
            throw new IllegalArgumentException("Neteisngas vardas");
        }
        this.lastName = lastName;
    }

//    public void setName(String name) {
//        if (name == null || name.length() <=1) {
//            throw new IllegalArgumentException("Neteisngas vardas");
//        }
//        this.name = name;
//    }

    //geteriai ir seteriai
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
