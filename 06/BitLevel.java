import java.io.*;
import java.util.Scanner;

public class BitLevel {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter encryption key:");
            String line = scan.nextLine();
            FileInputStream in = new FileInputStream(new File(args[0]));
            FileOutputStream out = new FileOutputStream(new File (args[1]));
            int b = in.read();
            StringBuilder str = new StringBuilder();
            int i = 0;
            while (b != -1) {
                if(i == line.length()) {
                    i = 0;
                }
                int test = (char)b ^ line.charAt(i);
                out.write(test);
                b = in.read();
                i++;
            }
            in.close();
            out.close(); 
        }catch(IOException e) {
            System.err.println(e);
        }  
    }
}
