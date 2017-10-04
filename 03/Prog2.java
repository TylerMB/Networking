import java.lang.*;
import java.util.*;
import java.io.*;

public class Prog2{

    public static void main(String [] args){
        InputStream in = System.in;
        OutputStream out = System.out;

        BufferedReader buff = new BufferedReader(new InputStreamReader(in));
        
        try{

            String line = "";

            while((line = buff.readLine()) != null){
                StringBuilder sb = new StringBuilder(line);
                System.out.println(sb.reverse().toString());
            }


        } catch(IOException e){
        }   
    }
}

