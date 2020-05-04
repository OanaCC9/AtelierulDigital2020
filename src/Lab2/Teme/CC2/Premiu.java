package Lab2.Teme.CC2;

public class Premiu {
    String nume;
    Integer an;

    public Premiu(String nume, int an){
        this.nume=nume;
        this.an=an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void afisare(){
        System.out.print(" premiul "+getNume()+" in anul "+getAn());
    }
    public String toString(){
        return " premiul "+getNume()+" oferit in "+getAn();
    }


}
