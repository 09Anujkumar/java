import java.net.*;
import java.io.*;
public class Q34serv{
public static void main(String...S)throws IOException{
	ServerSocket s1=null;
	try{
		s1=new ServerSocket(98);
	}
	catch(IOException u1){
		System.err.println("could not found port 98");
		System.exit(1);
	}
	Socket c=null;
	try{
		c=s1.accept();
		System.out.println("connection from"+c);
	}
	catch(IOException e){
		System.out.println("accept failed");
		System.exit(1);
	}
	PrintWriter out=new PrintWriter(c.getOutputStream(),true);
	BufferedReader in=new BufferedReader(new InputStreamReader(c.getInputStream()));
	String I;
	BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("I am ready to type now");
	while((I=sin.readLine())!=null){
		out.println(I);
	}
	out.close();
	sin.close();
	c.close();
	s1.close();
}
}