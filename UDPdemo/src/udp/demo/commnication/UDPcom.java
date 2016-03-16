package udp.demo.commnication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPcom {
	//private static final int TIMEOUT =60000;
	private static final int MAXTRIES=100;
	private static final int PORT=4242;
	private static final String bRoadcast="255.255.255.255";
	private static DatagramSocket socket;

	public static void main(String[] args) throws IllegalAccessException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		InetAddress serverAdress = InetAddress.getByName(bRoadcast); //local server
		String dataTosend= new String("Hello and greetings from net service");
		byte[] byteTosend=dataTosend.getBytes();
				socket = new DatagramSocket();
				//socket.setSoTimeout(TIMEOUT); //maximum receiver blocking 
				DatagramPacket sendPacket= new DatagramPacket(byteTosend,byteTosend.length,serverAdress,PORT);
				for(int i=0;i<MAXTRIES;i++){
					socket.send(sendPacket);
					
					//socket.wait(TIMEOUT);
					
				}
				System.out.println("Data has sent");
				
				
				
				socket.close();

	}

}
