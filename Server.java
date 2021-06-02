import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args){
        ServerSocket server = null;
        try{
            server= new ServerSocket(Integer.parseInt(args[0]));
        }catch(Exception e){ }
        while(true) {
            Socket client = null;
            PrintStream output = null;
            DataInputStream input = null;
            try {
                client = server.accept();
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                output = new PrintStream(client.getOutputStream());
                input = new DataInputStream(client.getInputStream());
            } catch (Exception e) {
                System.out.println(e);
            }
            output.println("Enter the filename:");
            try {
                @SuppressWarnings("deprecation")
                String filename = input.readLine();
                System.out.println("Client requested file:" + filename);
                try {
                    File f = new File(filename);
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String data;
                    while ((data = br.readLine()) != null) {
                        output.println(data);
                    }
                } catch (FileNotFoundException e) {
                    output.println("File not found.");
                }
                client.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

