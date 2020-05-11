package Lab5.io.CC2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mesaj {
    public Mesaj(String path){
        char[] chars=readMessage(path);
        for(char c:chars){
            if(Character.isUpperCase(c))
                System.out.println(c);
        }
    }

    public char[] readMessage(String filePath){
        char[] chars=new char[1000];
        try {
            BufferedReader br=new BufferedReader(new FileReader(filePath));
            int c;
            int i=0;
            while((c=br.read())!=-1){
                    chars[i++]=(char)c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chars;
    }
}
