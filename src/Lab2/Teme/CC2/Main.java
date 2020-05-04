package Lab2.Teme.CC2;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("Oscar", 1990);
        Premiu oscar2000 = new Premiu("Oscar", 2000);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2018 = new Premiu("Oscar", 2018);
        //System.out.println(oscar1990);

        Actor a1=new Actor("Leonardo DiCaprio",45,new Premiu[]{oscar2018});
        Actor a2=new Actor("Joaquin Phoenix",45,new Premiu[]{oscar2018});
        Actor a3=new Actor("Meryl Streep",70,new Premiu[]{oscar1990});
        Actor a4=new Actor("Renée Zellweger",51,new Premiu[]{oscar1990});
        Actor a5=new Actor("Al Pacino",80,new Premiu[]{oscar2000});
        Actor a6=new Actor("Denzel Washington",65,new Premiu[]{oscar2010});
        //System.out.println(a1);


        Film f1=new Film(2013, "The Wolf of Wall Street", new Actor[]{a1,a3});
        Film f2=new Film(2019, "Joker", new Actor[]{a2});
        Film f3=new Film(2019, "Judy", new Actor[]{a4});
        Film f4=new Film(1972, "The Godfather", new Actor[]{a5});
        Film f5=new Film(2007, "American Gangsters", new Actor[]{a6});
        //System.out.println(f1);

        Studio s1=new Studio("MGM", new Film[]{f1,f2});
        Studio s2=new Studio("Disney", new Film[]{f3,f4,f5});
        //System.out.println(s1);

        Studio [] studios=new Studio[]{s1,s2};
        for(Studio s:studios)
        {
            System.out.println(s);
            if(s.getFilme().length>2){
                System.out.println("\nStudioul "+s.getNume()+" a produs mai mult de 2 filme");
            }
        }

    }

}
