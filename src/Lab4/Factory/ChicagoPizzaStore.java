package Lab4.Factory;

public class ChicagoPizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("Pepper")){
            pizza=new ChicagoPepperPizza();
        } else
        if(type.equals("Dracula")){
            pizza=new ChicagoDraculaPizza();
        }
        return pizza;
    }
}
