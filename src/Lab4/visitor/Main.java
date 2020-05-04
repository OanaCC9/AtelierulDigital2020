package Lab4.visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements=new Element[4];

        Book book=new Book(10,31);
        Book book2=new Book(100,4);
        Video video=new Video(23,4);
        Audio audio=new Audio(23,3);

        elements[0]=book;
        elements[1]=audio;
        elements[2]=book2;
        elements[3]=video;

        Visitor visitor=new CostVisitor();

        visitor.visit(elements);
        System.out.println(((CostVisitor)visitor).getTotalCost());



    }
}
