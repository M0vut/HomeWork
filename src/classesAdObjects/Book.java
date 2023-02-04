package classesAdObjects;

public class Book {
   private String author;
   private int age;
    public Book(String author, int age){
        this.author = author;
        this.age = age;
    }
    public String getName(){
        return this.author;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
