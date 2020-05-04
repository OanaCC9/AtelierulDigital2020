package Lab2.Teme.CC3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs)
    {
        this.legs=legs;
    }

    public abstract String eat();

    public void walk(int legs){
        if(legs==0)
            System.out.println("swims");
        else if(legs==2)
            System.out.println("walks on "+legs+" legs");
        else if(legs==4)
            System.out.println("walks on "+legs+" legs");
        else
            System.out.println("walks on "+legs+" legs");
    }
}
