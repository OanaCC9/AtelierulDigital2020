package Lab2.Teme.CC2;

import java.util.Arrays;

public class Studio{
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme){
        this.nume=nume;
        this.filme=filme;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public void afisare(){
        System.out.print("Studioul "+getNume()+" a produs: "+ Arrays.toString(getFilme()));
    }

    public String toString(){
        return "Studioul "+getNume()+" a produs: "+ Arrays.toString(getFilme());
    }
}
