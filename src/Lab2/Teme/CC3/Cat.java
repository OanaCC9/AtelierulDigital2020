package Lab2.Teme.CC3;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String nume, int legs)
    {
        super(legs);
        this.legs=4;
        this.name=name;
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
