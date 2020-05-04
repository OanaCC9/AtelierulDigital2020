package Lab2.Teme.CC2;

import java.util.Arrays;

public class Film {
    Integer anAparitie;
    String nume;
    Actor [] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    public void afisare(){
        System.out.print(" filmul: "+getNume()+", aparut in "+getAnAparitie()+", actori "+getActori());
    }

    public String toString(){
        return " filmul: "+getNume()+", aparut in "+getAnAparitie()+", actori "+ Arrays.toString(getActori());
    }
}
