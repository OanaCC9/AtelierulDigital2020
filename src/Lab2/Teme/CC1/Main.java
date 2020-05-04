package Lab2.Teme.CC1;

import Lab2.Teme.CC1.BoxingMatch;
import Lab2.Teme.CC1.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Sam", 10,5);
        Fighter f2=new Fighter("Dean", 30,1);
        Fighter f3=new Fighter("Sam", 10,1);

        if(f1.equals(f3))
            System.out.println("f1=f3");
        else
            System.out.println("f1!=f3");

        BoxingMatch bm=new BoxingMatch(f1,f2);
        System.out.println("f1 Vs f2 : "+bm.fight());
    }
}
