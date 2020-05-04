package Lab1;

import java.util.Scanner;

public class CC4 {
    private static boolean isPair(int a, int b, int c){
        if(a+b+c==0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numar_de_elem_vector=scan.nextInt();
        int [] a=new int[numar_de_elem_vector];
        int i=0,contor=0;
        while (i<numar_de_elem_vector)
        {
            int element=scan.nextInt();
            a[i++]=element;
        }
        for(int j=0;j<a.length-2;j++)
        {
            for(int k=j+1;k<a.length-1;k++)
            {
                for(int x=k+1;x<a.length;x++)
                {
                    if(isPair(j,k,x)==true)
                    {
                        contor++;
                        a = ArrayUtils.remove(a, x);
                    }
                    a = ArrayUtils.remove(a, x);
                }
            }
        }
        System.out.println(contor);
    }
}
