package Lab5.io.CC1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb=new PhoneBook("./src/Lab5/io/phoneBook.txt");
        System.out.println(pb);

        System.out.println(pb.getNumberByName("Oana"));
    }
}
