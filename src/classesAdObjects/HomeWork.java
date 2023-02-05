package classesAdObjects;

public class HomeWork {
    public static void main(String[] args) {
        Book harryPotter = new Book("Гарри Поттер",1997);
        Author author = new Author("Джоан", "Кетлин");
        System.out.println("harryPotter.name = " + harryPotter.getName());
        System.out.println("harryPotter.age = " + harryPotter.getAge());
        System.out.println("author.lastName = " + author.getLastName());
        System.out.println("author.firstName = " + author.getFirstName());

        harryPotter.setAge(2000);
        System.out.println("harryPotter.age = " + harryPotter.getAge());

        Book goldenDonkey = new Book("Золотой осел",200);
        Author apuleius = new Author("Луций", "Апулей");
        System.out.println("goldenDonkey.name = " + goldenDonkey.getName());
        System.out.println("goldenDonkey.age = " + goldenDonkey.getAge());
        System.out.println("apuleius.firstName = " + apuleius.getFirstName());
        System.out.println("apuleius.lastName = " + apuleius.getLastName());



    }
}
