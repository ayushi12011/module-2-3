package Module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Question32 {
	 public static void main(String[] args) {  
		   
	        new Thread(new SimpleServer()).start();  
	    }  
	   
	    static class SimpleServer implements Runnable {  
	   
	        @Override  
	        public void new Runnable() {
				{
					Runnable runnable = new MyRunnable();    
					  
					Thread thread = new Thread(runnable);  
					Thread.State();  
				}
	 {  
	   
	            ServerSocket serverSocket = null;  
	            while (true) {  
	                   
	                try {  
	                    serverSocket = new ServerSocket(3333);  
	   
	                    Socket clientSocket = serverSocket.accept();  
	   
	                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
	                       
	                    System.out.println("Client said :"+inputReader.readLine());  
	                      
	   
	                } catch (IOException e) {  
	                    e.printStackTrace();  
	                }finally{  
	                    try {  
	                        serverSocket.close();  
	                       
	                    } catch (IOException e) {  
	                        e.printStackTrace();  
	                    }  
	                }  
	            }  
	   
	        }  
	   
	    }  
	    }
}
