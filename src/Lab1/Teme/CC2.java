package Lab1.Teme;

public class CC2 {
    public static int check(int number, int digit)
    {
        int val,nr=0;
        while(number>0)
        {
            val=number%10;
            if(val==digit) nr++;
            number=number/10;
        }
        return nr;
    }
    public static int check0(int number)
    {
        int val,nr=0;
        while(number>0)
        {
            val=number%10;
            if(val==0) nr++;
            number=number/10;
        }
        return nr;
    }
    public static String compute(int number) {
        int nr=check(number,3),ok=0;
        String num="";
        while(nr>0)
        {
            num=num+"Foo";
            nr--;
            ok=1;
        }
        nr=check(number,5);
        while(nr>0)
        {
            num=num+"Bar";
            nr--;
            ok=1;
        }
        nr=check(number,7);
        while(nr>0)
        {
            num=num+"Qix";
            nr--;
            ok=1;
        }
        if(number%3 == 0) num=num+"Foo";
        else if(number%5 == 0) num=num+"Bar";
        else if(number%7 == 0) num=num+"Qix";
        else if(ok == 0) num= String.valueOf(number);
        return num;
    }

    public static String compute2(int number){
        String nr=compute(number);
        if(number ==  Integer.parseInt(nr))
            nr=nr.replaceAll("0", "*");
        else{
            int num=check0(number);
            while (num > 0) {
                nr=nr+"*";
                num--;
            }
        }
        return nr;
    }
}
