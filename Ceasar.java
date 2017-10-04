import java.io.*;

public class Ceasar{


    public static void main(String [] args){

        String encrypt = "";
        try{
            
            while(System.in.read() != -1){
                int bit = (System.in.read() + Integer.parseInt(args[0])) % 255;
                char letter = (char) bit;
                System.out.write(letter);
            }
        } catch (IOException e){
            System.err.println("file not found");
        }
        
    }
}
