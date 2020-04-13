package Lab1;

public class Main {
    private static int semster=2; //instanta de clasa/ var de clasa
    private int instanceVar=3; // var de instanta unica pt toate instantele clasei

    public static void main(String[] args) {
        int var = 2020;
        System.out.println("Atelier digital "+var);
        System.out.println("Day 1 "+semster);
        System.out.println(CC2.compute(13));
        System.out.println(CC2.compute2(303));
    }
}
