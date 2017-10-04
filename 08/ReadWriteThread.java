import java.io.*;

public class ReadWriteThread extends Thread{
    
    private BufferedReader input;
    private PrintWriter output;
    private String str;

    public ReadWriteThread(InputStream input, OutputStream output, String str){
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = new PrintWriter(output, true);
        this.str = str;
    }

    public void run() {
        try {
            String line;
            while((line = input.readLine()) != null) {
                output.println(str+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
