package Lab2.Teme.CC3;

public class Fish extends Animal implements Pet{

    public Fish(int legs){
        super(legs);
        legs=0;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}
