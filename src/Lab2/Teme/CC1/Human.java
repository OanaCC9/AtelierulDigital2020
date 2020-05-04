package Lab2.Teme.CC1;

public class Human {
    private String name;
    private int health;

    public Human(String name, int health){
        this.name=name;
        this.health=health;
    }

    public String getName() {
        return name;
    }


    public int getHealth() {
        return health;
    }


    public  void decreaseHealth(int damage){
        health=health-damage;
    }


}
