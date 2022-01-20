import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;

class Server{

    public static String getMessage(){
        
        String message = new Scanner(System.in).nextLine();
        return message;

    }


	public static void main(String[] args){ 

		try{
		
			ServerSocket serverSocket = new ServerSocket(6666);

			System.out.println("listening for client ");
			Socket socket = serverSocket.accept();
			System.out.println("Connected.");

			DataInputStream  received= new DataInputStream(socket.getInputStream());
			DataOutputStream send = new DataOutputStream(socket.getOutputStream());
			String input = "";

			while(true){

				input = (String)received.readUTF();
				System.out.println(input);
			
				System.out.print("-: ");
				send.writeUTF(getMessage());
				send.flush();

			}

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}