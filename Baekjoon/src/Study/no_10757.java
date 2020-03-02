package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class no_10757 {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 
	        String []inputs = br.readLine().split(" ");
	        String A = inputs[0];
	        String B = inputs[1];
	 
	        BigInteger a = new BigInteger(A);
	        BigInteger b = new BigInteger(B);
	        System.out.println(a.add(b).toString());
	 

	}

}
