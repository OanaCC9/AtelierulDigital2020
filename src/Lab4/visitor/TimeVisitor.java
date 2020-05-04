package Lab4.visitor;

public class TimeVisitor implements Visitor{
    private int totalTime;

    public void visit(Element[] elemente){
        for(Element e:elemente){
            e.accept(this);
        }

    }

    public void visit(Book book){
        totalTime += book.getNumberOfPages()*10;
    }


    public void visit(Element e) {
    }

    public void visit(Video video){
        totalTime += video.getCost();
    }

    public void visit(Audio audio){
        totalTime += audio.getCost();
    }
}

