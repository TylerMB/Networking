import java.io.*;

public class Caesar {

    public static void main(String [] args) {
        try {
            int shift = Integer.parseInt(args[0]);
            int input = System.in.read();
            if (shift > 255) {
                shift = shift % 255;
            }
            while (input != -1) {
                int encoded = input+shift;    
                if (encoded > 255) {
                    encoded = encoded - 256;
                }else if (encoded < 0) {
                    encoded = 256 + encoded;
                }
                System.out.write((char)encoded);
                input = System.in.read();
            }
            System.out.flush();
        }catch (IOException ex) {
            System.err.println("ERROR");
        }
    }
}
