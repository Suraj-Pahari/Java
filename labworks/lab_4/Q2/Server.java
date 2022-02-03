import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.io.DataInputStream;


class Server{
    public static void main(String[] args){
        try{

            System.out.println("listening for Client.....");
            ServerSocket ss = new ServerSocket(6666);
        
            Socket socket = ss.accept();
            System.out.println("Client found...");
            
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String message = (String)dis.readUTF();

            System.out.println(message);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}