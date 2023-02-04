package classesAdObjects;

public class HomeWork {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 1997);
        Author author = new Author("Джоан", "Кетлин");
        System.out.println("harryPotter.name = " + harryPotter.name);
        System.out.println("harryPotter.age = " + harryPotter.age);
        System.out.println("author.lastName = " + author.lastName);
        System.out.println("author.firstName = " + author.firstName);

        harryPotter.setAge(2000);
        System.out.println("harryPotter.age = " + harryPotter.age);

        Book goldenDonkey = new Book("Золотой осел", 200);
        Author apuleius = new Author("Луций", "Апулей");
        System.out.println("goldenDonkey.name = " + goldenDonkey.name);
        System.out.println("goldenDonkey.age = " + goldenDonkey.age);
        System.out.println("apuleius.firstName = " + apuleius.firstName);
        System.out.println("apuleius.lastName = " + apuleius.lastName);

        System.out.println();

    }
}
