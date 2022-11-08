public class Dancer extends Person{
    private String grupName;

    public Dancer(String grupName) {
        this.grupName = grupName;
    }

    public Dancer(String name, String designation, String grupName) {
        super(name, designation);
        this.grupName = grupName;
    }

    public String getGrupName() {
        return grupName;
    }

    public void setGrupName(String grupName) {
        this.grupName = grupName;
    }
    public String dancing(){return"Biyleit";}

    @Override
    public String toString() {
        return "Dancer{" +
                "grupName='" + grupName + '\'' +
                '}';
    }
}

