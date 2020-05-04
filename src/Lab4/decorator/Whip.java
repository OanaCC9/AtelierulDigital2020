package Lab4.decorator;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        super("White wip",1, beverage);
    }
}
