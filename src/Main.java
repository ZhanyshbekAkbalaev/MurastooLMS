public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zhanyshbek","Belgilendi");
        System.out.println(person);
        System.out.println(person.learn());
        System.out.println(person.walk());

        Programmer  programmer= new Programmer("RSK bank");
        System.out.println(programmer);
        System.out.println(programmer.codding());

        Dancer dancer = new Dancer("Ak kuu");
        System.out.println(dancer);
        System.out.println(dancer.dancing());

        Singer singer = new Singer("Gitarno","Ekekatko","Getarno");
        System.out.println(singer);
        System.out.println(singer.singing());
        System.out.println(singer.playGitar());


    }
}