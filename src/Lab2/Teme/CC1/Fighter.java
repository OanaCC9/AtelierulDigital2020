package Lab2.Teme.CC1;

import java.util.Objects;

public class Fighter extends Human {
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack){
        super(name,health);
        this.damagePerAttack=damagePerAttack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return damagePerAttack == fighter.damagePerAttack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damagePerAttack);
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }





}
