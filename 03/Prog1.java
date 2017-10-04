import java.lang.*;
import java.util.*;
import java.io.*;

public class Prog1{

    public static void main(String [] args){
        InputStream in = System.in;
        OutputStream out = System.out;

        try{

            int b = in.read();

            while(b != -1){
                out.write(b);
                b = in.read();
            }


        } catch(IOException e){
        }   
    }
}

