import java.io.*;
import java.lang.*;
import java.util.*;

public class Prog3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        try{
            while(sc.hasNextLine()){

                String line = sc.nextLine();
                line = line.toUpperCase();
                System.out.println(line);
            }
        } catch(NoSuchElementException e){
        }
        

    }
}
