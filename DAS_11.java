import java.util.HashSet;
import java.util.Scanner;

public class DAS_11{
	 public static void main(String[] args) {
		
		//Declarartion
		boolean unique = true;
		Scanner sc = new Scanner(System.in);
		HashSet<Character> hset = new HashSet<Character>();
		String ustring = "";//if string is empty then it is already unique

		//Getting input from the user 
		try{
			ustring = sc.next();
		}
		catch(Exception e){
			System.out.println("Exception Occured. Please enter a valid string format");
			e.printStackTrace();
		}

		// //logic to check if given string contains all unique chars or not
		// int slength = ustring.length();
		// for(int i=0; i<slength; ++i){
		// 	Character c = ustring.charAt(i);
		// 	if(hset.contains(c)){
		// 		System.out.println("String contains duplicate characters");
		// 		unique = false;
		// 		break;
		// 	}
		// 	else{
		// 		hset.add(c);
		// 	}
		// }


		unique = isUniqueChar(ustring);
		System.out.println( (unique)?"String contains all unique characters!": "String contains duplicate characters");

	}


	public static boolean isUniqueChar(String str){
		//boolean[] char_set = new boolean[256];//represents 256 ascii char set
		int checker = 0;
		for(int i=0; i<str.length(); ++i){
			int val = str.charAt(i) - 'a';
			if( checker & (1<<val) ) return false;
			checker |= (1<<val);
		}
		return true;
	}
}