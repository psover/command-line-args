import java.io.*;
public class args{
	public static void main (String args[]) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
	 		
			while((input=br.readLine())!=null){
				System.out.println(input);
		}
 
		}catch(IOException io){
			io.printStackTrace();
		}
	}	
}
