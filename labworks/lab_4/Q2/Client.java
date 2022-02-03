
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;

class Client{
public static void main(String[] args){
    
    try{
        System.out.println("Connecting to the server........");
        Socket socket = new Socket("localhost",6666);

        System.out.println("Connected to server....");
        DataInputStream dis =  new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        String Message = "This is the message from the client.";

        dos.writeUTF(Message);
        dos.flush();    

    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}