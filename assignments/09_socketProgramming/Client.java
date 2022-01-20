 import java.net.Socket;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.DataInputStream;

class Client{


    public static String getMessage(){

        System.out.print("-:");
        String message = new Scanner(System.in).nextLine();
        return message;

    }
	
    public static void main(String[] args){
	
    	try{
	
    		System.out.println("Connecting to server........");
	
			Socket socket = new Socket("localhost",6666);
	
			System.out.println("Connection Established Sucessfully!\n Ready to send message");
	
			DataOutputStream send = new DataOutputStream(socket.getOutputStream());
			DataInputStream received = new DataInputStream(socket.getInputStream());
			
			String input = "";


			while(true){

 				send.writeUTF(getMessage());
				send.flush();
    
				input = received.readUTF();
				System.out.println(input);
            

			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}