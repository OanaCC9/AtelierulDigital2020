package Lab2.Teme.CC2;

import java.util.Arrays;

public class Actor {
    String nume;
    Integer varsta;
    Premiu [] premiu = new Premiu[2];

    public Actor(String nume, Integer varsta, Premiu[] premiu)
    {
        this.nume=nume;
        this.varsta=varsta;
        this.premiu=premiu;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremiu() {
        return premiu;
    }

    public void setPremiu(Premiu[] p) {
        premiu = p;
    }

    public void afisare(){
        System.out.print(" actorul "+getNume()+", in varsta de "+getVarsta()+" ani, a castigat premiile: "+ Arrays.toString(getPremiu()));
    }

    public String toString(){
        return " actorul "+getNume()+", in varsta de "+getVarsta()+" ani, a castigat premiile: "+ Arrays.toString(premiu);
    }
}
