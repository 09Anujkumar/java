import java.net.*;
import java.io.*;
public class Q34cli{
public static void main(String...S)throws IOException{
	Socket s=null;
	BufferedReader b=null;
	try{
		s=new Socket(InetAddress.getLocalHost(),98);
		b=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	catch(UnknownHostException u){
		System.err.println("I don't know the host");
		System.exit(0);
	}
	String inp;
	while((inp=b.readLine())!=null){
		System.out.println(inp);
	}
	b.close();
	s.close();
}
}