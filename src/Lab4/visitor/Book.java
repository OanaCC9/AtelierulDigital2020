package Lab4.visitor;

public class Book implements Element{
    private int numberOfPages;
    private int cost;

    public Book(int numberOfPages, int cost){
        this.numberOfPages=numberOfPages;
        this.cost=cost;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void visit(Visitor v){
        v.visit(this);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
