import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite a palavra: ");
		String letras = teclado.next();
		System.out.println(shuffleString(letras)); 

        teclado.close();
	
	 }
	
	public static String shuffleString(String s) {
	    List<String> letras = new ArrayList<String>();
	    String temp = "";

	    for (int i = 0; i < s.length(); i++) {
	    	letras.add(String.valueOf(s.charAt(i)));
	    }
	    System.out.println("");

	    Collections.shuffle(letras);

	    for (int i = 0; i < s.length(); i++) {
	        temp += letras.get(i);
	    }
	    return temp;
	}

}