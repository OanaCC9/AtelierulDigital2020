package Lab1.Teme;

import java.util.Scanner;
//import org.apache.commons.lang.ArrayUtils;


public class CC3 {
    private static boolean isPair(int a, int b){
        if(a+b==0)
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
        for(int j=0;j<a.length-1;j++)
        {
            for(int k=j+1;k<a.length;k++)
            {
                if(isPair(j,k)==true)
                {
                    contor++;
                    //a = ArrayUtils.remove(a, k);
                }
            }
        }
        System.out.println(contor);
    }
}
