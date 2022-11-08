public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName= bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String singing(){return"Yrdait";}
    public String  playGitar(){return"Gitara cherter";}

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}

