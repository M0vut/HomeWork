package classesAdObjects;

public class HomeWork {
    public static void main(String[] args) {
        Author pushkin = new Author("Пушкин","Александр");
        Author bulgakov = new Author("Булгаков","Михаил");

        Book ruslanAndLyudmila = new Book(1821,pushkin, "Руслан и Людмила");
        Book theMasterAndMargarita = new Book(1966, bulgakov, "Мастер и Маргарита");
        ruslanAndLyudmila.setAge(1820);
        sout(ruslanAndLyudmila);
        sout(theMasterAndMargarita);

        System.out.println(ruslanAndLyudmila);
        System.out.println(theMasterAndMargarita);
        }

        static void sout(Book book){
            System.out.println(
              "Автор " + book.getAuthor().getName() + " " + book.getAuthor().getSurName() + " книга " + book.getBookTitle()
                    + " первое издание " + book.getAge()
            );
        }


}
